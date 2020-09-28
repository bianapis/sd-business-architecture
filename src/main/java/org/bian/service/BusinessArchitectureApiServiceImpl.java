/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class BusinessArchitectureApiServiceImpl implements BusinessArchitectureApiService {

	public SDBusinessArchitectureActivateOutputModel activate(SDBusinessArchitectureActivateInputModel request){
		return JsonReader.read("activate-SDBusinessArchitectureActivateOutputModel.json",new TypeReference<SDBusinessArchitectureActivateOutputModel>(){});
	}
	
	public BQApplicationArchitectureCaptureOutputModel captureApplicationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQApplicationArchitectureCaptureInputModel request){
		return JsonReader.read("capture-BQApplicationArchitectureCaptureOutputModel.json",new TypeReference<BQApplicationArchitectureCaptureOutputModel>(){});
	}
	
	public BQBusinessArchitectureCaptureOutputModel captureBusinessarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBusinessArchitectureCaptureInputModel request){
		return JsonReader.read("capture-BQBusinessArchitectureCaptureOutputModel.json",new TypeReference<BQBusinessArchitectureCaptureOutputModel>(){});
	}
	
	public BQInformationArchitectureCaptureOutputModel captureInformationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationArchitectureCaptureInputModel request){
		return JsonReader.read("capture-BQInformationArchitectureCaptureOutputModel.json",new TypeReference<BQInformationArchitectureCaptureOutputModel>(){});
	}
	
	public BQOrganizationCaptureOutputModel captureOrganization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrganizationCaptureInputModel request){
		return JsonReader.read("capture-BQOrganizationCaptureOutputModel.json",new TypeReference<BQOrganizationCaptureOutputModel>(){});
	}
	
	public BQTechnologyInfrastructureCaptureOutputModel captureTechnologyinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnologyInfrastructureCaptureInputModel request){
		return JsonReader.read("capture-BQTechnologyInfrastructureCaptureOutputModel.json",new TypeReference<BQTechnologyInfrastructureCaptureOutputModel>(){});
	}
	
	public CRBusinessArchitectureSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRBusinessArchitectureSpecificationCaptureInputModel request){
		return JsonReader.read("capture-CRBusinessArchitectureSpecificationCaptureOutputModel.json",new TypeReference<CRBusinessArchitectureSpecificationCaptureOutputModel>(){});
	}
	
	public SDBusinessArchitectureConfigureOutputModel configure(String sdReferenceId, SDBusinessArchitectureConfigureInputModel request){
		return JsonReader.read("configure-SDBusinessArchitectureConfigureOutputModel.json",new TypeReference<SDBusinessArchitectureConfigureOutputModel>(){});
	}
	
	public CRBusinessArchitectureSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRBusinessArchitectureSpecificationControlInputModel request){
		return JsonReader.read("control-CRBusinessArchitectureSpecificationControlOutputModel.json",new TypeReference<CRBusinessArchitectureSpecificationControlOutputModel>(){});
	}
	
	public CRBusinessArchitectureSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBusinessArchitectureSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-CRBusinessArchitectureSpecificationExchangeOutputModel.json",new TypeReference<CRBusinessArchitectureSpecificationExchangeOutputModel>(){});
	}
	
	public SDBusinessArchitectureFeedbackOutputModel feedback(String sdReferenceId, SDBusinessArchitectureFeedbackInputModel request){
		return JsonReader.read("feedback-SDBusinessArchitectureFeedbackOutputModel.json",new TypeReference<SDBusinessArchitectureFeedbackOutputModel>(){});
	}
	
	public CRBusinessArchitectureSpecificationInitiateOutputModel initiate(String sdReferenceId, CRBusinessArchitectureSpecificationInitiateInputModel request){
		return JsonReader.read("initiate-CRBusinessArchitectureSpecificationInitiateOutputModel.json",new TypeReference<CRBusinessArchitectureSpecificationInitiateOutputModel>(){});
	}
	
	public BQApplicationArchitectureRequestOutputModel requestApplicationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQApplicationArchitectureRequestInputModel request){
		return JsonReader.read("request-BQApplicationArchitectureRequestOutputModel.json",new TypeReference<BQApplicationArchitectureRequestOutputModel>(){});
	}
	
	public BQBusinessArchitectureRequestOutputModel requestBusinessarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBusinessArchitectureRequestInputModel request){
		return JsonReader.read("request-BQBusinessArchitectureRequestOutputModel.json",new TypeReference<BQBusinessArchitectureRequestOutputModel>(){});
	}
	
	public BQInformationArchitectureRequestOutputModel requestInformationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationArchitectureRequestInputModel request){
		return JsonReader.read("request-BQInformationArchitectureRequestOutputModel.json",new TypeReference<BQInformationArchitectureRequestOutputModel>(){});
	}
	
	public BQOrganizationRequestOutputModel requestOrganization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrganizationRequestInputModel request){
		return JsonReader.read("request-BQOrganizationRequestOutputModel.json",new TypeReference<BQOrganizationRequestOutputModel>(){});
	}
	
	public BQTechnologyInfrastructureRequestOutputModel requestTechnologyinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnologyInfrastructureRequestInputModel request){
		return JsonReader.read("request-BQTechnologyInfrastructureRequestOutputModel.json",new TypeReference<BQTechnologyInfrastructureRequestOutputModel>(){});
	}
	
	public CRBusinessArchitectureSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBusinessArchitectureSpecificationRequestInputModel request){
		return JsonReader.read("request-CRBusinessArchitectureSpecificationRequestOutputModel.json",new TypeReference<CRBusinessArchitectureSpecificationRequestOutputModel>(){});
	}
	
	public CRBusinessArchitectureSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRBusinessArchitectureSpecificationRetrieveOutputModel.json",new TypeReference<CRBusinessArchitectureSpecificationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQApplicationArchitectureRetrieveOutputModel retrieveApplicationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQApplicationArchitectureRetrieveOutputModel.json",new TypeReference<BQApplicationArchitectureRetrieveOutputModel>(){});
	}
	
	public BQBusinessArchitectureRetrieveOutputModel retrieveBusinessarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBusinessArchitectureRetrieveOutputModel.json",new TypeReference<BQBusinessArchitectureRetrieveOutputModel>(){});
	}
	
	public BQInformationArchitectureRetrieveOutputModel retrieveInformationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInformationArchitectureRetrieveOutputModel.json",new TypeReference<BQInformationArchitectureRetrieveOutputModel>(){});
	}
	
	public BQOrganizationRetrieveOutputModel retrieveOrganization(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOrganizationRetrieveOutputModel.json",new TypeReference<BQOrganizationRetrieveOutputModel>(){});
	}
	
	public BQTechnologyInfrastructureRetrieveOutputModel retrieveTechnologyinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTechnologyInfrastructureRetrieveOutputModel.json",new TypeReference<BQTechnologyInfrastructureRetrieveOutputModel>(){});
	}
	
	public SDBusinessArchitectureRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDBusinessArchitectureRetrieveOutputModel.json",new TypeReference<SDBusinessArchitectureRetrieveOutputModel>(){});
	}
	
	public CRBusinessArchitectureSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBusinessArchitectureSpecificationUpdateInputModel request){
		return JsonReader.read("update-CRBusinessArchitectureSpecificationUpdateOutputModel.json",new TypeReference<CRBusinessArchitectureSpecificationUpdateOutputModel>(){});
	}
	
	public BQApplicationArchitectureUpdateOutputModel updateApplicationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQApplicationArchitectureUpdateInputModel request){
		return JsonReader.read("update-BQApplicationArchitectureUpdateOutputModel.json",new TypeReference<BQApplicationArchitectureUpdateOutputModel>(){});
	}
	
	public BQBusinessArchitectureUpdateOutputModel updateBusinessarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBusinessArchitectureUpdateInputModel request){
		return JsonReader.read("update-BQBusinessArchitectureUpdateOutputModel.json",new TypeReference<BQBusinessArchitectureUpdateOutputModel>(){});
	}
	
	public BQInformationArchitectureUpdateOutputModel updateInformationarchitecture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInformationArchitectureUpdateInputModel request){
		return JsonReader.read("update-BQInformationArchitectureUpdateOutputModel.json",new TypeReference<BQInformationArchitectureUpdateOutputModel>(){});
	}
	
	public BQOrganizationUpdateOutputModel updateOrganization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrganizationUpdateInputModel request){
		return JsonReader.read("update-BQOrganizationUpdateOutputModel.json",new TypeReference<BQOrganizationUpdateOutputModel>(){});
	}
	
	public BQTechnologyInfrastructureUpdateOutputModel updateTechnologyinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnologyInfrastructureUpdateInputModel request){
		return JsonReader.read("update-BQTechnologyInfrastructureUpdateOutputModel.json",new TypeReference<BQTechnologyInfrastructureUpdateOutputModel>(){});
	}
	
}
