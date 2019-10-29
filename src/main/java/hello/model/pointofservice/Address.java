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
 * s TODO
 */
@ApiModel(description = "TODO")
@Validated
@javax.annotation.Generated(value = "hello.codegen.languages.SpringCodegen", date = "2019-10-25T02:52:53.609Z")

public class Address {
  @JsonProperty("houseNumber")
  private String houseNumber = null;

  @JsonProperty("unitNumber")
  private String unitNumber = null;

  @JsonProperty("floorNumber")
  private String floorNumber = null;

  @JsonProperty("buildingName")
  private String buildingName = null;

  @JsonProperty("villageName")
  private String villageName = null;

  @JsonProperty("villageNumber")
  private String villageNumber = null;

  @JsonProperty("alleyName")
  private String alleyName = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("subDistrict")
  private String subDistrict = null;

  @JsonProperty("district")
  private String district = null;

  @JsonProperty("province")
  private String province = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  public Address houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * Identification of a location on street address
   * 
   * @return houseNumber
   **/
  @ApiModelProperty(example = "1222", value = "Identification of a location on street address")

  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public Address unitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

  /**
   * Identification of a suite or apartment
   * 
   * @return unitNumber
   **/
  @ApiModelProperty(example = " ", value = "Identification of a suite or apartment")

  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public Address floorNumber(String floorNumber) {
    this.floorNumber = floorNumber;
    return this;
  }

  /**
   * Floor or storey within a building
   * 
   * @return floorNumber
   **/
  @ApiModelProperty(example = " ", value = "Floor or storey within a building")

  public String getFloorNumber() {
    return floorNumber;
  }

  public void setFloorNumber(String floorNumber) {
    this.floorNumber = floorNumber;
  }

  public Address buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  /**
   * Name of a building
   * 
   * @return buildingName
   **/
  @ApiModelProperty(example = " ", value = "Name of a building")

  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public Address villageName(String villageName) {
    this.villageName = villageName;
    return this;
  }

  /**
   * Name of the village
   * 
   * @return villageName
   **/
  @ApiModelProperty(example = " ", value = "Name of the village")

  public String getVillageName() {
    return villageName;
  }

  public void setVillageName(String villageName) {
    this.villageName = villageName;
  }

  public Address villageNumber(String villageNumber) {
    this.villageNumber = villageNumber;
    return this;
  }

  /**
   * Identification of a village
   * 
   * @return villageNumber
   **/
  @ApiModelProperty(example = " ", value = "Identification of a village")

  public String getVillageNumber() {
    return villageNumber;
  }

  public void setVillageNumber(String villageNumber) {
    this.villageNumber = villageNumber;
  }

  public Address alleyName(String alleyName) {
    this.alleyName = alleyName;
    return this;
  }

  /**
   * Name of an alley branch out from the street
   * 
   * @return alleyName
   **/
  @ApiModelProperty(example = " ", value = "Name of an alley branch out from the street")

  public String getAlleyName() {
    return alleyName;
  }

  public void setAlleyName(String alleyName) {
    this.alleyName = alleyName;
  }

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare
   * 
   * @return streetName
   **/
  @ApiModelProperty(example = "Rama III Rd", value = "Name of a street or thoroughfare")

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
   * Identification of a sub-division of a district
   * 
   * @return subDistrict
   **/
  @ApiModelProperty(example = "Bang Phong Phang", value = "Identification of a sub-division of a district")

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
   * Name of a district, ie, a part of a town or region
   * 
   * @return district
   **/
  @ApiModelProperty(example = "Yan Nawa", value = "Name of a district, ie, a part of a town or region")

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
   * 
   * @return province
   **/
  @ApiModelProperty(example = "Bangkok", value = "A territory governed as an administrative or political unit of a country")

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country of the address (according to ISO 3166, Alpha-2)
   * 
   * @return countryCode
   **/
  @ApiModelProperty(example = "TH", value = "Country of the address  (according to ISO 3166, Alpha-2)")

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a
   * postal address to assist the sorting of mail
   * 
   * @return postalCode
   **/
  @ApiModelProperty(example = "10120", value = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail")

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
    return Objects.equals(this.houseNumber, address.houseNumber) && Objects.equals(this.unitNumber, address.unitNumber)
        && Objects.equals(this.floorNumber, address.floorNumber)
        && Objects.equals(this.buildingName, address.buildingName)
        && Objects.equals(this.villageName, address.villageName)
        && Objects.equals(this.villageNumber, address.villageNumber)
        && Objects.equals(this.alleyName, address.alleyName) && Objects.equals(this.streetName, address.streetName)
        && Objects.equals(this.subDistrict, address.subDistrict) && Objects.equals(this.district, address.district)
        && Objects.equals(this.province, address.province) && Objects.equals(this.countryCode, address.countryCode)
        && Objects.equals(this.postalCode, address.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(houseNumber, unitNumber, floorNumber, buildingName, villageName, villageNumber, alleyName,
        streetName, subDistrict, district, province, countryCode, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");

    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
    sb.append("    floorNumber: ").append(toIndentedString(floorNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    villageName: ").append(toIndentedString(villageName)).append("\n");
    sb.append("    villageNumber: ").append(toIndentedString(villageNumber)).append("\n");
    sb.append("    alleyName: ").append(toIndentedString(alleyName)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    subDistrict: ").append(toIndentedString(subDistrict)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
