package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceReportRecord
 */
public class CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceReportRecord   {
  private String businessArchitectureSpecificationInstanceReportData = null;

  private String businessArchitectureSpecificationInstanceReportType = null;

  private Object businessArchitectureSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return businessArchitectureSpecificationInstanceReportData
  **/

  public String getBusinessArchitectureSpecificationInstanceReportData() {
    return businessArchitectureSpecificationInstanceReportData;
  }

  public void setBusinessArchitectureSpecificationInstanceReportData(String businessArchitectureSpecificationInstanceReportData) {
    this.businessArchitectureSpecificationInstanceReportData = businessArchitectureSpecificationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return businessArchitectureSpecificationInstanceReportType
  **/

  public String getBusinessArchitectureSpecificationInstanceReportType() {
    return businessArchitectureSpecificationInstanceReportType;
  }

  public void setBusinessArchitectureSpecificationInstanceReportType(String businessArchitectureSpecificationInstanceReportType) {
    this.businessArchitectureSpecificationInstanceReportType = businessArchitectureSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return businessArchitectureSpecificationInstanceReport
  **/

  public Object getBusinessArchitectureSpecificationInstanceReport() {
    return businessArchitectureSpecificationInstanceReport;
  }

  public void setBusinessArchitectureSpecificationInstanceReport(Object businessArchitectureSpecificationInstanceReport) {
    this.businessArchitectureSpecificationInstanceReport = businessArchitectureSpecificationInstanceReport;
  }


}

