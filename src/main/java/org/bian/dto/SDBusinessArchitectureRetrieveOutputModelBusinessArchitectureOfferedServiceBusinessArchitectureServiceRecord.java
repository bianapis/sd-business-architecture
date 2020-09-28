package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecordBusinessArchitectureServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord
 */
public class SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord   {
  private String businessArchitectureServiceType = null;

  private String businessArchitectureServiceVersion = null;

  private String businessArchitectureServiceDescription = null;

  private SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecordBusinessArchitectureServicePoliciesandGuidelines businessArchitectureServicePoliciesandGuidelines = null;

  private String businessArchitectureServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return businessArchitectureServiceType
  **/

  public String getBusinessArchitectureServiceType() {
    return businessArchitectureServiceType;
  }

  public void setBusinessArchitectureServiceType(String businessArchitectureServiceType) {
    this.businessArchitectureServiceType = businessArchitectureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return businessArchitectureServiceVersion
  **/

  public String getBusinessArchitectureServiceVersion() {
    return businessArchitectureServiceVersion;
  }

  public void setBusinessArchitectureServiceVersion(String businessArchitectureServiceVersion) {
    this.businessArchitectureServiceVersion = businessArchitectureServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return businessArchitectureServiceDescription
  **/

  public String getBusinessArchitectureServiceDescription() {
    return businessArchitectureServiceDescription;
  }

  public void setBusinessArchitectureServiceDescription(String businessArchitectureServiceDescription) {
    this.businessArchitectureServiceDescription = businessArchitectureServiceDescription;
  }


  /**
   * Get businessArchitectureServicePoliciesandGuidelines
   * @return businessArchitectureServicePoliciesandGuidelines
  **/

  public SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecordBusinessArchitectureServicePoliciesandGuidelines getBusinessArchitectureServicePoliciesandGuidelines() {
    return businessArchitectureServicePoliciesandGuidelines;
  }

  public void setBusinessArchitectureServicePoliciesandGuidelines(SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecordBusinessArchitectureServicePoliciesandGuidelines businessArchitectureServicePoliciesandGuidelines) {
    this.businessArchitectureServicePoliciesandGuidelines = businessArchitectureServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return businessArchitectureServiceSchedule
  **/

  public String getBusinessArchitectureServiceSchedule() {
    return businessArchitectureServiceSchedule;
  }

  public void setBusinessArchitectureServiceSchedule(String businessArchitectureServiceSchedule) {
    this.businessArchitectureServiceSchedule = businessArchitectureServiceSchedule;
  }


}

