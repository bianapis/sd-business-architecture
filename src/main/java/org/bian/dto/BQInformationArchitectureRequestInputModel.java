package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessArchitectureSpecificationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQInformationArchitectureRequestInputModel
 */
public class BQInformationArchitectureRequestInputModel   {
  private String businessArchitectureSpecificationInstanceReference = null;

  private String informationArchitectureInstanceReference = null;

  private String informationArchitecturePreconditions = null;

  private String informationArchitectureSpecificationSchedule = null;

  private String informationArchitectureVersionNumber = null;

  private String informationArchitectureServiceType = null;

  private String informationArchitectureServiceDescription = null;

  private String informationArchitectureServiceInputsandOuputs = null;

  private String informationArchitectureServiceWorkProduct = null;

  private String informationArchitectureServiceName = null;

  private Object informationArchitectureRequestActionTaskRecord = null;

  private CRBusinessArchitectureSpecificationRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Information Architecture instance 
   * @return informationArchitectureInstanceReference
  **/

  public String getInformationArchitectureInstanceReference() {
    return informationArchitectureInstanceReference;
  }

  public void setInformationArchitectureInstanceReference(String informationArchitectureInstanceReference) {
    this.informationArchitectureInstanceReference = informationArchitectureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return informationArchitecturePreconditions
  **/

  public String getInformationArchitecturePreconditions() {
    return informationArchitecturePreconditions;
  }

  public void setInformationArchitecturePreconditions(String informationArchitecturePreconditions) {
    this.informationArchitecturePreconditions = informationArchitecturePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return informationArchitectureSpecificationSchedule
  **/

  public String getInformationArchitectureSpecificationSchedule() {
    return informationArchitectureSpecificationSchedule;
  }

  public void setInformationArchitectureSpecificationSchedule(String informationArchitectureSpecificationSchedule) {
    this.informationArchitectureSpecificationSchedule = informationArchitectureSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return informationArchitectureVersionNumber
  **/

  public String getInformationArchitectureVersionNumber() {
    return informationArchitectureVersionNumber;
  }

  public void setInformationArchitectureVersionNumber(String informationArchitectureVersionNumber) {
    this.informationArchitectureVersionNumber = informationArchitectureVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return informationArchitectureServiceType
  **/

  public String getInformationArchitectureServiceType() {
    return informationArchitectureServiceType;
  }

  public void setInformationArchitectureServiceType(String informationArchitectureServiceType) {
    this.informationArchitectureServiceType = informationArchitectureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return informationArchitectureServiceDescription
  **/

  public String getInformationArchitectureServiceDescription() {
    return informationArchitectureServiceDescription;
  }

  public void setInformationArchitectureServiceDescription(String informationArchitectureServiceDescription) {
    this.informationArchitectureServiceDescription = informationArchitectureServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return informationArchitectureServiceInputsandOuputs
  **/

  public String getInformationArchitectureServiceInputsandOuputs() {
    return informationArchitectureServiceInputsandOuputs;
  }

  public void setInformationArchitectureServiceInputsandOuputs(String informationArchitectureServiceInputsandOuputs) {
    this.informationArchitectureServiceInputsandOuputs = informationArchitectureServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return informationArchitectureServiceWorkProduct
  **/

  public String getInformationArchitectureServiceWorkProduct() {
    return informationArchitectureServiceWorkProduct;
  }

  public void setInformationArchitectureServiceWorkProduct(String informationArchitectureServiceWorkProduct) {
    this.informationArchitectureServiceWorkProduct = informationArchitectureServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return informationArchitectureServiceName
  **/

  public String getInformationArchitectureServiceName() {
    return informationArchitectureServiceName;
  }

  public void setInformationArchitectureServiceName(String informationArchitectureServiceName) {
    this.informationArchitectureServiceName = informationArchitectureServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return informationArchitectureRequestActionTaskRecord
  **/

  public Object getInformationArchitectureRequestActionTaskRecord() {
    return informationArchitectureRequestActionTaskRecord;
  }

  public void setInformationArchitectureRequestActionTaskRecord(Object informationArchitectureRequestActionTaskRecord) {
    this.informationArchitectureRequestActionTaskRecord = informationArchitectureRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRBusinessArchitectureSpecificationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRBusinessArchitectureSpecificationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

