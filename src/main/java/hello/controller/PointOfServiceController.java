package hello.controller;

import hello.model.pointofservice.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class PointOfServiceController {

    // find the bean then inject them into this class
    // @Autowired
    // private NoteService noteService;

    @RequestMapping(value = "sales-and-service/point-of-service", method = RequestMethod.GET, produces = "application/json")
    public List<PointOfService> GetPointOfService(@RequestParam(required = false) String type,
            @RequestParam(required = false, value = "province") String province,
            @RequestParam(required = false) String district, @RequestParam(required = false) String branchCode) {
        PointOfService p = new PointOfService();
        p.setType(type);
        Address address = new Address();
        address.setProvince(province);
        address.setDistrict(district);
        p.setAddress(address);
        List<PointOfService> ps = Arrays.asList(p);
        return ps;
    }
}
