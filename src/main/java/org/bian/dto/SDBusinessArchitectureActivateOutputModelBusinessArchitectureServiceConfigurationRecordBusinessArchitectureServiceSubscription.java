package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription
 */
public class SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription   {
  private String businessArchitectureServiceSubscriberReference = null;

  private String businessArchitectureServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return businessArchitectureServiceSubscriberReference
  **/

  public String getBusinessArchitectureServiceSubscriberReference() {
    return businessArchitectureServiceSubscriberReference;
  }

  public void setBusinessArchitectureServiceSubscriberReference(String businessArchitectureServiceSubscriberReference) {
    this.businessArchitectureServiceSubscriberReference = businessArchitectureServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return businessArchitectureServiceSubscriberAccessProfile
  **/

  public String getBusinessArchitectureServiceSubscriberAccessProfile() {
    return businessArchitectureServiceSubscriberAccessProfile;
  }

  public void setBusinessArchitectureServiceSubscriberAccessProfile(String businessArchitectureServiceSubscriberAccessProfile) {
    this.businessArchitectureServiceSubscriberAccessProfile = businessArchitectureServiceSubscriberAccessProfile;
  }


}

