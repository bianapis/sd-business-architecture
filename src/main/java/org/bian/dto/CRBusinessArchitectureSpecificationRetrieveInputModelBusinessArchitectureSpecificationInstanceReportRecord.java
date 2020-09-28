package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceReportRecord
 */
public class CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceReportRecord   {
  private String businessArchitectureSpecificationInstanceReportReference = null;

  private String businessArchitectureSpecificationInstanceReportType = null;

  private String businessArchitectureSpecificationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return businessArchitectureSpecificationInstanceReportReference
  **/

  public String getBusinessArchitectureSpecificationInstanceReportReference() {
    return businessArchitectureSpecificationInstanceReportReference;
  }

  public void setBusinessArchitectureSpecificationInstanceReportReference(String businessArchitectureSpecificationInstanceReportReference) {
    this.businessArchitectureSpecificationInstanceReportReference = businessArchitectureSpecificationInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return businessArchitectureSpecificationInstanceReportType
  **/

  public String getBusinessArchitectureSpecificationInstanceReportType() {
    return businessArchitectureSpecificationInstanceReportType;
  }

  public void setBusinessArchitectureSpecificationInstanceReportType(String businessArchitectureSpecificationInstanceReportType) {
    this.businessArchitectureSpecificationInstanceReportType = businessArchitectureSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return businessArchitectureSpecificationInstanceReportParameters
  **/

  public String getBusinessArchitectureSpecificationInstanceReportParameters() {
    return businessArchitectureSpecificationInstanceReportParameters;
  }

  public void setBusinessArchitectureSpecificationInstanceReportParameters(String businessArchitectureSpecificationInstanceReportParameters) {
    this.businessArchitectureSpecificationInstanceReportParameters = businessArchitectureSpecificationInstanceReportParameters;
  }


}

