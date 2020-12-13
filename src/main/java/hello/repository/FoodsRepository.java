package hello.repository;

import hello.model.Data;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodsRepository extends MongoRepository<Data, String> {
}