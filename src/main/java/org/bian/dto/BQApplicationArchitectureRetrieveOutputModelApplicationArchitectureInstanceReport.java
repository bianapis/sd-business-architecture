package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceReport
 */
public class BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceReport   {
  private Object applicationArchitectureInstanceReportRecord = null;

  private String applicationArchitectureInstanceReportType = null;

  private String applicationArchitectureInstanceReportParameters = null;

  private Object applicationArchitectureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return applicationArchitectureInstanceReportRecord
  **/

  public Object getApplicationArchitectureInstanceReportRecord() {
    return applicationArchitectureInstanceReportRecord;
  }

  public void setApplicationArchitectureInstanceReportRecord(Object applicationArchitectureInstanceReportRecord) {
    this.applicationArchitectureInstanceReportRecord = applicationArchitectureInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return applicationArchitectureInstanceReportType
  **/

  public String getApplicationArchitectureInstanceReportType() {
    return applicationArchitectureInstanceReportType;
  }

  public void setApplicationArchitectureInstanceReportType(String applicationArchitectureInstanceReportType) {
    this.applicationArchitectureInstanceReportType = applicationArchitectureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return applicationArchitectureInstanceReportParameters
  **/

  public String getApplicationArchitectureInstanceReportParameters() {
    return applicationArchitectureInstanceReportParameters;
  }

  public void setApplicationArchitectureInstanceReportParameters(String applicationArchitectureInstanceReportParameters) {
    this.applicationArchitectureInstanceReportParameters = applicationArchitectureInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return applicationArchitectureInstanceReport
  **/

  public Object getApplicationArchitectureInstanceReport() {
    return applicationArchitectureInstanceReport;
  }

  public void setApplicationArchitectureInstanceReport(Object applicationArchitectureInstanceReport) {
    this.applicationArchitectureInstanceReport = applicationArchitectureInstanceReport;
  }


}

