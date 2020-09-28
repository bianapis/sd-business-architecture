package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceReport
 */
public class BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceReport   {
  private String informationArchitectureInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return informationArchitectureInstanceReportReference
  **/

  public String getInformationArchitectureInstanceReportReference() {
    return informationArchitectureInstanceReportReference;
  }

  public void setInformationArchitectureInstanceReportReference(String informationArchitectureInstanceReportReference) {
    this.informationArchitectureInstanceReportReference = informationArchitectureInstanceReportReference;
  }


}

