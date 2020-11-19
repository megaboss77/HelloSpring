package hello.controller;

import hello.model.Note;
import hello.service.NoteService;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class NoteController {

    private static final Logger log = LoggerFactory.getLogger(NoteController.class);

    // find the bean then injecting them into this class
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

    @RequestMapping(value = "/log", method = RequestMethod.GET, produces = "application/json")
    public String logController() {
        log.info("this is log info test");
        return "log";
    }
}
