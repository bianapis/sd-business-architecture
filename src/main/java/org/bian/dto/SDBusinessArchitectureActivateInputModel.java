package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureActivateInputModel
 */
public class SDBusinessArchitectureActivateInputModel   {
  private Object businessArchitectureActivationActionTaskRecord = null;

  private String businessArchitectureCenterReference = null;

  private String businessArchitectureServiceReference = null;

  private SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecord businessArchitectureServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return businessArchitectureActivationActionTaskRecord
  **/

  public Object getBusinessArchitectureActivationActionTaskRecord() {
    return businessArchitectureActivationActionTaskRecord;
  }

  public void setBusinessArchitectureActivationActionTaskRecord(Object businessArchitectureActivationActionTaskRecord) {
    this.businessArchitectureActivationActionTaskRecord = businessArchitectureActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return businessArchitectureCenterReference
  **/

  public String getBusinessArchitectureCenterReference() {
    return businessArchitectureCenterReference;
  }

  public void setBusinessArchitectureCenterReference(String businessArchitectureCenterReference) {
    this.businessArchitectureCenterReference = businessArchitectureCenterReference;
  }


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
   * Get businessArchitectureServiceConfigurationRecord
   * @return businessArchitectureServiceConfigurationRecord
  **/

  public SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecord getBusinessArchitectureServiceConfigurationRecord() {
    return businessArchitectureServiceConfigurationRecord;
  }

  public void setBusinessArchitectureServiceConfigurationRecord(SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecord businessArchitectureServiceConfigurationRecord) {
    this.businessArchitectureServiceConfigurationRecord = businessArchitectureServiceConfigurationRecord;
  }


}

