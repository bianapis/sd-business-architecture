package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceAnalysis;
import org.bian.dto.CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessArchitectureSpecificationRetrieveInputModel
 */
public class CRBusinessArchitectureSpecificationRetrieveInputModel   {
  private Object businessArchitectureSpecificationRetrieveActionTaskRecord = null;

  private String businessArchitectureSpecificationRetrieveActionRequest = null;

  private CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceReportRecord businessArchitectureSpecificationInstanceReportRecord = null;

  private CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceAnalysis businessArchitectureSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return businessArchitectureSpecificationRetrieveActionTaskRecord
  **/

  public Object getBusinessArchitectureSpecificationRetrieveActionTaskRecord() {
    return businessArchitectureSpecificationRetrieveActionTaskRecord;
  }

  public void setBusinessArchitectureSpecificationRetrieveActionTaskRecord(Object businessArchitectureSpecificationRetrieveActionTaskRecord) {
    this.businessArchitectureSpecificationRetrieveActionTaskRecord = businessArchitectureSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return businessArchitectureSpecificationRetrieveActionRequest
  **/

  public String getBusinessArchitectureSpecificationRetrieveActionRequest() {
    return businessArchitectureSpecificationRetrieveActionRequest;
  }

  public void setBusinessArchitectureSpecificationRetrieveActionRequest(String businessArchitectureSpecificationRetrieveActionRequest) {
    this.businessArchitectureSpecificationRetrieveActionRequest = businessArchitectureSpecificationRetrieveActionRequest;
  }


  /**
   * Get businessArchitectureSpecificationInstanceReportRecord
   * @return businessArchitectureSpecificationInstanceReportRecord
  **/

  public CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceReportRecord getBusinessArchitectureSpecificationInstanceReportRecord() {
    return businessArchitectureSpecificationInstanceReportRecord;
  }

  public void setBusinessArchitectureSpecificationInstanceReportRecord(CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceReportRecord businessArchitectureSpecificationInstanceReportRecord) {
    this.businessArchitectureSpecificationInstanceReportRecord = businessArchitectureSpecificationInstanceReportRecord;
  }


  /**
   * Get businessArchitectureSpecificationInstanceAnalysis
   * @return businessArchitectureSpecificationInstanceAnalysis
  **/

  public CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceAnalysis getBusinessArchitectureSpecificationInstanceAnalysis() {
    return businessArchitectureSpecificationInstanceAnalysis;
  }

  public void setBusinessArchitectureSpecificationInstanceAnalysis(CRBusinessArchitectureSpecificationRetrieveInputModelBusinessArchitectureSpecificationInstanceAnalysis businessArchitectureSpecificationInstanceAnalysis) {
    this.businessArchitectureSpecificationInstanceAnalysis = businessArchitectureSpecificationInstanceAnalysis;
  }


}

