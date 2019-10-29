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

public class Contact   {
  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("faxNumber")
  private String faxNumber = null;

  public Contact phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Collection of information that identifies a phone number, as defined by telecom services.  It is recommended to use only numbers and limited punctuation +,-.(.)
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+66-2-296-2000", value = "Collection of information that identifies a phone number, as defined by telecom services.  It is recommended to use only numbers and limited punctuation +,-.(.)")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Contact faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Collection of information that identifies a fax number, as defined by telecom services.  It is recommended to use only numbers and limited punctuation +,-.(.)
   * @return faxNumber
  **/
  @ApiModelProperty(example = "+66-2-296-2000", value = "Collection of information that identifies a fax number, as defined by telecom services.  It is recommended to use only numbers and limited punctuation +,-.(.)")


  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.phoneNumber, contact.phoneNumber) &&
        Objects.equals(this.faxNumber, contact.faxNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, faxNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
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

