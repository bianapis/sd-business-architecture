package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord
 */
public class SDBusinessArchitectureRetrieveInputModelBusinessArchitectureOfferedServiceBusinessArchitectureServiceRecord   {
  private String businessArchitectureServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return businessArchitectureServiceVersion
  **/

  public String getBusinessArchitectureServiceVersion() {
    return businessArchitectureServiceVersion;
  }

  public void setBusinessArchitectureServiceVersion(String businessArchitectureServiceVersion) {
    this.businessArchitectureServiceVersion = businessArchitectureServiceVersion;
  }


}

