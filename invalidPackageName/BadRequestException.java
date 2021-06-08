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
import invalidPackageName.BadRequestErrorType;
import invalidPackageName.ErrorType;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * BadRequestException
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-08T07:59:37.089Z[GMT]")public class BadRequestException   {
  @JsonProperty("responseCode")
  private Integer responseCode = null;

  @JsonProperty("responseMessage")
  private BadRequestErrorType responseMessage = null;

  @JsonProperty("responseType")
  private ErrorType responseType = null;

  public BadRequestException responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
   **/
  @JsonProperty("responseCode")
  @Schema(example = "400", required = true, description = "")
  @NotNull
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public BadRequestException responseMessage(BadRequestErrorType responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

  /**
   * Get responseMessage
   * @return responseMessage
   **/
  @JsonProperty("responseMessage")
  @Schema(required = true, description = "")
  @NotNull
  @Valid
  public BadRequestErrorType getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(BadRequestErrorType responseMessage) {
    this.responseMessage = responseMessage;
  }

  public BadRequestException responseType(ErrorType responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * Get responseType
   * @return responseType
   **/
  @JsonProperty("responseType")
  @Schema(required = true, description = "")
  @NotNull
  @Valid
  public ErrorType getResponseType() {
    return responseType;
  }

  public void setResponseType(ErrorType responseType) {
    this.responseType = responseType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestException badRequestException = (BadRequestException) o;
    return Objects.equals(this.responseCode, badRequestException.responseCode) &&
        Objects.equals(this.responseMessage, badRequestException.responseMessage) &&
        Objects.equals(this.responseType, badRequestException.responseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseCode, responseMessage, responseType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestException {\n");
    
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
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
