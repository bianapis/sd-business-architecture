package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceAnalysis;
import org.bian.dto.BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInformationArchitectureRetrieveOutputModel
 */
public class BQInformationArchitectureRetrieveOutputModel   {
  private String informationArchitecturePreconditions = null;

  private String informationArchitectureSpecificationSchedule = null;

  private String informationArchitectureVersionNumber = null;

  private String informationArchitectureServiceType = null;

  private String informationArchitectureServiceDescription = null;

  private String informationArchitectureServiceInputsandOuputs = null;

  private String informationArchitectureServiceWorkProduct = null;

  private String informationArchitectureServiceName = null;

  private String informationArchitectureRetrieveActionTaskReference = null;

  private Object informationArchitectureRetrieveActionTaskRecord = null;

  private String informationArchitectureRetrieveActionResponse = null;

  private BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceReport informationArchitectureInstanceReport = null;

  private BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceAnalysis informationArchitectureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Information Architecture instance retrieve service call 
   * @return informationArchitectureRetrieveActionTaskReference
  **/

  public String getInformationArchitectureRetrieveActionTaskReference() {
    return informationArchitectureRetrieveActionTaskReference;
  }

  public void setInformationArchitectureRetrieveActionTaskReference(String informationArchitectureRetrieveActionTaskReference) {
    this.informationArchitectureRetrieveActionTaskReference = informationArchitectureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return informationArchitectureRetrieveActionTaskRecord
  **/

  public Object getInformationArchitectureRetrieveActionTaskRecord() {
    return informationArchitectureRetrieveActionTaskRecord;
  }

  public void setInformationArchitectureRetrieveActionTaskRecord(Object informationArchitectureRetrieveActionTaskRecord) {
    this.informationArchitectureRetrieveActionTaskRecord = informationArchitectureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return informationArchitectureRetrieveActionResponse
  **/

  public String getInformationArchitectureRetrieveActionResponse() {
    return informationArchitectureRetrieveActionResponse;
  }

  public void setInformationArchitectureRetrieveActionResponse(String informationArchitectureRetrieveActionResponse) {
    this.informationArchitectureRetrieveActionResponse = informationArchitectureRetrieveActionResponse;
  }


  /**
   * Get informationArchitectureInstanceReport
   * @return informationArchitectureInstanceReport
  **/

  public BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceReport getInformationArchitectureInstanceReport() {
    return informationArchitectureInstanceReport;
  }

  public void setInformationArchitectureInstanceReport(BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceReport informationArchitectureInstanceReport) {
    this.informationArchitectureInstanceReport = informationArchitectureInstanceReport;
  }


  /**
   * Get informationArchitectureInstanceAnalysis
   * @return informationArchitectureInstanceAnalysis
  **/

  public BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceAnalysis getInformationArchitectureInstanceAnalysis() {
    return informationArchitectureInstanceAnalysis;
  }

  public void setInformationArchitectureInstanceAnalysis(BQInformationArchitectureRetrieveOutputModelInformationArchitectureInstanceAnalysis informationArchitectureInstanceAnalysis) {
    this.informationArchitectureInstanceAnalysis = informationArchitectureInstanceAnalysis;
  }


}

