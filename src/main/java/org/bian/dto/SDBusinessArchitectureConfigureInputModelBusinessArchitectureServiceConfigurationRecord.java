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
 * SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecord
 */
public class SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecord   {
  private String businessArchitectureServiceConfigurationSettingReference = null;

  private String businessArchitectureServiceConfigurationSettingType = null;

  private SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup businessArchitectureServiceConfigurationSetup = null;

  private SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceSubscription businessArchitectureServiceSubscription = null;

  private SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement businessArchitectureServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return businessArchitectureServiceConfigurationSettingType
  **/

  public String getBusinessArchitectureServiceConfigurationSettingType() {
    return businessArchitectureServiceConfigurationSettingType;
  }

  public void setBusinessArchitectureServiceConfigurationSettingType(String businessArchitectureServiceConfigurationSettingType) {
    this.businessArchitectureServiceConfigurationSettingType = businessArchitectureServiceConfigurationSettingType;
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


}

