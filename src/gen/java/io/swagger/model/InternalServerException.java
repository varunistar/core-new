package io.swagger.model;

import io.swagger.model.ErrorType;
import io.swagger.model.InternalServerErrorType;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class InternalServerException   {
  
  @Schema(example = "500", required = true, description = "")
  private Integer responseCode = null;
  
  @Schema(required = true, description = "")
  private InternalServerErrorType responseMessage = null;
  
  @Schema(required = true, description = "")
  private ErrorType responseType = null;
 /**
   * Get responseCode
   * @return responseCode
  **/
  @JsonProperty("responseCode")
  @NotNull
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public InternalServerException responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

 /**
   * Get responseMessage
   * @return responseMessage
  **/
  @JsonProperty("responseMessage")
  @NotNull
  public InternalServerErrorType getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(InternalServerErrorType responseMessage) {
    this.responseMessage = responseMessage;
  }

  public InternalServerException responseMessage(InternalServerErrorType responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

 /**
   * Get responseType
   * @return responseType
  **/
  @JsonProperty("responseType")
  @NotNull
  public ErrorType getResponseType() {
    return responseType;
  }

  public void setResponseType(ErrorType responseType) {
    this.responseType = responseType;
  }

  public InternalServerException responseType(ErrorType responseType) {
    this.responseType = responseType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalServerException {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
