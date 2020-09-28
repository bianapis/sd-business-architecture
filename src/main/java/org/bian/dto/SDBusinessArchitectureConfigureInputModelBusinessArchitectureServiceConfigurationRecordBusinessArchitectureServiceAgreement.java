package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement
 */
public class SDBusinessArchitectureConfigureInputModelBusinessArchitectureServiceConfigurationRecordBusinessArchitectureServiceAgreement   {
  private String businessArchitectureServiceAgreementReference = null;

  private String businessArchitectureServiceUserReference = null;

  private String businessArchitectureServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return businessArchitectureServiceAgreementReference
  **/

  public String getBusinessArchitectureServiceAgreementReference() {
    return businessArchitectureServiceAgreementReference;
  }

  public void setBusinessArchitectureServiceAgreementReference(String businessArchitectureServiceAgreementReference) {
    this.businessArchitectureServiceAgreementReference = businessArchitectureServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return businessArchitectureServiceUserReference
  **/

  public String getBusinessArchitectureServiceUserReference() {
    return businessArchitectureServiceUserReference;
  }

  public void setBusinessArchitectureServiceUserReference(String businessArchitectureServiceUserReference) {
    this.businessArchitectureServiceUserReference = businessArchitectureServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return businessArchitectureServiceAgreementTermsandConditions
  **/

  public String getBusinessArchitectureServiceAgreementTermsandConditions() {
    return businessArchitectureServiceAgreementTermsandConditions;
  }

  public void setBusinessArchitectureServiceAgreementTermsandConditions(String businessArchitectureServiceAgreementTermsandConditions) {
    this.businessArchitectureServiceAgreementTermsandConditions = businessArchitectureServiceAgreementTermsandConditions;
  }


}

