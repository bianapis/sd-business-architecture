package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement;
import org.bian.dto.SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup;
import org.bian.dto.SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureConfigureOutputModelBusinessArchitectureServiceConfigurationRecord
 */
public class SDBusinessArchitectureConfigureOutputModelBusinessArchitectureServiceConfigurationRecord   {
  private String businessArchitectureServiceConfigurationSettingDescription = null;

  private SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup businessArchitectureServiceConfigurationSetup = null;

  private SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription businessArchitectureServiceSubscription = null;

  private SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement businessArchitectureServiceAgreement = null;

  private String businessArchitectureServiceStatus = null;


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

  public SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup getBusinessArchitectureServiceConfigurationSetup() {
    return businessArchitectureServiceConfigurationSetup;
  }

  public void setBusinessArchitectureServiceConfigurationSetup(SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup businessArchitectureServiceConfigurationSetup) {
    this.businessArchitectureServiceConfigurationSetup = businessArchitectureServiceConfigurationSetup;
  }


  /**
   * Get businessArchitectureServiceSubscription
   * @return businessArchitectureServiceSubscription
  **/

  public SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription getBusinessArchitectureServiceSubscription() {
    return businessArchitectureServiceSubscription;
  }

  public void setBusinessArchitectureServiceSubscription(SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription businessArchitectureServiceSubscription) {
    this.businessArchitectureServiceSubscription = businessArchitectureServiceSubscription;
  }


  /**
   * Get businessArchitectureServiceAgreement
   * @return businessArchitectureServiceAgreement
  **/

  public SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement getBusinessArchitectureServiceAgreement() {
    return businessArchitectureServiceAgreement;
  }

  public void setBusinessArchitectureServiceAgreement(SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement businessArchitectureServiceAgreement) {
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

