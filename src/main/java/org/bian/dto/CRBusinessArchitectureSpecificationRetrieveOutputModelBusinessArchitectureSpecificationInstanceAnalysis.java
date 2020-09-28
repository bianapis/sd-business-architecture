package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceAnalysis
 */
public class CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceAnalysis   {
  private String businessArchitectureSpecificationInstanceAnalysisData = null;

  private String businessArchitectureSpecificationInstanceAnalysisReportType = null;

  private Object businessArchitectureSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return businessArchitectureSpecificationInstanceAnalysisData
  **/

  public String getBusinessArchitectureSpecificationInstanceAnalysisData() {
    return businessArchitectureSpecificationInstanceAnalysisData;
  }

  public void setBusinessArchitectureSpecificationInstanceAnalysisData(String businessArchitectureSpecificationInstanceAnalysisData) {
    this.businessArchitectureSpecificationInstanceAnalysisData = businessArchitectureSpecificationInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return businessArchitectureSpecificationInstanceAnalysisReport
  **/

  public Object getBusinessArchitectureSpecificationInstanceAnalysisReport() {
    return businessArchitectureSpecificationInstanceAnalysisReport;
  }

  public void setBusinessArchitectureSpecificationInstanceAnalysisReport(Object businessArchitectureSpecificationInstanceAnalysisReport) {
    this.businessArchitectureSpecificationInstanceAnalysisReport = businessArchitectureSpecificationInstanceAnalysisReport;
  }


}

