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

public class OperatingHours {
  @JsonProperty("weekdays")
  private String weekdays = null;

  @JsonProperty("saturday")
  private String saturday = null;

  @JsonProperty("sunday")
  private String sunday = null;

  public OperatingHours weekdays(String weekdays) {
    this.weekdays = weekdays;
    return this;
  }

  /**
   * Particular time span specified between a start time and an end time. The time
   * period cannot exceed 24 hours (BIAN: N/A, ISO20022: TimePeriod)
   * 
   * @return weekdays
   **/
  @ApiModelProperty(example = "8.30-15.30", value = "Particular time span specified between a start time and an end time. The time period cannot exceed 24 hours (BIAN: N/A, ISO20022: TimePeriod)")

  public String getWeekdays() {
    return weekdays;
  }

  public void setWeekdays(String weekdays) {
    this.weekdays = weekdays;
  }

  public OperatingHours saturday(String saturday) {
    this.saturday = saturday;
    return this;
  }

  /**
   * Particular time span specified between a start time and an end time. The time
   * period cannot exceed 24 hours (BIAN: N/A, ISO20022: TimePeriod)
   * 
   * @return saturday
   **/
  @ApiModelProperty(example = "", value = "Particular time span specified between a start time and an end time. The time period cannot exceed 24 hours (BIAN: N/A, ISO20022: TimePeriod)")

  public String getSaturday() {
    return saturday;
  }

  public void setSaturday(String saturday) {
    this.saturday = saturday;
  }

  public OperatingHours sunday(String sunday) {
    this.sunday = sunday;
    return this;
  }

  /**
   * Particular time span specified between a start time and an end time. The time
   * period cannot exceed 24 hours (BIAN: N/A, ISO20022: TimePeriod)
   * 
   * @return sunday
   **/
  @ApiModelProperty(example = "", value = "Particular time span specified between a start time and an end time. The time period cannot exceed 24 hours (BIAN: N/A, ISO20022: TimePeriod)")

  public String getSunday() {
    return sunday;
  }

  public void setSunday(String sunday) {
    this.sunday = sunday;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatingHours operatingHours = (OperatingHours) o;
    return Objects.equals(this.weekdays, operatingHours.weekdays)
        && Objects.equals(this.saturday, operatingHours.saturday) && Objects.equals(this.sunday, operatingHours.sunday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekdays, saturday, sunday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingHours {\n");

    sb.append("    weekdays: ").append(toIndentedString(weekdays)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
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
