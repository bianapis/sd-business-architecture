package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureConfigureInputModel
 */
public class SDBusinessArchitectureConfigureInputModel   {
  private Object businessArchitectureConfigurationActionTaskRecord = null;

  private String businessArchitectureServicingSessionReference = null;

  private String businessArchitectureServiceReference = null;

  private SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecord businessArchitectureServiceConfigurationRecord = null;


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

  public SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecord getBusinessArchitectureServiceConfigurationRecord() {
    return businessArchitectureServiceConfigurationRecord;
  }

  public void setBusinessArchitectureServiceConfigurationRecord(SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecord businessArchitectureServiceConfigurationRecord) {
    this.businessArchitectureServiceConfigurationRecord = businessArchitectureServiceConfigurationRecord;
  }


}

