package indeedcoder.springbootreactiveprovider.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import indeedcoder.springbootreactiveprovider.entity.Person;

public interface PersonRepository extends ReactiveMongoRepository<Person, String>{


}
