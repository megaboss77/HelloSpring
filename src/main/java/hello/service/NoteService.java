package hello.service;

import hello.model.Note;
import hello.repository.NoteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class NoteService{
    //find the bean then inject them into this class 
    @Autowired
    private NoteRepository noteRepository;   

    public List<Note> getNotes(){
        return noteRepository.findAll();
    }

    public void postNote(Note note){
        noteRepository.save(note);
    }

    //GIT test

}