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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * DatatableSearchResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-08T07:59:37.089Z[GMT]")public class DatatableSearchResults   {
  @JsonProperty("data")
  private List<Object> data = null;

  @JsonProperty("draw")
  private Integer draw = null;

  @JsonProperty("recordsFiltered")
  private Integer recordsFiltered = null;

  @JsonProperty("recordsTotal")
  private Integer recordsTotal = null;

  public DatatableSearchResults data(List<Object> data) {
    this.data = data;
    return this;
  }

  public DatatableSearchResults addDataItem(Object dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Object>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @JsonProperty("data")
  @Schema(description = "")
  public List<Object> getData() {
    return data;
  }

  public void setData(List<Object> data) {
    this.data = data;
  }

  public DatatableSearchResults draw(Integer draw) {
    this.draw = draw;
    return this;
  }

  /**
   * Get draw
   * @return draw
   **/
  @JsonProperty("draw")
  @Schema(description = "")
  public Integer getDraw() {
    return draw;
  }

  public void setDraw(Integer draw) {
    this.draw = draw;
  }

  public DatatableSearchResults recordsFiltered(Integer recordsFiltered) {
    this.recordsFiltered = recordsFiltered;
    return this;
  }

  /**
   * Get recordsFiltered
   * @return recordsFiltered
   **/
  @JsonProperty("recordsFiltered")
  @Schema(description = "")
  public Integer getRecordsFiltered() {
    return recordsFiltered;
  }

  public void setRecordsFiltered(Integer recordsFiltered) {
    this.recordsFiltered = recordsFiltered;
  }

  public DatatableSearchResults recordsTotal(Integer recordsTotal) {
    this.recordsTotal = recordsTotal;
    return this;
  }

  /**
   * Get recordsTotal
   * @return recordsTotal
   **/
  @JsonProperty("recordsTotal")
  @Schema(description = "")
  public Integer getRecordsTotal() {
    return recordsTotal;
  }

  public void setRecordsTotal(Integer recordsTotal) {
    this.recordsTotal = recordsTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatatableSearchResults datatableSearchResults = (DatatableSearchResults) o;
    return Objects.equals(this.data, datatableSearchResults.data) &&
        Objects.equals(this.draw, datatableSearchResults.draw) &&
        Objects.equals(this.recordsFiltered, datatableSearchResults.recordsFiltered) &&
        Objects.equals(this.recordsTotal, datatableSearchResults.recordsTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, draw, recordsFiltered, recordsTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatatableSearchResults {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    draw: ").append(toIndentedString(draw)).append("\n");
    sb.append("    recordsFiltered: ").append(toIndentedString(recordsFiltered)).append("\n");
    sb.append("    recordsTotal: ").append(toIndentedString(recordsTotal)).append("\n");
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
