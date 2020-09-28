package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureFeedbackInputModelBusinessArchitectureFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureFeedbackInputModel
 */
public class SDBusinessArchitectureFeedbackInputModel   {
  private Object businessArchitectureFeedbackActionTaskRecord = null;

  private SDBusinessArchitectureFeedbackInputModelBusinessArchitectureFeedbackActionRecord businessArchitectureFeedbackActionRecord = null;


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

  public SDBusinessArchitectureFeedbackInputModelBusinessArchitectureFeedbackActionRecord getBusinessArchitectureFeedbackActionRecord() {
    return businessArchitectureFeedbackActionRecord;
  }

  public void setBusinessArchitectureFeedbackActionRecord(SDBusinessArchitectureFeedbackInputModelBusinessArchitectureFeedbackActionRecord businessArchitectureFeedbackActionRecord) {
    this.businessArchitectureFeedbackActionRecord = businessArchitectureFeedbackActionRecord;
  }


}

