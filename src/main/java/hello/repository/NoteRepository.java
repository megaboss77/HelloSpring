package hello.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import hello.model.Note;

public interface NoteRepository extends MongoRepository<Note, String> {
    public List<Note> findByTopic(String topic);
}