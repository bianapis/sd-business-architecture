package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrganizationRetrieveInputModelOrganizationInstanceAnalysis
 */
public class BQOrganizationRetrieveInputModelOrganizationInstanceAnalysis   {
  private String organizationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return organizationInstanceAnalysisReference
  **/

  public String getOrganizationInstanceAnalysisReference() {
    return organizationInstanceAnalysisReference;
  }

  public void setOrganizationInstanceAnalysisReference(String organizationInstanceAnalysisReference) {
    this.organizationInstanceAnalysisReference = organizationInstanceAnalysisReference;
  }


}

