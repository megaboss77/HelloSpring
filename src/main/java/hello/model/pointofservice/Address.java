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

public class Address {
  @JsonProperty("branchName")
  private String branchName = null;

  @JsonProperty("branchNumber")
  private String branchNumber = null;

  @JsonProperty("atmNumber")
  private String atmNumber = null;

  @JsonProperty("atmLocationName")
  private String atmLocationName = null;

  @JsonProperty("buildingNumber")
  private String buildingNumber = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("subDistrict")
  private String subDistrict = null;

  @JsonProperty("district")
  private String district = null;

  @JsonProperty("province")
  private String province = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  public Address branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * Name by which an organisation is known and which is usually used to identify
   * that organisation. It is derived from the association between
   * PartyIdentificationInformation and PartyName (BIAN: N/A, ISO20022: N/A -
   * derived from Organisation/Branch, OrganisationName, and
   * OrganisationIdentification/DUNS)
   * 
   * @return branchName
   **/
  @ApiModelProperty(example = "สาขาสำนักเพลินจิต  ", value = "Name by which an organisation is known and which is usually used to identify that organisation. It is derived from the association between PartyIdentificationInformation and PartyName (BIAN: N/A, ISO20022: N/A - derived from Organisation/Branch, OrganisationName, and OrganisationIdentification/DUNS)")

  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public Address branchNumber(String branchNumber) {
    this.branchNumber = branchNumber;
    return this;
  }

  /**
   * Unique number that provides unique and unambiguous identification of branch
   * (BIAN: N/A, ISO20022: N/A - derived from Organisation/Branch,
   * TaxIdentificationNumber, and OrganisationIdentification/DUNS )
   * 
   * @return branchNumber
   **/
  @ApiModelProperty(example = "001", value = "Unique number that provides unique and unambiguous identification of branch (BIAN: N/A, ISO20022: N/A - derived from Organisation/Branch, TaxIdentificationNumber, and OrganisationIdentification/DUNS )")

  public String getBranchNumber() {
    return branchNumber;
  }

  public void setBranchNumber(String branchNumber) {
    this.branchNumber = branchNumber;
  }

  public Address atmNumber(String atmNumber) {
    this.atmNumber = atmNumber;
    return this;
  }

  /**
   * Unique number that provides unique and unambiguous identification of branch
   * (BIAN: N/A, ISO20022: N/A - derived from Organisation/Branch,
   * TaxIdentificationNumber, and OrganisationIdentification/DUNS )
   * 
   * @return atmNumber
   **/
  @ApiModelProperty(example = "", value = "Unique number that provides unique and unambiguous identification of branch (BIAN: N/A, ISO20022: N/A - derived from Organisation/Branch, TaxIdentificationNumber, and OrganisationIdentification/DUNS )")

  public String getAtmNumber() {
    return atmNumber;
  }

  public void setAtmNumber(String atmNumber) {
    this.atmNumber = atmNumber;
  }

  public Address atmLocationName(String atmLocationName) {
    this.atmLocationName = atmLocationName;
    return this;
  }

  /**
   * Specifies a place of an ATM machine (BIAN: N/A, ISO20022: N/A - derived from
   * PostalAddress/StreetName)
   * 
   * @return atmLocationName
   **/
  @ApiModelProperty(example = "", value = "Specifies a place of an ATM machine (BIAN: N/A, ISO20022: N/A - derived from PostalAddress/StreetName)")

  public String getAtmLocationName() {
    return atmLocationName;
  }

  public void setAtmLocationName(String atmLocationName) {
    this.atmLocationName = atmLocationName;
  }

  public Address buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Number that identifies the position of a building on a street (BIAN:
   * corporateAddress, ISO20022: PostalAddress6/BuildingNumber)
   * 
   * @return buildingNumber
   **/
  @ApiModelProperty(example = "550", value = "Number that identifies the position of a building on a street (BIAN: corporateAddress, ISO20022: PostalAddress6/BuildingNumber)")

  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare (BIAN: corporateAddress, ISO20022:
   * PostalAddress/StreetName)
   * 
   * @return streetName
   **/
  @ApiModelProperty(example = "เพลินจิต", value = "Name of a street or thoroughfare (BIAN: corporateAddress, ISO20022: PostalAddress/StreetName)")

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Address subDistrict(String subDistrict) {
    this.subDistrict = subDistrict;
    return this;
  }

  /**
   * Identification of a sub-division of a district (BIAN: corporateAddress,
   * ISO20022: PostalAddress/DistrictSubDivisionIdentification)
   * 
   * @return subDistrict
   **/
  @ApiModelProperty(example = "ลุมพินี", value = "Identification of a sub-division of a district (BIAN: corporateAddress, ISO20022: PostalAddress/DistrictSubDivisionIdentification)")

  public String getSubDistrict() {
    return subDistrict;
  }

  public void setSubDistrict(String subDistrict) {
    this.subDistrict = subDistrict;
  }

  public Address district(String district) {
    this.district = district;
    return this;
  }

  /**
   * Name of a district, ie, a part of a town or region (BIAN: corporateAddress,
   * ISO20022: PostalAddress/DistrictName)
   * 
   * @return district
   **/
  @ApiModelProperty(example = "ปทุมวัน", value = "Name of a district, ie, a part of a town or region (BIAN: corporateAddress, ISO20022: PostalAddress/DistrictName)")

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Address province(String province) {
    this.province = province;
    return this;
  }

  /**
   * A territory governed as an administrative or political unit of a country
   * (BIAN: corporateAddress, ISO20022: PostalAddress/Province)
   * 
   * @return province
   **/
  @ApiModelProperty(example = "กรุงเทพมหานคร", value = "A territory governed as an administrative or political unit of a country (BIAN: corporateAddress, ISO20022: PostalAddress/Province)")

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a
   * postal address to assist the sorting of mail (BIAN: corporateAddress,
   * ISO20022: PostalAddress/PostCodeIdentification)
   * 
   * @return postalCode
   **/
  @ApiModelProperty(example = "10330", value = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail (BIAN: corporateAddress, ISO20022: PostalAddress/PostCodeIdentification)")

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.branchName, address.branchName)
        && Objects.equals(this.branchNumber, address.branchNumber) && Objects.equals(this.atmNumber, address.atmNumber)
        && Objects.equals(this.atmLocationName, address.atmLocationName)
        && Objects.equals(this.buildingNumber, address.buildingNumber)
        && Objects.equals(this.streetName, address.streetName) && Objects.equals(this.subDistrict, address.subDistrict)
        && Objects.equals(this.district, address.district) && Objects.equals(this.province, address.province)
        && Objects.equals(this.postalCode, address.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchName, branchNumber, atmNumber, atmLocationName, buildingNumber, streetName, subDistrict,
        district, province, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");

    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    atmNumber: ").append(toIndentedString(atmNumber)).append("\n");
    sb.append("    atmLocationName: ").append(toIndentedString(atmLocationName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    subDistrict: ").append(toIndentedString(subDistrict)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
