/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface BusinessArchitectureApiService {

	SDBusinessArchitectureActivateOutputModel activate(SDBusinessArchitectureActivateInputModel request);
	
	BQApplicationArchitectureCaptureOutputModel captureApplicationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQApplicationArchitectureCaptureInputModel request);
	
	BQBusinessArchitectureCaptureOutputModel captureBusinessarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBusinessArchitectureCaptureInputModel request);
	
	BQInformationArchitectureCaptureOutputModel captureInformationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationArchitectureCaptureInputModel request);
	
	BQOrganizationCaptureOutputModel captureOrganization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrganizationCaptureInputModel request);
	
	BQTechnologyInfrastructureCaptureOutputModel captureTechnologyinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnologyInfrastructureCaptureInputModel request);
	
	CRBusinessArchitectureSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRBusinessArchitectureSpecificationCaptureInputModel request);
	
	SDBusinessArchitectureConfigureOutputModel configure(String sdReferenceId, SDBusinessArchitectureConfigureInputModel request);
	
	CRBusinessArchitectureSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRBusinessArchitectureSpecificationControlInputModel request);
	
	CRBusinessArchitectureSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBusinessArchitectureSpecificationExchangeInputModel request);
	
	SDBusinessArchitectureFeedbackOutputModel feedback(String sdReferenceId, SDBusinessArchitectureFeedbackInputModel request);
	
	CRBusinessArchitectureSpecificationInitiateOutputModel initiate(String sdReferenceId, CRBusinessArchitectureSpecificationInitiateInputModel request);
	
	BQApplicationArchitectureRequestOutputModel requestApplicationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQApplicationArchitectureRequestInputModel request);
	
	BQBusinessArchitectureRequestOutputModel requestBusinessarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBusinessArchitectureRequestInputModel request);
	
	BQInformationArchitectureRequestOutputModel requestInformationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationArchitectureRequestInputModel request);
	
	BQOrganizationRequestOutputModel requestOrganization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrganizationRequestInputModel request);
	
	BQTechnologyInfrastructureRequestOutputModel requestTechnologyinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnologyInfrastructureRequestInputModel request);
	
	CRBusinessArchitectureSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBusinessArchitectureSpecificationRequestInputModel request);
	
	CRBusinessArchitectureSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQApplicationArchitectureRetrieveOutputModel retrieveApplicationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQBusinessArchitectureRetrieveOutputModel retrieveBusinessarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInformationArchitectureRetrieveOutputModel retrieveInformationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOrganizationRetrieveOutputModel retrieveOrganization(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTechnologyInfrastructureRetrieveOutputModel retrieveTechnologyinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDBusinessArchitectureRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRBusinessArchitectureSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBusinessArchitectureSpecificationUpdateInputModel request);
	
	BQApplicationArchitectureUpdateOutputModel updateApplicationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQApplicationArchitectureUpdateInputModel request);
	
	BQBusinessArchitectureUpdateOutputModel updateBusinessarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBusinessArchitectureUpdateInputModel request);
	
	BQInformationArchitectureUpdateOutputModel updateInformationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationArchitectureUpdateInputModel request);
	
	BQOrganizationUpdateOutputModel updateOrganization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrganizationUpdateInputModel request);
	
	BQTechnologyInfrastructureUpdateOutputModel updateTechnologyinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnologyInfrastructureUpdateInputModel request);
	
}
