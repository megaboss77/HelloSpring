package hello.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.model.Pet;



@EnableAutoConfiguration
@RestController
public class HelloController {

    @RequestMapping("/pet")
    public Pet GetPet() {
        Pet a = new Pet("cat",16);
        return a;
    }

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

}
