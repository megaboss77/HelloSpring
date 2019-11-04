package hello.controller;

import hello.model.pointofservice.*;
import io.swagger.annotations.ApiParam;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

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

    @RequestMapping(value = "sales-and-service/point-of-service", method = RequestMethod.GET, produces = "application/json")
    public List<PointOfService> GetPointOfService(
            @ApiParam(value = "Type of point of service") @Valid @RequestParam(value = "type", required = false) String type,
            @ApiParam(value = "Province location of point of service") @Valid @RequestParam(value = "province", required = false) String province,
            @ApiParam(value = "District location of point of service") @Valid @RequestParam(value = "district", required = false) String district,
            @ApiParam(value = "Branch code of point of service") @Valid @RequestParam(value = "branchCode", required = false) String branchCode,
            @ApiParam(value = "Latitude value of a location in decimal degree (DD) format") @Valid @RequestParam(value = "latitude", required = false) String latitude,
            @ApiParam(value = "Longitude value of a location in decimal degree (DD) format") @Valid @RequestParam(value = "longitude", required = false) String longitude,
            @ApiParam(value = "Specifies the day of the week") @Valid @RequestParam(value = "operatingDays", required = false) String operatingDays) {
        PointOfService p = new PointOfService();
        p.setType(type);
        List<PointOfService> ps = Arrays.asList(p);
        return ps;
    }

}
