package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQApplicationArchitectureRetrieveInputModelApplicationArchitectureInstanceAnalysis;
import org.bian.dto.BQApplicationArchitectureRetrieveInputModelApplicationArchitectureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQApplicationArchitectureRetrieveInputModel
 */
public class BQApplicationArchitectureRetrieveInputModel   {
  private Object applicationArchitectureRetrieveActionTaskRecord = null;

  private String applicationArchitectureRetrieveActionRequest = null;

  private BQApplicationArchitectureRetrieveInputModelApplicationArchitectureInstanceReport applicationArchitectureInstanceReport = null;

  private BQApplicationArchitectureRetrieveInputModelApplicationArchitectureInstanceAnalysis applicationArchitectureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return applicationArchitectureRetrieveActionTaskRecord
  **/

  public Object getApplicationArchitectureRetrieveActionTaskRecord() {
    return applicationArchitectureRetrieveActionTaskRecord;
  }

  public void setApplicationArchitectureRetrieveActionTaskRecord(Object applicationArchitectureRetrieveActionTaskRecord) {
    this.applicationArchitectureRetrieveActionTaskRecord = applicationArchitectureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return applicationArchitectureRetrieveActionRequest
  **/

  public String getApplicationArchitectureRetrieveActionRequest() {
    return applicationArchitectureRetrieveActionRequest;
  }

  public void setApplicationArchitectureRetrieveActionRequest(String applicationArchitectureRetrieveActionRequest) {
    this.applicationArchitectureRetrieveActionRequest = applicationArchitectureRetrieveActionRequest;
  }


  /**
   * Get applicationArchitectureInstanceReport
   * @return applicationArchitectureInstanceReport
  **/

  public BQApplicationArchitectureRetrieveInputModelApplicationArchitectureInstanceReport getApplicationArchitectureInstanceReport() {
    return applicationArchitectureInstanceReport;
  }

  public void setApplicationArchitectureInstanceReport(BQApplicationArchitectureRetrieveInputModelApplicationArchitectureInstanceReport applicationArchitectureInstanceReport) {
    this.applicationArchitectureInstanceReport = applicationArchitectureInstanceReport;
  }


  /**
   * Get applicationArchitectureInstanceAnalysis
   * @return applicationArchitectureInstanceAnalysis
  **/

  public BQApplicationArchitectureRetrieveInputModelApplicationArchitectureInstanceAnalysis getApplicationArchitectureInstanceAnalysis() {
    return applicationArchitectureInstanceAnalysis;
  }

  public void setApplicationArchitectureInstanceAnalysis(BQApplicationArchitectureRetrieveInputModelApplicationArchitectureInstanceAnalysis applicationArchitectureInstanceAnalysis) {
    this.applicationArchitectureInstanceAnalysis = applicationArchitectureInstanceAnalysis;
  }


}

