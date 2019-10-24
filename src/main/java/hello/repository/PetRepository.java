package hello.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import hello.model.Pet;

public interface PetRepository extends MongoRepository<Pet, String> {
    public List<Pet> findByName(String name);
    public List<Pet> findByAge(int age);

}