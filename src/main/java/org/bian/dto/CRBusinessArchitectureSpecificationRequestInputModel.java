package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessArchitectureSpecificationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRBusinessArchitectureSpecificationRequestInputModel
 */
public class CRBusinessArchitectureSpecificationRequestInputModel   {
  private String businessArchitectureServicingSessionReference = null;

  private String businessArchitectureSpecificationInstanceReference = null;

  private String businessArchitectureSpecificationParameterType = null;

  private String businessArchitectureSpecificationSelectedOption = null;

  private String businessArchitectureSpecificationDescription = null;

  private String businessArchitectureSpecificationVersion = null;

  private String businessArchitectureSpecificationStatus = null;

  private String businessArchitectureSpecificationUsageLog = null;

  private String businessArchitectureSpecificationFeedback = null;

  private String businessArchitectureSpecificationServiceProviderReference = null;

  private Object businessArchitectureSpecificationRequestActionTaskRecord = null;

  private CRBusinessArchitectureSpecificationRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return businessArchitectureServicingSessionReference
  **/

  public String getBusinessArchitectureServicingSessionReference() {
    return businessArchitectureServicingSessionReference;
  }

  public void setBusinessArchitectureServicingSessionReference(String businessArchitectureServicingSessionReference) {
    this.businessArchitectureServicingSessionReference = businessArchitectureServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Business Architecture Specification instance 
   * @return businessArchitectureSpecificationInstanceReference
  **/

  public String getBusinessArchitectureSpecificationInstanceReference() {
    return businessArchitectureSpecificationInstanceReference;
  }

  public void setBusinessArchitectureSpecificationInstanceReference(String businessArchitectureSpecificationInstanceReference) {
    this.businessArchitectureSpecificationInstanceReference = businessArchitectureSpecificationInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return businessArchitectureSpecificationRequestActionTaskRecord
  **/

  public Object getBusinessArchitectureSpecificationRequestActionTaskRecord() {
    return businessArchitectureSpecificationRequestActionTaskRecord;
  }

  public void setBusinessArchitectureSpecificationRequestActionTaskRecord(Object businessArchitectureSpecificationRequestActionTaskRecord) {
    this.businessArchitectureSpecificationRequestActionTaskRecord = businessArchitectureSpecificationRequestActionTaskRecord;
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

