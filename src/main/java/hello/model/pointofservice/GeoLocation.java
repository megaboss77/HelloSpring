package hello.model.pointofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TODO
 */
@ApiModel(description = "TODO")
@Validated
@javax.annotation.Generated(value = "hello.codegen.languages.SpringCodegen", date = "2019-10-25T02:52:53.609Z")

public class GeoLocation   {
  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  public GeoLocation latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude measured in degrees, minutes and seconds, following by 'N' for the north and 'S' for the south of the equator
   * @return latitude
  **/
  @ApiModelProperty(example = "13°40'43.9\"N", value = "Latitude measured in degrees, minutes and seconds, following by 'N' for the north and 'S' for the south of the equator")


  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public GeoLocation longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory.  The longitude is measured in degrees, minutes and seconds, following by 'E' for the east and 'W' for the west
   * @return longitude
  **/
  @ApiModelProperty(example = "100°32'50.4\"E", value = "Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory.  The longitude is measured in degrees, minutes and seconds, following by 'E' for the east and 'W' for the west")


  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocation geoLocation = (GeoLocation) o;
    return Objects.equals(this.latitude, geoLocation.latitude) &&
        Objects.equals(this.longitude, geoLocation.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocation {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

