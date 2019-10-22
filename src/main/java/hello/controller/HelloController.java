package hello.controller;

import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hello.PetRepository;
import hello.model.Pet;

@EnableAutoConfiguration
@RestController
public class HelloController {

    @Autowired
    private PetRepository repository;

    // get all pet
    @RequestMapping("/pet")
    public List<Pet> GetPet() {
        for (Pet pet : repository.findAll()) {
            System.out.println(pet);
        }
        // Pet a = new Pet("cat",16);
        List<Pet> pets = repository.findAll();
        return pets;
    }

    // get one pet
    @RequestMapping(value = "/pet/name/{petName}", method = RequestMethod.GET, produces = "application/json")
    public List<Pet> GetPetByName(@NotBlank @PathVariable(value = "petName") String petName) {
        List<Pet> pets = repository.findByName(petName);
        return pets;
    }

    @RequestMapping("pet/{petId}")
    public Pet GetPetById(@PathVariable String petId) {
        return repository.findById(petId).get();
    }

    //post pet 
    //@RequestMapping(value = "/pet", method = RequestMethod.POST, produces = "application/json")
    @PostMapping("/pet")
    public Pet PostPet(@RequestBody Pet pet) {
        return repository.save(pet);
    }

    @DeleteMapping("/pet/{petId}")
    public void DeletePet(
        @PathVariable String petId
    ){
        repository.deleteById(petId);
    }

    @PutMapping("/pet/{id}")
    public Pet PutPet(
        @NotBlank
        @PathVariable String id,
        @RequestBody Pet newPet
    ){
        repository.findById(id).map(pet -> {
        pet.setName(newPet.getName());
        pet.setAge(newPet.getAge());
        return repository.save(pet);
        });
        return newPet;

    }


    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }


}
