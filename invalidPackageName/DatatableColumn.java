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
import invalidPackageName.DatatableSearch;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * DatatableColumn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-08T07:59:37.089Z[GMT]")public class DatatableColumn   {
  @JsonProperty("data")
  private String data = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("searchable")
  private Boolean searchable = null;

  @JsonProperty("orderable")
  private Boolean orderable = null;

  @JsonProperty("search")
  private DatatableSearch search = null;

  public DatatableColumn data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @JsonProperty("data")
  @Schema(description = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public DatatableColumn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @JsonProperty("name")
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DatatableColumn searchable(Boolean searchable) {
    this.searchable = searchable;
    return this;
  }

  /**
   * Get searchable
   * @return searchable
   **/
  @JsonProperty("searchable")
  @Schema(description = "")
  public Boolean isSearchable() {
    return searchable;
  }

  public void setSearchable(Boolean searchable) {
    this.searchable = searchable;
  }

  public DatatableColumn orderable(Boolean orderable) {
    this.orderable = orderable;
    return this;
  }

  /**
   * Get orderable
   * @return orderable
   **/
  @JsonProperty("orderable")
  @Schema(description = "")
  public Boolean isOrderable() {
    return orderable;
  }

  public void setOrderable(Boolean orderable) {
    this.orderable = orderable;
  }

  public DatatableColumn search(DatatableSearch search) {
    this.search = search;
    return this;
  }

  /**
   * Get search
   * @return search
   **/
  @JsonProperty("search")
  @Schema(description = "")
  @Valid
  public DatatableSearch getSearch() {
    return search;
  }

  public void setSearch(DatatableSearch search) {
    this.search = search;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatatableColumn datatableColumn = (DatatableColumn) o;
    return Objects.equals(this.data, datatableColumn.data) &&
        Objects.equals(this.name, datatableColumn.name) &&
        Objects.equals(this.searchable, datatableColumn.searchable) &&
        Objects.equals(this.orderable, datatableColumn.orderable) &&
        Objects.equals(this.search, datatableColumn.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, name, searchable, orderable, search);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatatableColumn {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
