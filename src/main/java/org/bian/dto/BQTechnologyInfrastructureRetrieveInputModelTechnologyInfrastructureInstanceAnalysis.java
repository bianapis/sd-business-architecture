package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceAnalysis
 */
public class BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceAnalysis   {
  private String technologyInfrastructureInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return technologyInfrastructureInstanceAnalysisReference
  **/

  public String getTechnologyInfrastructureInstanceAnalysisReference() {
    return technologyInfrastructureInstanceAnalysisReference;
  }

  public void setTechnologyInfrastructureInstanceAnalysisReference(String technologyInfrastructureInstanceAnalysisReference) {
    this.technologyInfrastructureInstanceAnalysisReference = technologyInfrastructureInstanceAnalysisReference;
  }


}

