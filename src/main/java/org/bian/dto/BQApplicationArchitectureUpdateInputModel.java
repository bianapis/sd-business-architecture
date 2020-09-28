package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQApplicationArchitectureUpdateInputModel
 */
public class BQApplicationArchitectureUpdateInputModel   {
  private String organizationPreconditions = null;

  private String organizationSpecificationSchedule = null;

  private String organizationVersionNumber = null;

  private String organizationalModel = null;

  private String organizationalModelServiceType = null;

  private String organizationalModelServiceDescription = null;

  private String organizationalModelServiceInputsandOuputs = null;

  private String organizationalModelServiceWorkProduct = null;

  private String organizationalModelServiceName = null;

  private String businessArchitectureSpecificationInstanceReference = null;

  private String applicationArchitectureInstanceReference = null;

  private Object applicationArchitectureUpdateActionTaskRecord = null;

  private String applicationArchitectureUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return organizationPreconditions
  **/

  public String getOrganizationPreconditions() {
    return organizationPreconditions;
  }

  public void setOrganizationPreconditions(String organizationPreconditions) {
    this.organizationPreconditions = organizationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return organizationSpecificationSchedule
  **/

  public String getOrganizationSpecificationSchedule() {
    return organizationSpecificationSchedule;
  }

  public void setOrganizationSpecificationSchedule(String organizationSpecificationSchedule) {
    this.organizationSpecificationSchedule = organizationSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return organizationVersionNumber
  **/

  public String getOrganizationVersionNumber() {
    return organizationVersionNumber;
  }

  public void setOrganizationVersionNumber(String organizationVersionNumber) {
    this.organizationVersionNumber = organizationVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Business Architecture Specification specific Business Service 
   * @return organizationalModel
  **/

  public String getOrganizationalModel() {
    return organizationalModel;
  }

  public void setOrganizationalModel(String organizationalModel) {
    this.organizationalModel = organizationalModel;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return organizationalModelServiceType
  **/

  public String getOrganizationalModelServiceType() {
    return organizationalModelServiceType;
  }

  public void setOrganizationalModelServiceType(String organizationalModelServiceType) {
    this.organizationalModelServiceType = organizationalModelServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return organizationalModelServiceDescription
  **/

  public String getOrganizationalModelServiceDescription() {
    return organizationalModelServiceDescription;
  }

  public void setOrganizationalModelServiceDescription(String organizationalModelServiceDescription) {
    this.organizationalModelServiceDescription = organizationalModelServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return organizationalModelServiceInputsandOuputs
  **/

  public String getOrganizationalModelServiceInputsandOuputs() {
    return organizationalModelServiceInputsandOuputs;
  }

  public void setOrganizationalModelServiceInputsandOuputs(String organizationalModelServiceInputsandOuputs) {
    this.organizationalModelServiceInputsandOuputs = organizationalModelServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return organizationalModelServiceWorkProduct
  **/

  public String getOrganizationalModelServiceWorkProduct() {
    return organizationalModelServiceWorkProduct;
  }

  public void setOrganizationalModelServiceWorkProduct(String organizationalModelServiceWorkProduct) {
    this.organizationalModelServiceWorkProduct = organizationalModelServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return organizationalModelServiceName
  **/

  public String getOrganizationalModelServiceName() {
    return organizationalModelServiceName;
  }

  public void setOrganizationalModelServiceName(String organizationalModelServiceName) {
    this.organizationalModelServiceName = organizationalModelServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Business Architecture Specification instance 
   * @return businessArchitectureSpecificationInstanceReference
  **/

  public String getBusinessArchitectureSpecificationInstanceReference() {
    return businessArchitectureSpecificationInstanceReference;
  }

  public void setBusinessArchitectureSpecificationInstanceReference(String businessArchitectureSpecificationInstanceReference) {
    this.businessArchitectureSpecificationInstanceReference = businessArchitectureSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Application Architecture instance 
   * @return applicationArchitectureInstanceReference
  **/

  public String getApplicationArchitectureInstanceReference() {
    return applicationArchitectureInstanceReference;
  }

  public void setApplicationArchitectureInstanceReference(String applicationArchitectureInstanceReference) {
    this.applicationArchitectureInstanceReference = applicationArchitectureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return applicationArchitectureUpdateActionTaskRecord
  **/

  public Object getApplicationArchitectureUpdateActionTaskRecord() {
    return applicationArchitectureUpdateActionTaskRecord;
  }

  public void setApplicationArchitectureUpdateActionTaskRecord(Object applicationArchitectureUpdateActionTaskRecord) {
    this.applicationArchitectureUpdateActionTaskRecord = applicationArchitectureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return applicationArchitectureUpdateActionRequest
  **/

  public String getApplicationArchitectureUpdateActionRequest() {
    return applicationArchitectureUpdateActionRequest;
  }

  public void setApplicationArchitectureUpdateActionRequest(String applicationArchitectureUpdateActionRequest) {
    this.applicationArchitectureUpdateActionRequest = applicationArchitectureUpdateActionRequest;
  }


}

