package hello.repository;

import hello.model.Data;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface FoodsRepository extends MongoRepository<Data, String> {
}