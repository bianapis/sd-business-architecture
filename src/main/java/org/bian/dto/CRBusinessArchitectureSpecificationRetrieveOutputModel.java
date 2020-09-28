package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceAnalysis;
import org.bian.dto.CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessArchitectureSpecificationRetrieveOutputModel
 */
public class CRBusinessArchitectureSpecificationRetrieveOutputModel   {
  private String businessArchitectureSpecificationParameterType = null;

  private String businessArchitectureSpecificationSelectedOption = null;

  private String businessArchitectureSpecificationDescription = null;

  private String businessArchitectureSpecificationVersion = null;

  private String businessArchitectureSpecificationStatus = null;

  private String businessArchitectureSpecificationUsageLog = null;

  private String businessArchitectureSpecificationFeedback = null;

  private String businessArchitectureSpecificationServiceProviderReference = null;

  private String businessArchitectureSpecificationRetrieveActionTaskReference = null;

  private Object businessArchitectureSpecificationRetrieveActionTaskRecord = null;

  private String businessArchitectureSpecificationRetrieveActionResponse = null;

  private CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceReportRecord businessArchitectureSpecificationInstanceReportRecord = null;

  private CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceAnalysis businessArchitectureSpecificationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation of Business Architecture Specification 
   * @return businessArchitectureSpecificationDescription
  **/

  public String getBusinessArchitectureSpecificationDescription() {
    return businessArchitectureSpecificationDescription;
  }

  public void setBusinessArchitectureSpecificationDescription(String businessArchitectureSpecificationDescription) {
    this.businessArchitectureSpecificationDescription = businessArchitectureSpecificationDescription;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has provided Business Architecture Specification 
   * @return businessArchitectureSpecificationServiceProviderReference
  **/

  public String getBusinessArchitectureSpecificationServiceProviderReference() {
    return businessArchitectureSpecificationServiceProviderReference;
  }

  public void setBusinessArchitectureSpecificationServiceProviderReference(String businessArchitectureSpecificationServiceProviderReference) {
    this.businessArchitectureSpecificationServiceProviderReference = businessArchitectureSpecificationServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Architecture Specification instance retrieve service call 
   * @return businessArchitectureSpecificationRetrieveActionTaskReference
  **/

  public String getBusinessArchitectureSpecificationRetrieveActionTaskReference() {
    return businessArchitectureSpecificationRetrieveActionTaskReference;
  }

  public void setBusinessArchitectureSpecificationRetrieveActionTaskReference(String businessArchitectureSpecificationRetrieveActionTaskReference) {
    this.businessArchitectureSpecificationRetrieveActionTaskReference = businessArchitectureSpecificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return businessArchitectureSpecificationRetrieveActionTaskRecord
  **/

  public Object getBusinessArchitectureSpecificationRetrieveActionTaskRecord() {
    return businessArchitectureSpecificationRetrieveActionTaskRecord;
  }

  public void setBusinessArchitectureSpecificationRetrieveActionTaskRecord(Object businessArchitectureSpecificationRetrieveActionTaskRecord) {
    this.businessArchitectureSpecificationRetrieveActionTaskRecord = businessArchitectureSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return businessArchitectureSpecificationRetrieveActionResponse
  **/

  public String getBusinessArchitectureSpecificationRetrieveActionResponse() {
    return businessArchitectureSpecificationRetrieveActionResponse;
  }

  public void setBusinessArchitectureSpecificationRetrieveActionResponse(String businessArchitectureSpecificationRetrieveActionResponse) {
    this.businessArchitectureSpecificationRetrieveActionResponse = businessArchitectureSpecificationRetrieveActionResponse;
  }


  /**
   * Get businessArchitectureSpecificationInstanceReportRecord
   * @return businessArchitectureSpecificationInstanceReportRecord
  **/

  public CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceReportRecord getBusinessArchitectureSpecificationInstanceReportRecord() {
    return businessArchitectureSpecificationInstanceReportRecord;
  }

  public void setBusinessArchitectureSpecificationInstanceReportRecord(CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceReportRecord businessArchitectureSpecificationInstanceReportRecord) {
    this.businessArchitectureSpecificationInstanceReportRecord = businessArchitectureSpecificationInstanceReportRecord;
  }


  /**
   * Get businessArchitectureSpecificationInstanceAnalysis
   * @return businessArchitectureSpecificationInstanceAnalysis
  **/

  public CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceAnalysis getBusinessArchitectureSpecificationInstanceAnalysis() {
    return businessArchitectureSpecificationInstanceAnalysis;
  }

  public void setBusinessArchitectureSpecificationInstanceAnalysis(CRBusinessArchitectureSpecificationRetrieveOutputModelBusinessArchitectureSpecificationInstanceAnalysis businessArchitectureSpecificationInstanceAnalysis) {
    this.businessArchitectureSpecificationInstanceAnalysis = businessArchitectureSpecificationInstanceAnalysis;
  }


}

