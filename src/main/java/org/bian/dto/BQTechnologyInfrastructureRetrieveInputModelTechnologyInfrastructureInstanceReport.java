package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceReport
 */
public class BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceReport   {
  private String technologyInfrastructureInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return technologyInfrastructureInstanceReportReference
  **/

  public String getTechnologyInfrastructureInstanceReportReference() {
    return technologyInfrastructureInstanceReportReference;
  }

  public void setTechnologyInfrastructureInstanceReportReference(String technologyInfrastructureInstanceReportReference) {
    this.technologyInfrastructureInstanceReportReference = technologyInfrastructureInstanceReportReference;
  }


}

