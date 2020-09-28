package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceAnalysis;
import org.bian.dto.BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQApplicationArchitectureRetrieveOutputModel
 */
public class BQApplicationArchitectureRetrieveOutputModel   {
  private String organizationPreconditions = null;

  private String organizationSpecificationSchedule = null;

  private String organizationVersionNumber = null;

  private String organizationalModel = null;

  private String organizationalModelServiceType = null;

  private String organizationalModelServiceDescription = null;

  private String organizationalModelServiceInputsandOuputs = null;

  private String organizationalModelServiceWorkProduct = null;

  private String organizationalModelServiceName = null;

  private String applicationArchitectureRetrieveActionTaskReference = null;

  private Object applicationArchitectureRetrieveActionTaskRecord = null;

  private String applicationArchitectureRetrieveActionResponse = null;

  private BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceReport applicationArchitectureInstanceReport = null;

  private BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceAnalysis applicationArchitectureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Application Architecture instance retrieve service call 
   * @return applicationArchitectureRetrieveActionTaskReference
  **/

  public String getApplicationArchitectureRetrieveActionTaskReference() {
    return applicationArchitectureRetrieveActionTaskReference;
  }

  public void setApplicationArchitectureRetrieveActionTaskReference(String applicationArchitectureRetrieveActionTaskReference) {
    this.applicationArchitectureRetrieveActionTaskReference = applicationArchitectureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return applicationArchitectureRetrieveActionTaskRecord
  **/

  public Object getApplicationArchitectureRetrieveActionTaskRecord() {
    return applicationArchitectureRetrieveActionTaskRecord;
  }

  public void setApplicationArchitectureRetrieveActionTaskRecord(Object applicationArchitectureRetrieveActionTaskRecord) {
    this.applicationArchitectureRetrieveActionTaskRecord = applicationArchitectureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return applicationArchitectureRetrieveActionResponse
  **/

  public String getApplicationArchitectureRetrieveActionResponse() {
    return applicationArchitectureRetrieveActionResponse;
  }

  public void setApplicationArchitectureRetrieveActionResponse(String applicationArchitectureRetrieveActionResponse) {
    this.applicationArchitectureRetrieveActionResponse = applicationArchitectureRetrieveActionResponse;
  }


  /**
   * Get applicationArchitectureInstanceReport
   * @return applicationArchitectureInstanceReport
  **/

  public BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceReport getApplicationArchitectureInstanceReport() {
    return applicationArchitectureInstanceReport;
  }

  public void setApplicationArchitectureInstanceReport(BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceReport applicationArchitectureInstanceReport) {
    this.applicationArchitectureInstanceReport = applicationArchitectureInstanceReport;
  }


  /**
   * Get applicationArchitectureInstanceAnalysis
   * @return applicationArchitectureInstanceAnalysis
  **/

  public BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceAnalysis getApplicationArchitectureInstanceAnalysis() {
    return applicationArchitectureInstanceAnalysis;
  }

  public void setApplicationArchitectureInstanceAnalysis(BQApplicationArchitectureRetrieveOutputModelApplicationArchitectureInstanceAnalysis applicationArchitectureInstanceAnalysis) {
    this.applicationArchitectureInstanceAnalysis = applicationArchitectureInstanceAnalysis;
  }


}

