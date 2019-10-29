package hello.model.pointofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import hello.model.pointofservice.Address;
import hello.model.pointofservice.Contact;
import hello.model.pointofservice.GeoLocation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TODO
 */
@ApiModel(description = "TODO")
@Validated
public class PointOfService {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("geoLocation")
  private GeoLocation geoLocation = null;

  @JsonProperty("contact")
  private Contact contact = null;

  public PointOfService type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of point of service
   * 
   * @return type
   **/
  @ApiModelProperty(example = " ", value = "Type of point of service")
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
   * Address information of point of service
   * 
   * @return address
   **/
  @ApiModelProperty(value = "Address information of point of service")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public PointOfService geoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Geolocation information of point of service
   * 
   * @return geoLocation
   **/
  @ApiModelProperty(value = "Geolocation information of point of service")

  @Valid

  public GeoLocation getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }

  public PointOfService contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Contact information of point of service
   * 
   * @return contact
   **/
  @ApiModelProperty(value = "Contact information of point of service")

  @Valid

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
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
        && Objects.equals(this.geoLocation, pointOfService.geoLocation)
        && Objects.equals(this.contact, pointOfService.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, address, geoLocation, contact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfService {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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
