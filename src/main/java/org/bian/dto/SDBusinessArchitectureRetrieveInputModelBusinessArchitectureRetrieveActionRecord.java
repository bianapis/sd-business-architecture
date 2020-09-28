package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordBusinessArchitectureActivityAnalysis;
import org.bian.dto.SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordBusinessArchitecturePerformanceAnalysis;
import org.bian.dto.SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecord
 */
public class SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecord   {
  private SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordBusinessArchitectureActivityAnalysis businessArchitectureActivityAnalysis = null;

  private SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordBusinessArchitecturePerformanceAnalysis businessArchitecturePerformanceAnalysis = null;

  private SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get businessArchitectureActivityAnalysis
   * @return businessArchitectureActivityAnalysis
  **/

  public SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordBusinessArchitectureActivityAnalysis getBusinessArchitectureActivityAnalysis() {
    return businessArchitectureActivityAnalysis;
  }

  public void setBusinessArchitectureActivityAnalysis(SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordBusinessArchitectureActivityAnalysis businessArchitectureActivityAnalysis) {
    this.businessArchitectureActivityAnalysis = businessArchitectureActivityAnalysis;
  }


  /**
   * Get businessArchitecturePerformanceAnalysis
   * @return businessArchitecturePerformanceAnalysis
  **/

  public SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordBusinessArchitecturePerformanceAnalysis getBusinessArchitecturePerformanceAnalysis() {
    return businessArchitecturePerformanceAnalysis;
  }

  public void setBusinessArchitecturePerformanceAnalysis(SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordBusinessArchitecturePerformanceAnalysis businessArchitecturePerformanceAnalysis) {
    this.businessArchitecturePerformanceAnalysis = businessArchitecturePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDBusinessArchitectureRetrieveInputModelBusinessArchitectureRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

