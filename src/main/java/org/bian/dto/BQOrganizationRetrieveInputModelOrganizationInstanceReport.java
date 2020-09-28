package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrganizationRetrieveInputModelOrganizationInstanceReport
 */
public class BQOrganizationRetrieveInputModelOrganizationInstanceReport   {
  private String organizationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return organizationInstanceReportReference
  **/

  public String getOrganizationInstanceReportReference() {
    return organizationInstanceReportReference;
  }

  public void setOrganizationInstanceReportReference(String organizationInstanceReportReference) {
    this.organizationInstanceReportReference = organizationInstanceReportReference;
  }


}

