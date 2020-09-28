package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceReport
 */
public class BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceReport   {
  private Object informationArchitectureInstanceReportRecord = null;

  private String informationArchitectureInstanceReportType = null;

  private String informationArchitectureInstanceReportParameters = null;

  private Object informationArchitectureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return informationArchitectureInstanceReportRecord
  **/

  public Object getInformationArchitectureInstanceReportRecord() {
    return informationArchitectureInstanceReportRecord;
  }

  public void setInformationArchitectureInstanceReportRecord(Object informationArchitectureInstanceReportRecord) {
    this.informationArchitectureInstanceReportRecord = informationArchitectureInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return informationArchitectureInstanceReportType
  **/

  public String getInformationArchitectureInstanceReportType() {
    return informationArchitectureInstanceReportType;
  }

  public void setInformationArchitectureInstanceReportType(String informationArchitectureInstanceReportType) {
    this.informationArchitectureInstanceReportType = informationArchitectureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return informationArchitectureInstanceReportParameters
  **/

  public String getInformationArchitectureInstanceReportParameters() {
    return informationArchitectureInstanceReportParameters;
  }

  public void setInformationArchitectureInstanceReportParameters(String informationArchitectureInstanceReportParameters) {
    this.informationArchitectureInstanceReportParameters = informationArchitectureInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return informationArchitectureInstanceReport
  **/

  public Object getInformationArchitectureInstanceReport() {
    return informationArchitectureInstanceReport;
  }

  public void setInformationArchitectureInstanceReport(Object informationArchitectureInstanceReport) {
    this.informationArchitectureInstanceReport = informationArchitectureInstanceReport;
  }


}

