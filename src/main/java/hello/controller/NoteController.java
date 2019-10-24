package hello.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hello.NoteRepository;
import hello.model.Note;


@EnableAutoConfiguration
@RestController
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @RequestMapping(value="/note", method = RequestMethod.GET, produces= "application/json")
    public List<Note> GetNotes(){
        List<Note> notes = noteRepository.findAll();
        return notes;
    }

      
    @RequestMapping(value = "/note", method = RequestMethod.POST, produces = "application/json")
    //@PostMapping("/pet")
    public Note PostPet(@RequestBody Note note) {
        return noteRepository.save(note);
    }
}