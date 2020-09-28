package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBusinessArchitectureRetrieveInputModelBusinessArchitectureInstanceAnalysis;
import org.bian.dto.BQBusinessArchitectureRetrieveInputModelBusinessArchitectureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBusinessArchitectureRetrieveInputModel
 */
public class BQBusinessArchitectureRetrieveInputModel   {
  private Object businessArchitectureRetrieveActionTaskRecord = null;

  private String businessArchitectureRetrieveActionRequest = null;

  private BQBusinessArchitectureRetrieveInputModelBusinessArchitectureInstanceReport businessArchitectureInstanceReport = null;

  private BQBusinessArchitectureRetrieveInputModelBusinessArchitectureInstanceAnalysis businessArchitectureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return businessArchitectureRetrieveActionTaskRecord
  **/

  public Object getBusinessArchitectureRetrieveActionTaskRecord() {
    return businessArchitectureRetrieveActionTaskRecord;
  }

  public void setBusinessArchitectureRetrieveActionTaskRecord(Object businessArchitectureRetrieveActionTaskRecord) {
    this.businessArchitectureRetrieveActionTaskRecord = businessArchitectureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return businessArchitectureRetrieveActionRequest
  **/

  public String getBusinessArchitectureRetrieveActionRequest() {
    return businessArchitectureRetrieveActionRequest;
  }

  public void setBusinessArchitectureRetrieveActionRequest(String businessArchitectureRetrieveActionRequest) {
    this.businessArchitectureRetrieveActionRequest = businessArchitectureRetrieveActionRequest;
  }


  /**
   * Get businessArchitectureInstanceReport
   * @return businessArchitectureInstanceReport
  **/

  public BQBusinessArchitectureRetrieveInputModelBusinessArchitectureInstanceReport getBusinessArchitectureInstanceReport() {
    return businessArchitectureInstanceReport;
  }

  public void setBusinessArchitectureInstanceReport(BQBusinessArchitectureRetrieveInputModelBusinessArchitectureInstanceReport businessArchitectureInstanceReport) {
    this.businessArchitectureInstanceReport = businessArchitectureInstanceReport;
  }


  /**
   * Get businessArchitectureInstanceAnalysis
   * @return businessArchitectureInstanceAnalysis
  **/

  public BQBusinessArchitectureRetrieveInputModelBusinessArchitectureInstanceAnalysis getBusinessArchitectureInstanceAnalysis() {
    return businessArchitectureInstanceAnalysis;
  }

  public void setBusinessArchitectureInstanceAnalysis(BQBusinessArchitectureRetrieveInputModelBusinessArchitectureInstanceAnalysis businessArchitectureInstanceAnalysis) {
    this.businessArchitectureInstanceAnalysis = businessArchitectureInstanceAnalysis;
  }


}

