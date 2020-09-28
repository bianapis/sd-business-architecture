package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceAnalysis
 */
public class BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceAnalysis   {
  private Object informationArchitectureInstanceAnalysisRecord = null;

  private String informationArchitectureInstanceAnalysisReportType = null;

  private String informationArchitectureInstanceAnalysisParameters = null;

  private Object informationArchitectureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return informationArchitectureInstanceAnalysisRecord
  **/

  public Object getInformationArchitectureInstanceAnalysisRecord() {
    return informationArchitectureInstanceAnalysisRecord;
  }

  public void setInformationArchitectureInstanceAnalysisRecord(Object informationArchitectureInstanceAnalysisRecord) {
    this.informationArchitectureInstanceAnalysisRecord = informationArchitectureInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return informationArchitectureInstanceAnalysisReportType
  **/

  public String getInformationArchitectureInstanceAnalysisReportType() {
    return informationArchitectureInstanceAnalysisReportType;
  }

  public void setInformationArchitectureInstanceAnalysisReportType(String informationArchitectureInstanceAnalysisReportType) {
    this.informationArchitectureInstanceAnalysisReportType = informationArchitectureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return informationArchitectureInstanceAnalysisParameters
  **/

  public String getInformationArchitectureInstanceAnalysisParameters() {
    return informationArchitectureInstanceAnalysisParameters;
  }

  public void setInformationArchitectureInstanceAnalysisParameters(String informationArchitectureInstanceAnalysisParameters) {
    this.informationArchitectureInstanceAnalysisParameters = informationArchitectureInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return informationArchitectureInstanceAnalysisReport
  **/

  public Object getInformationArchitectureInstanceAnalysisReport() {
    return informationArchitectureInstanceAnalysisReport;
  }

  public void setInformationArchitectureInstanceAnalysisReport(Object informationArchitectureInstanceAnalysisReport) {
    this.informationArchitectureInstanceAnalysisReport = informationArchitectureInstanceAnalysisReport;
  }


}

