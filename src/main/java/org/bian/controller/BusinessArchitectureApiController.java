/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Design;

@BianRestController
public class BusinessArchitectureApiController {

	@Autowired
	BusinessArchitectureApiService service;
	
	@Design.Activate
	public BianResponse<SDBusinessArchitectureActivateOutputModel> activate(@RequestBody BianRequest<SDBusinessArchitectureActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("applicationarchitecture")
	@Design.Capture
	public BianResponse<BQApplicationArchitectureCaptureOutputModel> captureApplicationarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQApplicationArchitectureCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureApplicationarchitecture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("businessarchitecture")
	@Design.Capture
	public BianResponse<BQBusinessArchitectureCaptureOutputModel> captureBusinessarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBusinessArchitectureCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureBusinessarchitecture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("informationarchitecture")
	@Design.Capture
	public BianResponse<BQInformationArchitectureCaptureOutputModel> captureInformationarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInformationArchitectureCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureInformationarchitecture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("organization")
	@Design.Capture
	public BianResponse<BQOrganizationCaptureOutputModel> captureOrganization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOrganizationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureOrganization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("technologyinfrastructure")
	@Design.Capture
	public BianResponse<BQTechnologyInfrastructureCaptureOutputModel> captureTechnologyinfrastructure(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTechnologyInfrastructureCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureTechnologyinfrastructure(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Capture
	public BianResponse<CRBusinessArchitectureSpecificationCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBusinessArchitectureSpecificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Configure
	public BianResponse<SDBusinessArchitectureConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBusinessArchitectureConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Control
	public BianResponse<CRBusinessArchitectureSpecificationControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBusinessArchitectureSpecificationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Exchange
	public BianResponse<CRBusinessArchitectureSpecificationExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBusinessArchitectureSpecificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Feedback
	public BianResponse<SDBusinessArchitectureFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBusinessArchitectureFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Initiate
	public BianResponse<CRBusinessArchitectureSpecificationInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRBusinessArchitectureSpecificationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("applicationarchitecture")
	@Design.Request
	public BianResponse<BQApplicationArchitectureRequestOutputModel> requestApplicationarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQApplicationArchitectureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestApplicationarchitecture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("businessarchitecture")
	@Design.Request
	public BianResponse<BQBusinessArchitectureRequestOutputModel> requestBusinessarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBusinessArchitectureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestBusinessarchitecture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("informationarchitecture")
	@Design.Request
	public BianResponse<BQInformationArchitectureRequestOutputModel> requestInformationarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInformationArchitectureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestInformationarchitecture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("organization")
	@Design.Request
	public BianResponse<BQOrganizationRequestOutputModel> requestOrganization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOrganizationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestOrganization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("technologyinfrastructure")
	@Design.Request
	public BianResponse<BQTechnologyInfrastructureRequestOutputModel> requestTechnologyinfrastructure(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTechnologyInfrastructureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTechnologyinfrastructure(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Request
	public BianResponse<CRBusinessArchitectureSpecificationRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBusinessArchitectureSpecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Retrieve
	public BianResponse<CRBusinessArchitectureSpecificationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Design.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Design.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Design.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("applicationarchitecture")
	@Design.Retrieve
	public BianResponse<BQApplicationArchitectureRetrieveOutputModel> retrieveApplicationarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveApplicationarchitecture(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("businessarchitecture")
	@Design.Retrieve
	public BianResponse<BQBusinessArchitectureRetrieveOutputModel> retrieveBusinessarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBusinessarchitecture(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("informationarchitecture")
	@Design.Retrieve
	public BianResponse<BQInformationArchitectureRetrieveOutputModel> retrieveInformationarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInformationarchitecture(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("organization")
	@Design.Retrieve
	public BianResponse<BQOrganizationRetrieveOutputModel> retrieveOrganization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOrganization(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("technologyinfrastructure")
	@Design.Retrieve
	public BianResponse<BQTechnologyInfrastructureRetrieveOutputModel> retrieveTechnologyinfrastructure(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTechnologyinfrastructure(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Design.RetrieveSD
	public BianResponse<SDBusinessArchitectureRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Design.Update
	public BianResponse<CRBusinessArchitectureSpecificationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBusinessArchitectureSpecificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("applicationarchitecture")
	@Design.Update
	public BianResponse<BQApplicationArchitectureUpdateOutputModel> updateApplicationarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQApplicationArchitectureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateApplicationarchitecture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("businessarchitecture")
	@Design.Update
	public BianResponse<BQBusinessArchitectureUpdateOutputModel> updateBusinessarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBusinessArchitectureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBusinessarchitecture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("informationarchitecture")
	@Design.Update
	public BianResponse<BQInformationArchitectureUpdateOutputModel> updateInformationarchitecture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInformationArchitectureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInformationarchitecture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("organization")
	@Design.Update
	public BianResponse<BQOrganizationUpdateOutputModel> updateOrganization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOrganizationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOrganization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("technologyinfrastructure")
	@Design.Update
	public BianResponse<BQTechnologyInfrastructureUpdateOutputModel> updateTechnologyinfrastructure(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTechnologyInfrastructureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTechnologyinfrastructure(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
