package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureActivateOutputModel
 */
public class SDBusinessArchitectureActivateOutputModel   {
  private String businessArchitectureActivationActionTaskReference = null;

  private Object businessArchitectureActivationActionTaskRecord = null;

  private String businessArchitectureServicingSessionReference = null;

  private Object businessArchitectureServicingSessionRecord = null;

  private SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecord businessArchitectureServiceConfigurationRecord = null;

  private String businessArchitectureServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return businessArchitectureActivationActionTaskReference
  **/

  public String getBusinessArchitectureActivationActionTaskReference() {
    return businessArchitectureActivationActionTaskReference;
  }

  public void setBusinessArchitectureActivationActionTaskReference(String businessArchitectureActivationActionTaskReference) {
    this.businessArchitectureActivationActionTaskReference = businessArchitectureActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return businessArchitectureServicingSessionReference
  **/

  public String getBusinessArchitectureServicingSessionReference() {
    return businessArchitectureServicingSessionReference;
  }

  public void setBusinessArchitectureServicingSessionReference(String businessArchitectureServicingSessionReference) {
    this.businessArchitectureServicingSessionReference = businessArchitectureServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return businessArchitectureServicingSessionRecord
  **/

  public Object getBusinessArchitectureServicingSessionRecord() {
    return businessArchitectureServicingSessionRecord;
  }

  public void setBusinessArchitectureServicingSessionRecord(Object businessArchitectureServicingSessionRecord) {
    this.businessArchitectureServicingSessionRecord = businessArchitectureServicingSessionRecord;
  }


  /**
   * Get businessArchitectureServiceConfigurationRecord
   * @return businessArchitectureServiceConfigurationRecord
  **/

  public SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecord getBusinessArchitectureServiceConfigurationRecord() {
    return businessArchitectureServiceConfigurationRecord;
  }

  public void setBusinessArchitectureServiceConfigurationRecord(SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecord businessArchitectureServiceConfigurationRecord) {
    this.businessArchitectureServiceConfigurationRecord = businessArchitectureServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return businessArchitectureServicingSessionStatus
  **/

  public String getBusinessArchitectureServicingSessionStatus() {
    return businessArchitectureServicingSessionStatus;
  }

  public void setBusinessArchitectureServicingSessionStatus(String businessArchitectureServicingSessionStatus) {
    this.businessArchitectureServicingSessionStatus = businessArchitectureServicingSessionStatus;
  }


}

