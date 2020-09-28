package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureFeedbackOutputModelBusinessArchitectureFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureFeedbackOutputModel
 */
public class SDBusinessArchitectureFeedbackOutputModel   {
  private String businessArchitectureFeedbackActionTaskReference = null;

  private Object businessArchitectureFeedbackActionTaskRecord = null;

  private SDBusinessArchitectureFeedbackOutputModelBusinessArchitectureFeedbackActionRecord businessArchitectureFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return businessArchitectureFeedbackActionTaskReference
  **/

  public String getBusinessArchitectureFeedbackActionTaskReference() {
    return businessArchitectureFeedbackActionTaskReference;
  }

  public void setBusinessArchitectureFeedbackActionTaskReference(String businessArchitectureFeedbackActionTaskReference) {
    this.businessArchitectureFeedbackActionTaskReference = businessArchitectureFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return businessArchitectureFeedbackActionTaskRecord
  **/

  public Object getBusinessArchitectureFeedbackActionTaskRecord() {
    return businessArchitectureFeedbackActionTaskRecord;
  }

  public void setBusinessArchitectureFeedbackActionTaskRecord(Object businessArchitectureFeedbackActionTaskRecord) {
    this.businessArchitectureFeedbackActionTaskRecord = businessArchitectureFeedbackActionTaskRecord;
  }


  /**
   * Get businessArchitectureFeedbackActionRecord
   * @return businessArchitectureFeedbackActionRecord
  **/

  public SDBusinessArchitectureFeedbackOutputModelBusinessArchitectureFeedbackActionRecord getBusinessArchitectureFeedbackActionRecord() {
    return businessArchitectureFeedbackActionRecord;
  }

  public void setBusinessArchitectureFeedbackActionRecord(SDBusinessArchitectureFeedbackOutputModelBusinessArchitectureFeedbackActionRecord businessArchitectureFeedbackActionRecord) {
    this.businessArchitectureFeedbackActionRecord = businessArchitectureFeedbackActionRecord;
  }


}

