package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedService
 */
public class SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedService   {
  private String businessArchitectureServiceReference = null;

  private SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord businessArchitectureServiceRecord = null;


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

  public SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord getBusinessArchitectureServiceRecord() {
    return businessArchitectureServiceRecord;
  }

  public void setBusinessArchitectureServiceRecord(SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord businessArchitectureServiceRecord) {
    this.businessArchitectureServiceRecord = businessArchitectureServiceRecord;
  }


}

