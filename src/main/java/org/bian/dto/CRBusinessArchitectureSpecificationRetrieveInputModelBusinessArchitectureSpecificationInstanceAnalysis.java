package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceAnalysis
 */
public class CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceAnalysis   {
  private String businessArchitectureSpecificationInstanceAnalysisReference = null;

  private String businessArchitectureSpecificationInstanceAnalysisReportType = null;

  private String businessArchitectureSpecificationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return businessArchitectureSpecificationInstanceAnalysisReference
  **/

  public String getBusinessArchitectureSpecificationInstanceAnalysisReference() {
    return businessArchitectureSpecificationInstanceAnalysisReference;
  }

  public void setBusinessArchitectureSpecificationInstanceAnalysisReference(String businessArchitectureSpecificationInstanceAnalysisReference) {
    this.businessArchitectureSpecificationInstanceAnalysisReference = businessArchitectureSpecificationInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return businessArchitectureSpecificationInstanceAnalysisReportType
  **/

  public String getBusinessArchitectureSpecificationInstanceAnalysisReportType() {
    return businessArchitectureSpecificationInstanceAnalysisReportType;
  }

  public void setBusinessArchitectureSpecificationInstanceAnalysisReportType(String businessArchitectureSpecificationInstanceAnalysisReportType) {
    this.businessArchitectureSpecificationInstanceAnalysisReportType = businessArchitectureSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return businessArchitectureSpecificationInstanceAnalysisParameters
  **/

  public String getBusinessArchitectureSpecificationInstanceAnalysisParameters() {
    return businessArchitectureSpecificationInstanceAnalysisParameters;
  }

  public void setBusinessArchitectureSpecificationInstanceAnalysisParameters(String businessArchitectureSpecificationInstanceAnalysisParameters) {
    this.businessArchitectureSpecificationInstanceAnalysisParameters = businessArchitectureSpecificationInstanceAnalysisParameters;
  }


}

