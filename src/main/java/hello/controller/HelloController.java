package hello.controller;

import hello.model.Pet;
import hello.repository.*;
import java.util.List;
import javax.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@EnableAutoConfiguration
@RestController
public class HelloController {

    @Autowired
    private PetRepository repository;

    // get all pet
    @RequestMapping(value = "/pet"
    , method = RequestMethod.GET
    , produces = "application/json")
    public List<Pet> getPet() {
        List<Pet> pets = repository.findAll();
        return pets;
    }

    // get one pet
    @RequestMapping(value = "/pet/name/{petName}", method = RequestMethod.GET, produces = "application/json")
    public List<Pet> getPetByName(@NotBlank @PathVariable(value = "petName") String petName) {
        List<Pet> pets = repository.findByName(petName);
        return pets;
    }

    @RequestMapping(value = "pet/{petId}", method = RequestMethod.GET, produces = "application/json")
    public Pet getPetById(@PathVariable String petId) {
        return repository.findById(petId).get();
    }

    // post pet
    @RequestMapping(value = "/pet", method = RequestMethod.POST, produces = "application/json")
    public Pet postPet(@RequestBody Pet pet) {
        return repository.save(pet);
    }

    @RequestMapping(value = "/pet/{petId}", method = RequestMethod.DELETE, produces = "application/json")
    public void deletePet(@PathVariable String petId) {
        repository.deleteById(petId);
    }

    @PutMapping("/pet/{id}")
    public Pet putPet(@NotBlank @PathVariable String id, @RequestBody Pet newPet) {
        repository.findById(id).map(pet -> {
            pet.setName(newPet.getName());
            pet.setAge(newPet.getAge());
            return repository.save(pet);
        });
        return newPet;

    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String index() {
        return "Hello World";
    }

}
