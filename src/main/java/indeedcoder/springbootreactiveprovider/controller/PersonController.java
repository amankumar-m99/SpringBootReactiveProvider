package indeedcoder.springbootreactiveprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import indeedcoder.springbootreactiveprovider.entity.Person;
import indeedcoder.springbootreactiveprovider.service.PersonService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService service;

	@PostMapping("")
	public Mono<Person> savePerson(@RequestBody Person person) {
		return service.savePerson(person);
	}

	@GetMapping("/all")
	public Flux<Person> getAllPersons() {
		return service.findAllPersons();
	}

	@GetMapping("/{id}")
	public Mono<Person> getPersonById(@PathVariable String id) {
		return service.findById(id);
	}

	@DeleteMapping("/{id}")
	public Mono<Void> removePersonById(@PathVariable String id) {
		return service.deleteById(id);
	}

}
