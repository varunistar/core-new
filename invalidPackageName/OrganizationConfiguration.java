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
 * OrganizationConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-08T07:59:41.201Z[GMT]")public class OrganizationConfiguration   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("organziationId")
  private Integer organziationId = null;

  @JsonProperty("propertyName")
  private String propertyName = null;

  @JsonProperty("propertyValue")
  private String propertyValue = null;

  @JsonProperty("propertyDataType")
  private String propertyDataType = null;

  public OrganizationConfiguration id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrganizationConfiguration organziationId(Integer organziationId) {
    this.organziationId = organziationId;
    return this;
  }

  /**
   * Get organziationId
   * @return organziationId
   **/
  @JsonProperty("organziationId")
  @Schema(description = "")
  public Integer getOrganziationId() {
    return organziationId;
  }

  public void setOrganziationId(Integer organziationId) {
    this.organziationId = organziationId;
  }

  public OrganizationConfiguration propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * Get propertyName
   * @return propertyName
   **/
  @JsonProperty("propertyName")
  @Schema(description = "")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public OrganizationConfiguration propertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
    return this;
  }

  /**
   * Get propertyValue
   * @return propertyValue
   **/
  @JsonProperty("propertyValue")
  @Schema(description = "")
  public String getPropertyValue() {
    return propertyValue;
  }

  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
  }

  public OrganizationConfiguration propertyDataType(String propertyDataType) {
    this.propertyDataType = propertyDataType;
    return this;
  }

  /**
   * Get propertyDataType
   * @return propertyDataType
   **/
  @JsonProperty("propertyDataType")
  @Schema(description = "")
  public String getPropertyDataType() {
    return propertyDataType;
  }

  public void setPropertyDataType(String propertyDataType) {
    this.propertyDataType = propertyDataType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationConfiguration organizationConfiguration = (OrganizationConfiguration) o;
    return Objects.equals(this.id, organizationConfiguration.id) &&
        Objects.equals(this.organziationId, organizationConfiguration.organziationId) &&
        Objects.equals(this.propertyName, organizationConfiguration.propertyName) &&
        Objects.equals(this.propertyValue, organizationConfiguration.propertyValue) &&
        Objects.equals(this.propertyDataType, organizationConfiguration.propertyDataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organziationId, propertyName, propertyValue, propertyDataType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organziationId: ").append(toIndentedString(organziationId)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
    sb.append("    propertyDataType: ").append(toIndentedString(propertyDataType)).append("\n");
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
