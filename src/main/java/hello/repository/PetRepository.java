package hello.repository;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;

import hello.model.Pet;

public interface PetRepository extends MongoRepository<Pet, String> {
    public List<Pet> findByName(String name);

    public List<Pet> findByAge(long age);

    public List<Pet> findByNameAndAge(String name, long age);

    public List<Pet> findByNameAndId(String name, long id);

    public List<Pet> findByNameOrNameIsNull(String name);

}