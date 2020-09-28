package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecord
 */
public class SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecord   {
  private String businessArchitectureServiceConfigurationSettingReference = null;

  private String businessArchitectureServiceConfigurationSettingType = null;

  private SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup businessArchitectureServiceConfigurationSetup = null;


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

  public SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup getBusinessArchitectureServiceConfigurationSetup() {
    return businessArchitectureServiceConfigurationSetup;
  }

  public void setBusinessArchitectureServiceConfigurationSetup(SDBusinessArchitectureActivateInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup businessArchitectureServiceConfigurationSetup) {
    this.businessArchitectureServiceConfigurationSetup = businessArchitectureServiceConfigurationSetup;
  }


}

