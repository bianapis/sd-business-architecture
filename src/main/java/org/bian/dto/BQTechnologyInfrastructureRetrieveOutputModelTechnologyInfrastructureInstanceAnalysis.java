package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceAnalysis
 */
public class BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceAnalysis   {
  private Object technologyInfrastructureInstanceAnalysisRecord = null;

  private String technologyInfrastructureInstanceAnalysisReportType = null;

  private String technologyInfrastructureInstanceAnalysisParameters = null;

  private Object technologyInfrastructureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return technologyInfrastructureInstanceAnalysisRecord
  **/

  public Object getTechnologyInfrastructureInstanceAnalysisRecord() {
    return technologyInfrastructureInstanceAnalysisRecord;
  }

  public void setTechnologyInfrastructureInstanceAnalysisRecord(Object technologyInfrastructureInstanceAnalysisRecord) {
    this.technologyInfrastructureInstanceAnalysisRecord = technologyInfrastructureInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return technologyInfrastructureInstanceAnalysisReportType
  **/

  public String getTechnologyInfrastructureInstanceAnalysisReportType() {
    return technologyInfrastructureInstanceAnalysisReportType;
  }

  public void setTechnologyInfrastructureInstanceAnalysisReportType(String technologyInfrastructureInstanceAnalysisReportType) {
    this.technologyInfrastructureInstanceAnalysisReportType = technologyInfrastructureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return technologyInfrastructureInstanceAnalysisParameters
  **/

  public String getTechnologyInfrastructureInstanceAnalysisParameters() {
    return technologyInfrastructureInstanceAnalysisParameters;
  }

  public void setTechnologyInfrastructureInstanceAnalysisParameters(String technologyInfrastructureInstanceAnalysisParameters) {
    this.technologyInfrastructureInstanceAnalysisParameters = technologyInfrastructureInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return technologyInfrastructureInstanceAnalysisReport
  **/

  public Object getTechnologyInfrastructureInstanceAnalysisReport() {
    return technologyInfrastructureInstanceAnalysisReport;
  }

  public void setTechnologyInfrastructureInstanceAnalysisReport(Object technologyInfrastructureInstanceAnalysisReport) {
    this.technologyInfrastructureInstanceAnalysisReport = technologyInfrastructureInstanceAnalysisReport;
  }


}

