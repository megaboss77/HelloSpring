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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-01T10:47:52.165Z")

public class GeographicCoordinates {
  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  public GeographicCoordinates latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude value of a location in decimal degree (DD) system (BIAN: N/A,
   * ISO20022: GeographicCoordinates1/Latitude in degrees, minutes, seconds (DMS)
   * system)
   * 
   * @return latitude
   **/
  @ApiModelProperty(example = "100.5470233", value = "Latitude value of a location in decimal degree (DD) system (BIAN: N/A, ISO20022: GeographicCoordinates1/Latitude in degrees, minutes, seconds (DMS) system)")

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public GeographicCoordinates longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Longitude value of a location in decimal degree (DD) system (BIAN: N/A,
   * ISO20022: GeographicCoordinates1/Longitude in degrees, minutes, seconds (DMS)
   * systen)
   * 
   * @return longitude
   **/
  @ApiModelProperty(example = "13.7429404", value = "Longitude value of a location in decimal degree (DD) system (BIAN: N/A, ISO20022: GeographicCoordinates1/Longitude in degrees, minutes, seconds (DMS) systen)")

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
    GeographicCoordinates geographicCoordinates = (GeographicCoordinates) o;
    return Objects.equals(this.latitude, geographicCoordinates.latitude)
        && Objects.equals(this.longitude, geographicCoordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicCoordinates {\n");

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
