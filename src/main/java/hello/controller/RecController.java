package hello.controller;

import hello.model.Receipt;
import hello.repository.RecRepository;
import hello.service.NoteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class RecController {

    // find the bean then injecting them into this class
    @Autowired
    private RecRepository rec;

    @RequestMapping(value = "/receipt", method = RequestMethod.GET, produces = "application/json")
    public List<Receipt> GetRec() {
        return rec.findAll();
    }

    @RequestMapping(value = "/receipt", method = RequestMethod.POST, produces = "application/json")
    public void PostNoteController(@RequestBody Receipt receipt) {
        rec.save(receipt);
    }
}
