package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceAnalysis;
import org.bian.dto.BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInformationArchitectureRetrieveInputModel
 */
public class BQInformationArchitectureRetrieveInputModel   {
  private Object informationArchitectureRetrieveActionTaskRecord = null;

  private String informationArchitectureRetrieveActionRequest = null;

  private BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceReport informationArchitectureInstanceReport = null;

  private BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceAnalysis informationArchitectureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return informationArchitectureRetrieveActionTaskRecord
  **/

  public Object getInformationArchitectureRetrieveActionTaskRecord() {
    return informationArchitectureRetrieveActionTaskRecord;
  }

  public void setInformationArchitectureRetrieveActionTaskRecord(Object informationArchitectureRetrieveActionTaskRecord) {
    this.informationArchitectureRetrieveActionTaskRecord = informationArchitectureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return informationArchitectureRetrieveActionRequest
  **/

  public String getInformationArchitectureRetrieveActionRequest() {
    return informationArchitectureRetrieveActionRequest;
  }

  public void setInformationArchitectureRetrieveActionRequest(String informationArchitectureRetrieveActionRequest) {
    this.informationArchitectureRetrieveActionRequest = informationArchitectureRetrieveActionRequest;
  }


  /**
   * Get informationArchitectureInstanceReport
   * @return informationArchitectureInstanceReport
  **/

  public BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceReport getInformationArchitectureInstanceReport() {
    return informationArchitectureInstanceReport;
  }

  public void setInformationArchitectureInstanceReport(BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceReport informationArchitectureInstanceReport) {
    this.informationArchitectureInstanceReport = informationArchitectureInstanceReport;
  }


  /**
   * Get informationArchitectureInstanceAnalysis
   * @return informationArchitectureInstanceAnalysis
  **/

  public BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceAnalysis getInformationArchitectureInstanceAnalysis() {
    return informationArchitectureInstanceAnalysis;
  }

  public void setInformationArchitectureInstanceAnalysis(BQInformationArchitectureRetrieveInputModelInformationArchitectureInstanceAnalysis informationArchitectureInstanceAnalysis) {
    this.informationArchitectureInstanceAnalysis = informationArchitectureInstanceAnalysis;
  }


}

