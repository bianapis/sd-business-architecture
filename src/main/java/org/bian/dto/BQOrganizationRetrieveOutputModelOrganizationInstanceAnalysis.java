package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrganizationRetrieveOutputModelOrganizationInstanceAnalysis
 */
public class BQOrganizationRetrieveOutputModelOrganizationInstanceAnalysis   {
  private Object organizationInstanceAnalysisRecord = null;

  private String organizationInstanceAnalysisReportType = null;

  private String organizationInstanceAnalysisParameters = null;

  private Object organizationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return organizationInstanceAnalysisRecord
  **/

  public Object getOrganizationInstanceAnalysisRecord() {
    return organizationInstanceAnalysisRecord;
  }

  public void setOrganizationInstanceAnalysisRecord(Object organizationInstanceAnalysisRecord) {
    this.organizationInstanceAnalysisRecord = organizationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return organizationInstanceAnalysisReportType
  **/

  public String getOrganizationInstanceAnalysisReportType() {
    return organizationInstanceAnalysisReportType;
  }

  public void setOrganizationInstanceAnalysisReportType(String organizationInstanceAnalysisReportType) {
    this.organizationInstanceAnalysisReportType = organizationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return organizationInstanceAnalysisParameters
  **/

  public String getOrganizationInstanceAnalysisParameters() {
    return organizationInstanceAnalysisParameters;
  }

  public void setOrganizationInstanceAnalysisParameters(String organizationInstanceAnalysisParameters) {
    this.organizationInstanceAnalysisParameters = organizationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return organizationInstanceAnalysisReport
  **/

  public Object getOrganizationInstanceAnalysisReport() {
    return organizationInstanceAnalysisReport;
  }

  public void setOrganizationInstanceAnalysisReport(Object organizationInstanceAnalysisReport) {
    this.organizationInstanceAnalysisReport = organizationInstanceAnalysisReport;
  }


}

