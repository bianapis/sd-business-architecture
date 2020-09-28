package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedService;
import org.bian.dto.SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureRetrieveInputModel
 */
public class SDBusinessArchitectureRetrieveInputModel   {
  private Object businessArchitectureRetrieveActionTaskRecord = null;

  private String businessArchitectureRetrieveActionRequest = null;

  private SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecord businessArchitectureRetrieveActionRecord = null;

  private SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedService businessArchitectureOfferedService = null;


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
   * Get businessArchitectureRetrieveActionRecord
   * @return businessArchitectureRetrieveActionRecord
  **/

  public SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecord getBusinessArchitectureRetrieveActionRecord() {
    return businessArchitectureRetrieveActionRecord;
  }

  public void setBusinessArchitectureRetrieveActionRecord(SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecord businessArchitectureRetrieveActionRecord) {
    this.businessArchitectureRetrieveActionRecord = businessArchitectureRetrieveActionRecord;
  }


  /**
   * Get businessArchitectureOfferedService
   * @return businessArchitectureOfferedService
  **/

  public SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedService getBusinessArchitectureOfferedService() {
    return businessArchitectureOfferedService;
  }

  public void setBusinessArchitectureOfferedService(SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedService businessArchitectureOfferedService) {
    this.businessArchitectureOfferedService = businessArchitectureOfferedService;
  }


}

