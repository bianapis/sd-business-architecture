package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceAnalysis
 */
public class BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceAnalysis   {
  private Object applicationArchitectureInstanceAnalysisRecord = null;

  private String applicationArchitectureInstanceAnalysisReportType = null;

  private String applicationArchitectureInstanceAnalysisParameters = null;

  private Object applicationArchitectureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return applicationArchitectureInstanceAnalysisRecord
  **/

  public Object getApplicationArchitectureInstanceAnalysisRecord() {
    return applicationArchitectureInstanceAnalysisRecord;
  }

  public void setApplicationArchitectureInstanceAnalysisRecord(Object applicationArchitectureInstanceAnalysisRecord) {
    this.applicationArchitectureInstanceAnalysisRecord = applicationArchitectureInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return applicationArchitectureInstanceAnalysisReportType
  **/

  public String getApplicationArchitectureInstanceAnalysisReportType() {
    return applicationArchitectureInstanceAnalysisReportType;
  }

  public void setApplicationArchitectureInstanceAnalysisReportType(String applicationArchitectureInstanceAnalysisReportType) {
    this.applicationArchitectureInstanceAnalysisReportType = applicationArchitectureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return applicationArchitectureInstanceAnalysisParameters
  **/

  public String getApplicationArchitectureInstanceAnalysisParameters() {
    return applicationArchitectureInstanceAnalysisParameters;
  }

  public void setApplicationArchitectureInstanceAnalysisParameters(String applicationArchitectureInstanceAnalysisParameters) {
    this.applicationArchitectureInstanceAnalysisParameters = applicationArchitectureInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return applicationArchitectureInstanceAnalysisReport
  **/

  public Object getApplicationArchitectureInstanceAnalysisReport() {
    return applicationArchitectureInstanceAnalysisReport;
  }

  public void setApplicationArchitectureInstanceAnalysisReport(Object applicationArchitectureInstanceAnalysisReport) {
    this.applicationArchitectureInstanceAnalysisReport = applicationArchitectureInstanceAnalysisReport;
  }


}

