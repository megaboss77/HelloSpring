package hello.controller;
//package name need to be a reverse domain name likes com.google. follow by the project name all lowercase 

import hello.model.Pet;
import hello.repository.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.net.InetAddress;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HelloController {
    @Autowired
    Environment environment;

    @Autowired
    private PetRepository repository;

    // get all pet
    @RequestMapping(value = "/pet", method = RequestMethod.GET, produces = "application/json")
    public List<Pet> getPet(
            @ApiParam(value = "Type of point of service") @Valid @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Type of point of service") @Valid @RequestParam(value = "id", required = false) String id) {
        List<Pet> pets = repository.findByNameAndId(name, id);
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
        // Port
        environment.getProperty("server.port");
        // Local address
        // InetAddress.getLocalHost().getHostAddress();
        // InetAddress.getLocalHost().getHostName();

        // Remote address
        String inf = InetAddress.getLoopbackAddress().getHostAddress() + " "
                + InetAddress.getLoopbackAddress().getHostName();
        return InetAddress.getLoopbackAddress().getHostName() + "/swagger-ui.html";
    }

    // @ApiOperation(value = "Authenticate user", nickname = "authenticate", notes =
    // "This API is used for authenticating user")
    // @ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
    // @ApiResponse(code = 400, message = "Bad Request", response =
    // ErrorsList.class),
    // @ApiResponse(code = 401, message = "Unauthorized", response =
    // ErrorsList.class),
    // @ApiResponse(code = 403, message = "Forbidden", response = ErrorsList.class),
    // @ApiResponse(code = 404, message = "Not Found"),
    // @ApiResponse(code = 500, message = "Internal server error occurred", response
    // = ErrorsList.class),
    // @ApiResponse(code = 503, message = "Service Unavailable", response =
    // ErrorsList.class) })
    @RequestMapping(value = "/echoStatus", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity echoHttpStatus(@RequestBody int statusCode) {
        if (statusCode == 200) {
            return new ResponseEntity(HttpStatus.OK);
        } else if (statusCode == 400) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        } else if (statusCode == 401) {
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        } else if (statusCode == 403) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        } else if (statusCode == 500) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        } else if (statusCode == 503) {
            return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
