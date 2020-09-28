package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureConfigureOutputModelBusinessArchitectureServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureConfigureOutputModel
 */
public class SDBusinessArchitectureConfigureOutputModel   {
  private String businessArchitectureConfigurationActionTaskReference = null;

  private Object businessArchitectureConfigurationActionTaskRecord = null;

  private SDBusinessArchitectureConfigureOutputModelBusinessArchitectureServiceConfigurationRecord businessArchitectureServiceConfigurationRecord = null;

  private String businessArchitectureServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return businessArchitectureConfigurationActionTaskReference
  **/

  public String getBusinessArchitectureConfigurationActionTaskReference() {
    return businessArchitectureConfigurationActionTaskReference;
  }

  public void setBusinessArchitectureConfigurationActionTaskReference(String businessArchitectureConfigurationActionTaskReference) {
    this.businessArchitectureConfigurationActionTaskReference = businessArchitectureConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return businessArchitectureConfigurationActionTaskRecord
  **/

  public Object getBusinessArchitectureConfigurationActionTaskRecord() {
    return businessArchitectureConfigurationActionTaskRecord;
  }

  public void setBusinessArchitectureConfigurationActionTaskRecord(Object businessArchitectureConfigurationActionTaskRecord) {
    this.businessArchitectureConfigurationActionTaskRecord = businessArchitectureConfigurationActionTaskRecord;
  }


  /**
   * Get businessArchitectureServiceConfigurationRecord
   * @return businessArchitectureServiceConfigurationRecord
  **/

  public SDBusinessArchitectureConfigureOutputModelBusinessArchitectureServiceConfigurationRecord getBusinessArchitectureServiceConfigurationRecord() {
    return businessArchitectureServiceConfigurationRecord;
  }

  public void setBusinessArchitectureServiceConfigurationRecord(SDBusinessArchitectureConfigureOutputModelBusinessArchitectureServiceConfigurationRecord businessArchitectureServiceConfigurationRecord) {
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

