package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceAnalysis;
import org.bian.dto.BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTechnologyInfrastructureRetrieveInputModel
 */
public class BQTechnologyInfrastructureRetrieveInputModel   {
  private Object technologyInfrastructureRetrieveActionTaskRecord = null;

  private String technologyInfrastructureRetrieveActionRequest = null;

  private BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceReport technologyInfrastructureInstanceReport = null;

  private BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceAnalysis technologyInfrastructureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return technologyInfrastructureRetrieveActionTaskRecord
  **/

  public Object getTechnologyInfrastructureRetrieveActionTaskRecord() {
    return technologyInfrastructureRetrieveActionTaskRecord;
  }

  public void setTechnologyInfrastructureRetrieveActionTaskRecord(Object technologyInfrastructureRetrieveActionTaskRecord) {
    this.technologyInfrastructureRetrieveActionTaskRecord = technologyInfrastructureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return technologyInfrastructureRetrieveActionRequest
  **/

  public String getTechnologyInfrastructureRetrieveActionRequest() {
    return technologyInfrastructureRetrieveActionRequest;
  }

  public void setTechnologyInfrastructureRetrieveActionRequest(String technologyInfrastructureRetrieveActionRequest) {
    this.technologyInfrastructureRetrieveActionRequest = technologyInfrastructureRetrieveActionRequest;
  }


  /**
   * Get technologyInfrastructureInstanceReport
   * @return technologyInfrastructureInstanceReport
  **/

  public BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceReport getTechnologyInfrastructureInstanceReport() {
    return technologyInfrastructureInstanceReport;
  }

  public void setTechnologyInfrastructureInstanceReport(BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceReport technologyInfrastructureInstanceReport) {
    this.technologyInfrastructureInstanceReport = technologyInfrastructureInstanceReport;
  }


  /**
   * Get technologyInfrastructureInstanceAnalysis
   * @return technologyInfrastructureInstanceAnalysis
  **/

  public BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceAnalysis getTechnologyInfrastructureInstanceAnalysis() {
    return technologyInfrastructureInstanceAnalysis;
  }

  public void setTechnologyInfrastructureInstanceAnalysis(BQTechnologyInfrastructureRetrieveInputModelTechnologyInfrastructureInstanceAnalysis technologyInfrastructureInstanceAnalysis) {
    this.technologyInfrastructureInstanceAnalysis = technologyInfrastructureInstanceAnalysis;
  }


}

