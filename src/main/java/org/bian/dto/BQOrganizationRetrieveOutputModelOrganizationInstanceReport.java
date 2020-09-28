package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrganizationRetrieveOutputModelOrganizationInstanceReport
 */
public class BQOrganizationRetrieveOutputModelOrganizationInstanceReport   {
  private Object organizationInstanceReportRecord = null;

  private String organizationInstanceReportType = null;

  private String organizationInstanceReportParameters = null;

  private Object organizationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return organizationInstanceReportRecord
  **/

  public Object getOrganizationInstanceReportRecord() {
    return organizationInstanceReportRecord;
  }

  public void setOrganizationInstanceReportRecord(Object organizationInstanceReportRecord) {
    this.organizationInstanceReportRecord = organizationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return organizationInstanceReportType
  **/

  public String getOrganizationInstanceReportType() {
    return organizationInstanceReportType;
  }

  public void setOrganizationInstanceReportType(String organizationInstanceReportType) {
    this.organizationInstanceReportType = organizationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return organizationInstanceReportParameters
  **/

  public String getOrganizationInstanceReportParameters() {
    return organizationInstanceReportParameters;
  }

  public void setOrganizationInstanceReportParameters(String organizationInstanceReportParameters) {
    this.organizationInstanceReportParameters = organizationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return organizationInstanceReport
  **/

  public Object getOrganizationInstanceReport() {
    return organizationInstanceReport;
  }

  public void setOrganizationInstanceReport(Object organizationInstanceReport) {
    this.organizationInstanceReport = organizationInstanceReport;
  }


}

