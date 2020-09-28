package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessArchitectureSpecificationCaptureOutputModel
 */
public class CRBusinessArchitectureSpecificationCaptureOutputModel   {
  private String businessArchitectureSpecificationParameterType = null;

  private String businessArchitectureSpecificationSelectedOption = null;

  private String businessArchitectureSpecificationVersion = null;

  private String businessArchitectureSpecificationStatus = null;

  private String businessArchitectureSpecificationUsageLog = null;

  private String businessArchitectureSpecificationFeedback = null;

  private String businessArchitectureSpecificationCaptureActionTaskReference = null;

  private Object businessArchitectureSpecificationCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between designs according to the type of business services and/or aspect within Business Architecture Specification . Eg Product Design, Campaign Design, Risk Model Design etc.  
   * @return businessArchitectureSpecificationParameterType
  **/

  public String getBusinessArchitectureSpecificationParameterType() {
    return businessArchitectureSpecificationParameterType;
  }

  public void setBusinessArchitectureSpecificationParameterType(String businessArchitectureSpecificationParameterType) {
    this.businessArchitectureSpecificationParameterType = businessArchitectureSpecificationParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of design 
   * @return businessArchitectureSpecificationSelectedOption
  **/

  public String getBusinessArchitectureSpecificationSelectedOption() {
    return businessArchitectureSpecificationSelectedOption;
  }

  public void setBusinessArchitectureSpecificationSelectedOption(String businessArchitectureSpecificationSelectedOption) {
    this.businessArchitectureSpecificationSelectedOption = businessArchitectureSpecificationSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version of Business Architecture Specification 
   * @return businessArchitectureSpecificationVersion
  **/

  public String getBusinessArchitectureSpecificationVersion() {
    return businessArchitectureSpecificationVersion;
  }

  public void setBusinessArchitectureSpecificationVersion(String businessArchitectureSpecificationVersion) {
    this.businessArchitectureSpecificationVersion = businessArchitectureSpecificationVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Business Architecture Specification 
   * @return businessArchitectureSpecificationStatus
  **/

  public String getBusinessArchitectureSpecificationStatus() {
    return businessArchitectureSpecificationStatus;
  }

  public void setBusinessArchitectureSpecificationStatus(String businessArchitectureSpecificationStatus) {
    this.businessArchitectureSpecificationStatus = businessArchitectureSpecificationStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Business Architecture Specification 
   * @return businessArchitectureSpecificationUsageLog
  **/

  public String getBusinessArchitectureSpecificationUsageLog() {
    return businessArchitectureSpecificationUsageLog;
  }

  public void setBusinessArchitectureSpecificationUsageLog(String businessArchitectureSpecificationUsageLog) {
    this.businessArchitectureSpecificationUsageLog = businessArchitectureSpecificationUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Information about reactions to a design which is used as a basis for improvement for the Business Architecture Specification. 
   * @return businessArchitectureSpecificationFeedback
  **/

  public String getBusinessArchitectureSpecificationFeedback() {
    return businessArchitectureSpecificationFeedback;
  }

  public void setBusinessArchitectureSpecificationFeedback(String businessArchitectureSpecificationFeedback) {
    this.businessArchitectureSpecificationFeedback = businessArchitectureSpecificationFeedback;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Architecture Specification instance capture service call 
   * @return businessArchitectureSpecificationCaptureActionTaskReference
  **/

  public String getBusinessArchitectureSpecificationCaptureActionTaskReference() {
    return businessArchitectureSpecificationCaptureActionTaskReference;
  }

  public void setBusinessArchitectureSpecificationCaptureActionTaskReference(String businessArchitectureSpecificationCaptureActionTaskReference) {
    this.businessArchitectureSpecificationCaptureActionTaskReference = businessArchitectureSpecificationCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return businessArchitectureSpecificationCaptureActionTaskRecord
  **/

  public Object getBusinessArchitectureSpecificationCaptureActionTaskRecord() {
    return businessArchitectureSpecificationCaptureActionTaskRecord;
  }

  public void setBusinessArchitectureSpecificationCaptureActionTaskRecord(Object businessArchitectureSpecificationCaptureActionTaskRecord) {
    this.businessArchitectureSpecificationCaptureActionTaskRecord = businessArchitectureSpecificationCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
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

