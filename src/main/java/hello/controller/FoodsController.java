package hello.controller;

import hello.model.Data;
import hello.repository.FoodsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@EnableAutoConfiguration
@RestController
public class FoodsController {

    private static final Logger log = LoggerFactory.getLogger(FoodsController.class);

    @Autowired
    private FoodsRepository foodsRepository;


    @RequestMapping(value = "/food", method = RequestMethod.GET, produces = "application/json")
    public List<Data> GetNotesController() {
        return foodsRepository.findAll();
    }

    @RequestMapping(value = "/food", method = RequestMethod.POST, produces = "application/json")
    public void PostNoteController(@RequestBody Data data) {
        foodsRepository.save(data);
    }

    @RequestMapping(value = "/randomFood", method = RequestMethod.GET, produces = "application/json")
    public String getFood() {
        Optional<Data> resList = foodsRepository.findById("res");
        if (resList.isPresent()) {
            Data resLists = resList.get();
            List<String> resListss = resLists.getFood();
            Random rand = new Random();
            return resListss.get(rand.nextInt(resListss.size()));
        } else {
            return null;
        }
    }
    @RequestMapping(value = "/restaurants", method = RequestMethod.GET, produces = "application/json")
    public List<String> getAllFood() {
        Optional<Data> resList = foodsRepository.findById("res");
        if (resList.isPresent()) {
            Data resLists = resList.get();
            List<String> resListss = resLists.getFood();
            return resListss;
        } else {
            return null;
        }
    }
    @RequestMapping(value = "/restaurants/{name}", method = RequestMethod.GET, produces = "application/json")
    public List<String> addFood(@PathVariable("name") String name) {
        Optional<Data> resList = foodsRepository.findById("res");
        if (resList.isPresent()) {
            Data resLists = resList.get();
            List<String> resListss = resLists.getFood();
            resListss.add(name);
            foodsRepository.save(resLists);
            return resListss;
        } else {
            return null;
        }
    }
}
