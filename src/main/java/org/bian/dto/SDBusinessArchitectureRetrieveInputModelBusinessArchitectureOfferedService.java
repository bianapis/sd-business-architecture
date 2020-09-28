package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedService
 */
public class SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedService   {
  private String businessArchitectureServiceReference = null;

  private SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord businessArchitectureServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return businessArchitectureServiceReference
  **/

  public String getBusinessArchitectureServiceReference() {
    return businessArchitectureServiceReference;
  }

  public void setBusinessArchitectureServiceReference(String businessArchitectureServiceReference) {
    this.businessArchitectureServiceReference = businessArchitectureServiceReference;
  }


  /**
   * Get businessArchitectureServiceRecord
   * @return businessArchitectureServiceRecord
  **/

  public SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord getBusinessArchitectureServiceRecord() {
    return businessArchitectureServiceRecord;
  }

  public void setBusinessArchitectureServiceRecord(SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord businessArchitectureServiceRecord) {
    this.businessArchitectureServiceRecord = businessArchitectureServiceRecord;
  }


}

