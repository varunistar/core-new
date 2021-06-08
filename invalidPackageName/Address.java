/*
 * Salesken Organization APIs
 * <b>Introduction</b><br><br>This is collection of Organization APIs. These are used to create organization, fetch organization records, update organization and invoke organization.<br><br> <b>Authentication</b><br><br> Salesken Organization APIs are authenticated using Basic Authentication with your Authentication API Key and OAuth2. The OAuth2 are available after you sign-up with the Salesken.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: itadmin@salesken.ai
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package invalidPackageName;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-08T07:59:37.089Z[GMT]")public class Address   {
  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("landmark")
  private String landmark = null;

  @JsonProperty("pincode")
  private Integer pincode = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Get addressLine1
   * @return addressLine1
   **/
  @JsonProperty("addressLine1")
  @Schema(example = "This is address line 1 of the organization.", description = "")
 @Pattern(regexp="^[#.0-9a-zA-Z\\s,-]+$")  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Get addressLine2
   * @return addressLine2
   **/
  @JsonProperty("addressLine2")
  @Schema(example = "This is address line 2 of the organization.", description = "")
 @Pattern(regexp="^[#.0-9a-zA-Z\\s,-]+$")  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address landmark(String landmark) {
    this.landmark = landmark;
    return this;
  }

  /**
   * Get landmark
   * @return landmark
   **/
  @JsonProperty("landmark")
  @Schema(example = "Near XYZ", description = "")
 @Pattern(regexp="^[#.0-9a-zA-Z\\s,-]+$")  public String getLandmark() {
    return landmark;
  }

  public void setLandmark(String landmark) {
    this.landmark = landmark;
  }

  public Address pincode(Integer pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * Get pincode
   * minimum: 10
   * maximum: 9999999999
   * @return pincode
   **/
  @JsonProperty("pincode")
  @Schema(example = "560008", description = "")
 @Min(10) @Max(9999999999)  public Integer getPincode() {
    return pincode;
  }

  public void setPincode(Integer pincode) {
    this.pincode = pincode;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @JsonProperty("city")
  @Schema(example = "Bengaluru", description = "")
 @Pattern(regexp="^[0-9a-zA-Z]+$")  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @JsonProperty("state")
  @Schema(example = "Karnataka", description = "")
 @Pattern(regexp="^[0-9a-zA-Z]+$")  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @JsonProperty("country")
  @Schema(example = "India", description = "")
 @Pattern(regexp="^[0-9a-zA-Z]+$")  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
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
    return Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.landmark, address.landmark) &&
        Objects.equals(this.pincode, address.pincode) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, landmark, pincode, city, state, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
