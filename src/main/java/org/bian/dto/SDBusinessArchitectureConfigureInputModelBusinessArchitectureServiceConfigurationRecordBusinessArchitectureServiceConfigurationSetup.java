package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup
 */
public class SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceConfigurationSetup   {
  private String businessArchitectureServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return businessArchitectureServiceConfigurationParameter
  **/

  public String getBusinessArchitectureServiceConfigurationParameter() {
    return businessArchitectureServiceConfigurationParameter;
  }

  public void setBusinessArchitectureServiceConfigurationParameter(String businessArchitectureServiceConfigurationParameter) {
    this.businessArchitectureServiceConfigurationParameter = businessArchitectureServiceConfigurationParameter;
  }


}

