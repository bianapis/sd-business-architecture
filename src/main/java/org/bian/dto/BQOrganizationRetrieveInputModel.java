package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrganizationRetrieveInputModelOrganizationInstanceAnalysis;
import org.bian.dto.BQOrganizationRetrieveInputModelOrganizationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOrganizationRetrieveInputModel
 */
public class BQOrganizationRetrieveInputModel   {
  private Object organizationRetrieveActionTaskRecord = null;

  private String organizationRetrieveActionRequest = null;

  private BQOrganizationRetrieveInputModelOrganizationInstanceReport organizationInstanceReport = null;

  private BQOrganizationRetrieveInputModelOrganizationInstanceAnalysis organizationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return organizationRetrieveActionTaskRecord
  **/

  public Object getOrganizationRetrieveActionTaskRecord() {
    return organizationRetrieveActionTaskRecord;
  }

  public void setOrganizationRetrieveActionTaskRecord(Object organizationRetrieveActionTaskRecord) {
    this.organizationRetrieveActionTaskRecord = organizationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return organizationRetrieveActionRequest
  **/

  public String getOrganizationRetrieveActionRequest() {
    return organizationRetrieveActionRequest;
  }

  public void setOrganizationRetrieveActionRequest(String organizationRetrieveActionRequest) {
    this.organizationRetrieveActionRequest = organizationRetrieveActionRequest;
  }


  /**
   * Get organizationInstanceReport
   * @return organizationInstanceReport
  **/

  public BQOrganizationRetrieveInputModelOrganizationInstanceReport getOrganizationInstanceReport() {
    return organizationInstanceReport;
  }

  public void setOrganizationInstanceReport(BQOrganizationRetrieveInputModelOrganizationInstanceReport organizationInstanceReport) {
    this.organizationInstanceReport = organizationInstanceReport;
  }


  /**
   * Get organizationInstanceAnalysis
   * @return organizationInstanceAnalysis
  **/

  public BQOrganizationRetrieveInputModelOrganizationInstanceAnalysis getOrganizationInstanceAnalysis() {
    return organizationInstanceAnalysis;
  }

  public void setOrganizationInstanceAnalysis(BQOrganizationRetrieveInputModelOrganizationInstanceAnalysis organizationInstanceAnalysis) {
    this.organizationInstanceAnalysis = organizationInstanceAnalysis;
  }


}

