package hello.controller;

import hello.model.Note;
import hello.service.NoteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//GIT TEST2

@EnableAutoConfiguration
@RestController
public class NoteController {

    //find the bean then inject them into this class 
    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/note", method = RequestMethod.GET, produces = "application/json")
    public List<Note> GetNotesController() {
        return noteService.getNotes();
    }

    @RequestMapping(value = "/note", method = RequestMethod.POST, produces = "application/json")
    public void PostNoteController(@RequestBody Note note) {
        noteService.postNote(note);
    }
}
