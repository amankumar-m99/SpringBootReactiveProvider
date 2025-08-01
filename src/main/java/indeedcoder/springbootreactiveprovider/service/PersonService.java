package indeedcoder.springbootreactiveprovider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indeedcoder.springbootreactiveprovider.entity.Person;
import indeedcoder.springbootreactiveprovider.repository.PersonRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;

	public Mono<Person> savePerson(Person person) {
		return repository.save(person).switchIfEmpty(Mono.empty());
	}

	public Mono<Person> findById(String id) {
		return repository.findById(id);
	}

	public Flux<Person> findAllPersons() {
		return repository.findAll().switchIfEmpty(Flux.empty());
	}

	public Mono<Void> deleteById(String id) {
		if(findById(id) != null) {
//			return Mono.just("Deleted");
		}
		else {
//			return Mono.just("Not Exists");
		}
		return repository.deleteById(id);
	}
}
