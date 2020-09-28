package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceReport
 */
public class BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceReport   {
  private Object technologyInfrastructureInstanceReportRecord = null;

  private String technologyInfrastructureInstanceReportType = null;

  private String technologyInfrastructureInstanceReportParameters = null;

  private Object technologyInfrastructureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return technologyInfrastructureInstanceReportRecord
  **/

  public Object getTechnologyInfrastructureInstanceReportRecord() {
    return technologyInfrastructureInstanceReportRecord;
  }

  public void setTechnologyInfrastructureInstanceReportRecord(Object technologyInfrastructureInstanceReportRecord) {
    this.technologyInfrastructureInstanceReportRecord = technologyInfrastructureInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return technologyInfrastructureInstanceReportType
  **/

  public String getTechnologyInfrastructureInstanceReportType() {
    return technologyInfrastructureInstanceReportType;
  }

  public void setTechnologyInfrastructureInstanceReportType(String technologyInfrastructureInstanceReportType) {
    this.technologyInfrastructureInstanceReportType = technologyInfrastructureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return technologyInfrastructureInstanceReportParameters
  **/

  public String getTechnologyInfrastructureInstanceReportParameters() {
    return technologyInfrastructureInstanceReportParameters;
  }

  public void setTechnologyInfrastructureInstanceReportParameters(String technologyInfrastructureInstanceReportParameters) {
    this.technologyInfrastructureInstanceReportParameters = technologyInfrastructureInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return technologyInfrastructureInstanceReport
  **/

  public Object getTechnologyInfrastructureInstanceReport() {
    return technologyInfrastructureInstanceReport;
  }

  public void setTechnologyInfrastructureInstanceReport(Object technologyInfrastructureInstanceReport) {
    this.technologyInfrastructureInstanceReport = technologyInfrastructureInstanceReport;
  }


}

