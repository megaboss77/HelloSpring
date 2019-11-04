package hello.model.pointofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import hello.model.pointofservice.Address;
import hello.model.pointofservice.ContactPoint;
import hello.model.pointofservice.GeographicCoordinates;
import hello.model.pointofservice.OperatingHours;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

@ApiModel(description = "TODO")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-01T10:47:52.165Z")

public class PointOfService {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("geographicCoordinates")
  private GeographicCoordinates geographicCoordinates = null;

  @JsonProperty("contactInformation")
  private ContactPoint contactInformation = null;

  @JsonProperty("operatingHours")
  @Valid
  private List<OperatingHours> operatingHours = null;

  public PointOfService type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type used to classify and organise different services (BIAN: N/A, ISO20022:
   * Service/Type)
   * 
   * @return type
   **/
  @ApiModelProperty(example = "BRANCH ATM", value = "Type used to classify and organise different services (BIAN: N/A, ISO20022: Service/Type)")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PointOfService address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Information that locates and identifies a specific address (BIAN: N/A,
   * ISO20022: Location/Address)
   * 
   * @return address
   **/
  @ApiModelProperty(value = "Information that locates and identifies a specific address (BIAN: N/A, ISO20022: Location/Address)")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public PointOfService geographicCoordinates(GeographicCoordinates geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
    return this;
  }

  /**
   * Location on the Earth specified by two numbers representing vertical and
   * horizontal position (BIAN: N/A, ISO20022: GeographicCoordinates1)
   * 
   * @return geographicCoordinates
   **/
  @ApiModelProperty(value = "Location on the Earth specified by two numbers representing vertical and horizontal position (BIAN: N/A, ISO20022: GeographicCoordinates1)")

  @Valid

  public GeographicCoordinates getGeographicCoordinates() {
    return geographicCoordinates;
  }

  public void setGeographicCoordinates(GeographicCoordinates geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
  }

  public PointOfService contactInformation(ContactPoint contactInformation) {
    this.contactInformation = contactInformation;
    return this;
  }

  /**
   * Number, physical or virtual address, used for communication (BIAN: N/A,
   * ISO20022: ContactPoint)
   * 
   * @return contactInformation
   **/
  @ApiModelProperty(value = "Number, physical or virtual address, used for communication (BIAN: N/A, ISO20022: ContactPoint)")

  @Valid

  public ContactPoint getContactInformation() {
    return contactInformation;
  }

  public void setContactInformation(ContactPoint contactInformation) {
    this.contactInformation = contactInformation;
  }

  public PointOfService operatingHours(List<OperatingHours> operatingHours) {
    this.operatingHours = operatingHours;
    return this;
  }

  public PointOfService addOperatingHoursItem(OperatingHours operatingHoursItem) {
    if (this.operatingHours == null) {
      this.operatingHours = new ArrayList<OperatingHours>();
    }
    this.operatingHours.add(operatingHoursItem);
    return this;
  }

  /**
   * Particular time span specified between a start time and an end time. The time
   * period cannot exceed 24 hours (BIAN: N/A, ISO20022: TimePeriod)
   * 
   * @return operatingHours
   **/
  @ApiModelProperty(value = "Particular time span specified between a start time and an end time. The time period cannot exceed 24 hours (BIAN: N/A, ISO20022: TimePeriod)")

  @Valid

  public List<OperatingHours> getOperatingHours() {
    return operatingHours;
  }

  public void setOperatingHours(List<OperatingHours> operatingHours) {
    this.operatingHours = operatingHours;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointOfService pointOfService = (PointOfService) o;
    return Objects.equals(this.type, pointOfService.type) && Objects.equals(this.address, pointOfService.address)
        && Objects.equals(this.geographicCoordinates, pointOfService.geographicCoordinates)
        && Objects.equals(this.contactInformation, pointOfService.contactInformation)
        && Objects.equals(this.operatingHours, pointOfService.operatingHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, address, geographicCoordinates, contactInformation, operatingHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfService {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    geographicCoordinates: ").append(toIndentedString(geographicCoordinates)).append("\n");
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
    sb.append("    operatingHours: ").append(toIndentedString(operatingHours)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
