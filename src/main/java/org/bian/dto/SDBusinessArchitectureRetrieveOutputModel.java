package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedService;
import org.bian.dto.SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureRetrieveOutputModel
 */
public class SDBusinessArchitectureRetrieveOutputModel   {
  private String businessArchitectureRetrieveActionTaskReference = null;

  private Object businessArchitectureRetrieveActionTaskRecord = null;

  private String businessArchitectureRetrieveActionResponse = null;

  private SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecord businessArchitectureRetrieveActionRecord = null;

  private SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedService businessArchitectureOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return businessArchitectureRetrieveActionTaskReference
  **/

  public String getBusinessArchitectureRetrieveActionTaskReference() {
    return businessArchitectureRetrieveActionTaskReference;
  }

  public void setBusinessArchitectureRetrieveActionTaskReference(String businessArchitectureRetrieveActionTaskReference) {
    this.businessArchitectureRetrieveActionTaskReference = businessArchitectureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return businessArchitectureRetrieveActionResponse
  **/

  public String getBusinessArchitectureRetrieveActionResponse() {
    return businessArchitectureRetrieveActionResponse;
  }

  public void setBusinessArchitectureRetrieveActionResponse(String businessArchitectureRetrieveActionResponse) {
    this.businessArchitectureRetrieveActionResponse = businessArchitectureRetrieveActionResponse;
  }


  /**
   * Get businessArchitectureRetrieveActionRecord
   * @return businessArchitectureRetrieveActionRecord
  **/

  public SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecord getBusinessArchitectureRetrieveActionRecord() {
    return businessArchitectureRetrieveActionRecord;
  }

  public void setBusinessArchitectureRetrieveActionRecord(SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecord businessArchitectureRetrieveActionRecord) {
    this.businessArchitectureRetrieveActionRecord = businessArchitectureRetrieveActionRecord;
  }


  /**
   * Get businessArchitectureOfferedService
   * @return businessArchitectureOfferedService
  **/

  public SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedService getBusinessArchitectureOfferedService() {
    return businessArchitectureOfferedService;
  }

  public void setBusinessArchitectureOfferedService(SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedService businessArchitectureOfferedService) {
    this.businessArchitectureOfferedService = businessArchitectureOfferedService;
  }


}

