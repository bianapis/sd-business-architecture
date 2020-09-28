package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBusinessArchitectureRetrieveOutputModelBusinessArchitectureInstanceReport
 */
public class BQBusinessArchitectureRetrieveOutputModelBusinessArchitectureInstanceReport   {
  private Object businessArchitectureInstanceReportRecord = null;

  private String businessArchitectureInstanceReportType = null;

  private String businessArchitectureInstanceReportParameters = null;

  private Object businessArchitectureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return businessArchitectureInstanceReportRecord
  **/

  public Object getBusinessArchitectureInstanceReportRecord() {
    return businessArchitectureInstanceReportRecord;
  }

  public void setBusinessArchitectureInstanceReportRecord(Object businessArchitectureInstanceReportRecord) {
    this.businessArchitectureInstanceReportRecord = businessArchitectureInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return businessArchitectureInstanceReportType
  **/

  public String getBusinessArchitectureInstanceReportType() {
    return businessArchitectureInstanceReportType;
  }

  public void setBusinessArchitectureInstanceReportType(String businessArchitectureInstanceReportType) {
    this.businessArchitectureInstanceReportType = businessArchitectureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return businessArchitectureInstanceReportParameters
  **/

  public String getBusinessArchitectureInstanceReportParameters() {
    return businessArchitectureInstanceReportParameters;
  }

  public void setBusinessArchitectureInstanceReportParameters(String businessArchitectureInstanceReportParameters) {
    this.businessArchitectureInstanceReportParameters = businessArchitectureInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return businessArchitectureInstanceReport
  **/

  public Object getBusinessArchitectureInstanceReport() {
    return businessArchitectureInstanceReport;
  }

  public void setBusinessArchitectureInstanceReport(Object businessArchitectureInstanceReport) {
    this.businessArchitectureInstanceReport = businessArchitectureInstanceReport;
  }


}

