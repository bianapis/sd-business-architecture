package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceAnalysis;
import org.bian.dto.BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTechnologyInfrastructureRetrieveOutputModel
 */
public class BQTechnologyInfrastructureRetrieveOutputModel   {
  private String technologyInfrastructurePreconditions = null;

  private String technologyInfrastructureSpecificationSchedule = null;

  private String technologyInfrastructureVersionNumber = null;

  private String technologyInfrastructureServiceType = null;

  private String technologyInfrastructureServiceDescription = null;

  private String technologyInfrastructureServiceInputsandOuputs = null;

  private String technologyInfrastructureServiceWorkProduct = null;

  private String technologyInfrastructureRetrieveActionTaskReference = null;

  private Object technologyInfrastructureRetrieveActionTaskRecord = null;

  private String technologyInfrastructureRetrieveActionResponse = null;

  private BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceReport technologyInfrastructureInstanceReport = null;

  private BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceAnalysis technologyInfrastructureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Technology Infrastructure instance retrieve service call 
   * @return technologyInfrastructureRetrieveActionTaskReference
  **/

  public String getTechnologyInfrastructureRetrieveActionTaskReference() {
    return technologyInfrastructureRetrieveActionTaskReference;
  }

  public void setTechnologyInfrastructureRetrieveActionTaskReference(String technologyInfrastructureRetrieveActionTaskReference) {
    this.technologyInfrastructureRetrieveActionTaskReference = technologyInfrastructureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return technologyInfrastructureRetrieveActionTaskRecord
  **/

  public Object getTechnologyInfrastructureRetrieveActionTaskRecord() {
    return technologyInfrastructureRetrieveActionTaskRecord;
  }

  public void setTechnologyInfrastructureRetrieveActionTaskRecord(Object technologyInfrastructureRetrieveActionTaskRecord) {
    this.technologyInfrastructureRetrieveActionTaskRecord = technologyInfrastructureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return technologyInfrastructureRetrieveActionResponse
  **/

  public String getTechnologyInfrastructureRetrieveActionResponse() {
    return technologyInfrastructureRetrieveActionResponse;
  }

  public void setTechnologyInfrastructureRetrieveActionResponse(String technologyInfrastructureRetrieveActionResponse) {
    this.technologyInfrastructureRetrieveActionResponse = technologyInfrastructureRetrieveActionResponse;
  }


  /**
   * Get technologyInfrastructureInstanceReport
   * @return technologyInfrastructureInstanceReport
  **/

  public BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceReport getTechnologyInfrastructureInstanceReport() {
    return technologyInfrastructureInstanceReport;
  }

  public void setTechnologyInfrastructureInstanceReport(BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceReport technologyInfrastructureInstanceReport) {
    this.technologyInfrastructureInstanceReport = technologyInfrastructureInstanceReport;
  }


  /**
   * Get technologyInfrastructureInstanceAnalysis
   * @return technologyInfrastructureInstanceAnalysis
  **/

  public BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceAnalysis getTechnologyInfrastructureInstanceAnalysis() {
    return technologyInfrastructureInstanceAnalysis;
  }

  public void setTechnologyInfrastructureInstanceAnalysis(BQTechnologyInfrastructureRetrieveOutputModelTechnologyInfrastructureInstanceAnalysis technologyInfrastructureInstanceAnalysis) {
    this.technologyInfrastructureInstanceAnalysis = technologyInfrastructureInstanceAnalysis;
  }


}

