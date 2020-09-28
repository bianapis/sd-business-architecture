package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup;
import org.bian.dto.SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement;
import org.bian.dto.SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecord
 */
public class SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecord   {
  private String businessArchitectureServiceConfigurationSettingReference = null;

  private String businessArchitectureServiceConfigurationSettingDescription = null;

  private SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup businessArchitectureServiceConfigurationSetup = null;

  private SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription businessArchitectureServiceSubscription = null;

  private SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement businessArchitectureServiceAgreement = null;

  private String businessArchitectureServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return businessArchitectureServiceConfigurationSettingReference
  **/

  public String getBusinessArchitectureServiceConfigurationSettingReference() {
    return businessArchitectureServiceConfigurationSettingReference;
  }

  public void setBusinessArchitectureServiceConfigurationSettingReference(String businessArchitectureServiceConfigurationSettingReference) {
    this.businessArchitectureServiceConfigurationSettingReference = businessArchitectureServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return businessArchitectureServiceConfigurationSettingDescription
  **/

  public String getBusinessArchitectureServiceConfigurationSettingDescription() {
    return businessArchitectureServiceConfigurationSettingDescription;
  }

  public void setBusinessArchitectureServiceConfigurationSettingDescription(String businessArchitectureServiceConfigurationSettingDescription) {
    this.businessArchitectureServiceConfigurationSettingDescription = businessArchitectureServiceConfigurationSettingDescription;
  }


  /**
   * Get businessArchitectureServiceConfigurationSetup
   * @return businessArchitectureServiceConfigurationSetup
  **/

  public SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup getBusinessArchitectureServiceConfigurationSetup() {
    return businessArchitectureServiceConfigurationSetup;
  }

  public void setBusinessArchitectureServiceConfigurationSetup(SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup businessArchitectureServiceConfigurationSetup) {
    this.businessArchitectureServiceConfigurationSetup = businessArchitectureServiceConfigurationSetup;
  }


  /**
   * Get businessArchitectureServiceSubscription
   * @return businessArchitectureServiceSubscription
  **/

  public SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription getBusinessArchitectureServiceSubscription() {
    return businessArchitectureServiceSubscription;
  }

  public void setBusinessArchitectureServiceSubscription(SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription businessArchitectureServiceSubscription) {
    this.businessArchitectureServiceSubscription = businessArchitectureServiceSubscription;
  }


  /**
   * Get businessArchitectureServiceAgreement
   * @return businessArchitectureServiceAgreement
  **/

  public SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement getBusinessArchitectureServiceAgreement() {
    return businessArchitectureServiceAgreement;
  }

  public void setBusinessArchitectureServiceAgreement(SDBusinessArchitectureActivateOutputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement businessArchitectureServiceAgreement) {
    this.businessArchitectureServiceAgreement = businessArchitectureServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return businessArchitectureServiceStatus
  **/

  public String getBusinessArchitectureServiceStatus() {
    return businessArchitectureServiceStatus;
  }

  public void setBusinessArchitectureServiceStatus(String businessArchitectureServiceStatus) {
    this.businessArchitectureServiceStatus = businessArchitectureServiceStatus;
  }


}

