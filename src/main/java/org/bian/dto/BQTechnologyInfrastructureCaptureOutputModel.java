package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnologyInfrastructureCaptureOutputModel
 */
public class BQTechnologyInfrastructureCaptureOutputModel   {
  private String technologyInfrastructurePreconditions = null;

  private String technologyInfrastructureSpecificationSchedule = null;

  private String technologyInfrastructureVersionNumber = null;

  private String technologyInfrastructureServiceType = null;

  private String technologyInfrastructureServiceDescription = null;

  private String technologyInfrastructureServiceInputsandOuputs = null;

  private String technologyInfrastructureServiceWorkProduct = null;

  private String technologyInfrastructureCaptureActionTaskReference = null;

  private Object technologyInfrastructureCaptureActionTaskRecord = null;

  private String technologyInfrastructureCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return technologyInfrastructurePreconditions
  **/

  public String getTechnologyInfrastructurePreconditions() {
    return technologyInfrastructurePreconditions;
  }

  public void setTechnologyInfrastructurePreconditions(String technologyInfrastructurePreconditions) {
    this.technologyInfrastructurePreconditions = technologyInfrastructurePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return technologyInfrastructureSpecificationSchedule
  **/

  public String getTechnologyInfrastructureSpecificationSchedule() {
    return technologyInfrastructureSpecificationSchedule;
  }

  public void setTechnologyInfrastructureSpecificationSchedule(String technologyInfrastructureSpecificationSchedule) {
    this.technologyInfrastructureSpecificationSchedule = technologyInfrastructureSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return technologyInfrastructureVersionNumber
  **/

  public String getTechnologyInfrastructureVersionNumber() {
    return technologyInfrastructureVersionNumber;
  }

  public void setTechnologyInfrastructureVersionNumber(String technologyInfrastructureVersionNumber) {
    this.technologyInfrastructureVersionNumber = technologyInfrastructureVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return technologyInfrastructureServiceType
  **/

  public String getTechnologyInfrastructureServiceType() {
    return technologyInfrastructureServiceType;
  }

  public void setTechnologyInfrastructureServiceType(String technologyInfrastructureServiceType) {
    this.technologyInfrastructureServiceType = technologyInfrastructureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return technologyInfrastructureServiceDescription
  **/

  public String getTechnologyInfrastructureServiceDescription() {
    return technologyInfrastructureServiceDescription;
  }

  public void setTechnologyInfrastructureServiceDescription(String technologyInfrastructureServiceDescription) {
    this.technologyInfrastructureServiceDescription = technologyInfrastructureServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return technologyInfrastructureServiceInputsandOuputs
  **/

  public String getTechnologyInfrastructureServiceInputsandOuputs() {
    return technologyInfrastructureServiceInputsandOuputs;
  }

  public void setTechnologyInfrastructureServiceInputsandOuputs(String technologyInfrastructureServiceInputsandOuputs) {
    this.technologyInfrastructureServiceInputsandOuputs = technologyInfrastructureServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return technologyInfrastructureServiceWorkProduct
  **/

  public String getTechnologyInfrastructureServiceWorkProduct() {
    return technologyInfrastructureServiceWorkProduct;
  }

  public void setTechnologyInfrastructureServiceWorkProduct(String technologyInfrastructureServiceWorkProduct) {
    this.technologyInfrastructureServiceWorkProduct = technologyInfrastructureServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Technology Infrastructure instance capture service call 
   * @return technologyInfrastructureCaptureActionTaskReference
  **/

  public String getTechnologyInfrastructureCaptureActionTaskReference() {
    return technologyInfrastructureCaptureActionTaskReference;
  }

  public void setTechnologyInfrastructureCaptureActionTaskReference(String technologyInfrastructureCaptureActionTaskReference) {
    this.technologyInfrastructureCaptureActionTaskReference = technologyInfrastructureCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return technologyInfrastructureCaptureActionTaskRecord
  **/

  public Object getTechnologyInfrastructureCaptureActionTaskRecord() {
    return technologyInfrastructureCaptureActionTaskRecord;
  }

  public void setTechnologyInfrastructureCaptureActionTaskRecord(Object technologyInfrastructureCaptureActionTaskRecord) {
    this.technologyInfrastructureCaptureActionTaskRecord = technologyInfrastructureCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Technology Infrastructure structured input transaction/record 
   * @return technologyInfrastructureCaptureRecordReference
  **/

  public String getTechnologyInfrastructureCaptureRecordReference() {
    return technologyInfrastructureCaptureRecordReference;
  }

  public void setTechnologyInfrastructureCaptureRecordReference(String technologyInfrastructureCaptureRecordReference) {
    this.technologyInfrastructureCaptureRecordReference = technologyInfrastructureCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

