package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecordBusinessArchitectureServicePoliciesandGuidelines
 */
public class SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecordBusinessArchitectureServicePoliciesandGuidelines   {
  private String businessArchitectureServiceEligibility = null;

  private String businessArchitectureServiceIntendedUses = null;

  private String businessArchitectureServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return businessArchitectureServiceEligibility
  **/

  public String getBusinessArchitectureServiceEligibility() {
    return businessArchitectureServiceEligibility;
  }

  public void setBusinessArchitectureServiceEligibility(String businessArchitectureServiceEligibility) {
    this.businessArchitectureServiceEligibility = businessArchitectureServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return businessArchitectureServiceIntendedUses
  **/

  public String getBusinessArchitectureServiceIntendedUses() {
    return businessArchitectureServiceIntendedUses;
  }

  public void setBusinessArchitectureServiceIntendedUses(String businessArchitectureServiceIntendedUses) {
    this.businessArchitectureServiceIntendedUses = businessArchitectureServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return businessArchitectureServicePricingandTerms
  **/

  public String getBusinessArchitectureServicePricingandTerms() {
    return businessArchitectureServicePricingandTerms;
  }

  public void setBusinessArchitectureServicePricingandTerms(String businessArchitectureServicePricingandTerms) {
    this.businessArchitectureServicePricingandTerms = businessArchitectureServicePricingandTerms;
  }


}

