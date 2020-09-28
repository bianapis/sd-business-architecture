package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceAnalysis
 */
public class BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceAnalysis   {
  private String informationArchitectureInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return informationArchitectureInstanceAnalysisReference
  **/

  public String getInformationArchitectureInstanceAnalysisReference() {
    return informationArchitectureInstanceAnalysisReference;
  }

  public void setInformationArchitectureInstanceAnalysisReference(String informationArchitectureInstanceAnalysisReference) {
    this.informationArchitectureInstanceAnalysisReference = informationArchitectureInstanceAnalysisReference;
  }


}

