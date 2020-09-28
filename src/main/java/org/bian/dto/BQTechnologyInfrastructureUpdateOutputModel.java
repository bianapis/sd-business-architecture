package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnologyInfrastructureUpdateOutputModel
 */
public class BQTechnologyInfrastructureUpdateOutputModel   {
  private String technologyInfrastructurePreconditions = null;

  private String technologyInfrastructureSpecificationSchedule = null;

  private String technologyInfrastructureVersionNumber = null;

  private String technologyInfrastructureServiceType = null;

  private String technologyInfrastructureServiceDescription = null;

  private String technologyInfrastructureServiceInputsandOuputs = null;

  private String technologyInfrastructureServiceWorkProduct = null;

  private String technologyInfrastructureUpdateActionTaskReference = null;

  private Object technologyInfrastructureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return technologyInfrastructureUpdateActionTaskReference
  **/

  public String getTechnologyInfrastructureUpdateActionTaskReference() {
    return technologyInfrastructureUpdateActionTaskReference;
  }

  public void setTechnologyInfrastructureUpdateActionTaskReference(String technologyInfrastructureUpdateActionTaskReference) {
    this.technologyInfrastructureUpdateActionTaskReference = technologyInfrastructureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return technologyInfrastructureUpdateActionTaskRecord
  **/

  public Object getTechnologyInfrastructureUpdateActionTaskRecord() {
    return technologyInfrastructureUpdateActionTaskRecord;
  }

  public void setTechnologyInfrastructureUpdateActionTaskRecord(Object technologyInfrastructureUpdateActionTaskRecord) {
    this.technologyInfrastructureUpdateActionTaskRecord = technologyInfrastructureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

