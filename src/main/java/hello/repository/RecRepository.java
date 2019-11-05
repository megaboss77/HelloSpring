package hello.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import hello.model.Receipt;

public interface RecRepository extends MongoRepository<Receipt, String> {
    // public List<Receipt> findByName(String name);
    // public List<Receipt> findByAge(int age);

}