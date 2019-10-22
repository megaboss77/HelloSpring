package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
