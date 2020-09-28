package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordBusinessArchitectureActivityAnalysis;
import org.bian.dto.SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordBusinessArchitecturePerformanceAnalysis;
import org.bian.dto.SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecord
 */
public class SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecord   {
  private SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordBusinessArchitectureActivityAnalysis businessArchitectureActivityAnalysis = null;

  private SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordBusinessArchitecturePerformanceAnalysis businessArchitecturePerformanceAnalysis = null;

  private SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get businessArchitectureActivityAnalysis
   * @return businessArchitectureActivityAnalysis
  **/

  public SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordBusinessArchitectureActivityAnalysis getBusinessArchitectureActivityAnalysis() {
    return businessArchitectureActivityAnalysis;
  }

  public void setBusinessArchitectureActivityAnalysis(SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordBusinessArchitectureActivityAnalysis businessArchitectureActivityAnalysis) {
    this.businessArchitectureActivityAnalysis = businessArchitectureActivityAnalysis;
  }


  /**
   * Get businessArchitecturePerformanceAnalysis
   * @return businessArchitecturePerformanceAnalysis
  **/

  public SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordBusinessArchitecturePerformanceAnalysis getBusinessArchitecturePerformanceAnalysis() {
    return businessArchitecturePerformanceAnalysis;
  }

  public void setBusinessArchitecturePerformanceAnalysis(SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordBusinessArchitecturePerformanceAnalysis businessArchitecturePerformanceAnalysis) {
    this.businessArchitecturePerformanceAnalysis = businessArchitecturePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDBusinessArchitectureRetrieveOutputModelBusinessArchitectureRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

