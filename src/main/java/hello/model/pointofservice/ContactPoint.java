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

public class ContactPoint {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("detail")
  private String detail = null;

  public ContactPoint type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type used to classify and organise different contact detail (BIAN: N/A,
   * ISO20022: Service/Type, PhoneAddress/PhoneNumber,
   * ElectronicAddress/EmailAddress)
   * 
   * @return type
   **/
  @ApiModelProperty(example = " PHONE_NUMBER", value = "Type used to classify and organise different contact detail (BIAN: N/A, ISO20022: Service/Type, PhoneAddress/PhoneNumber, ElectronicAddress/EmailAddress)")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ContactPoint detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Collection of information such as number, physical or virtual address, used
   * for communication (BIAN: cellPhoneNumber, ISO20022: PhoneAddress/PhoneNumber,
   * ElectronicAddress/EmailAddress)
   * 
   * @return detail
   **/
  @ApiModelProperty(example = "02-2082170", value = "Collection of information such as number, physical or virtual address, used for communication (BIAN: cellPhoneNumber, ISO20022: PhoneAddress/PhoneNumber, ElectronicAddress/EmailAddress)")

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPoint contactPoint = (ContactPoint) o;
    return Objects.equals(this.type, contactPoint.type) && Objects.equals(this.detail, contactPoint.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPoint {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
