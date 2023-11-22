// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.taskservice;

import org.test.aptosformsdemo.aptos.contract.repository.AptosFormsDemoMainFormEventRepository;
import org.test.aptosformsdemo.aptos.contract.service.AptosAptosFormsDemoMainFormService;
import org.test.aptosformsdemo.aptos.contract.service.AptosFormsDemoMainFormEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Value;
import org.test.aptosformsdemo.aptos.contract.ContractConstants;
import org.test.aptosformsdemo.aptos.contract.AptosAccount;
import org.test.aptosformsdemo.aptos.contract.repository.AptosAccountRepository;
import org.test.aptosformsdemo.aptos.contract.ContractModuleNameProvider;
import org.test.aptosformsdemo.aptos.contract.DefaultAptosFormsDemoMainFormModuleNameProvider;
import org.test.aptosformsdemo.domain.FormPageAndAddress;
import org.test.aptosformsdemo.aptos.contract.TestTenantizedIdFunctions;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.AptosFormsDemoMainFormState;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.AptosFormsDemoMainFormStateQueryRepository;
import org.test.aptosformsdemo.domain.formdefinition.FormDefinitionState;
import org.test.aptosformsdemo.domain.formdefinition.FormDefinitionStateQueryRepository;
import org.test.aptosformsdemo.domain.formdefinition.FormPageDefinitionState;

import java.util.HashMap;

@Service
public class PullAptosFormsDemoMainFormEventsTaskService {

    @Autowired
    private AptosAccountRepository aptosAccountRepository;

    @Autowired
    private AptosFormsDemoMainFormEventService aptosFormsDemoMainFormEventService;

    @Autowired
    private FormDefinitionStateQueryRepository formDefinitionStateQueryRepository;


    @Scheduled(fixedDelayString = "${aptos.contract.pull-aptos-forms-demo-main-form-events.aptos-forms-demo-main-form-submitted.fixed-delay:5000}")
    public void pullAptosFormsDemoMainFormSubmittedEvents() {
        FormDefinitionState formDefinitionState = getFirstFormDefinitionState(); //todo only for test
        if (formDefinitionState == null) { return; }
        FormPageDefinitionState formPageDefinitionState = formDefinitionState.getPageDefinitions().get(1);
        if (formPageDefinitionState == null) { return; }
        String moduleName = ContractModuleNameProvider.toUnderscoreName(formDefinitionState.getFormId() + formPageDefinitionState.getPageName(), true);
        aptosFormsDemoMainFormEventService.pullAptosFormsDemoMainFormSubmittedEvents(
                getContractModuleNameProvider(moduleName, formDefinitionState, formPageDefinitionState),
                getToFormPageAndAddressFunction(formDefinitionState.getFormSequenceId(), formPageDefinitionState.getPageNumber())
        );
    }

    @Scheduled(fixedDelayString = "${aptos.contract.pull-aptos-forms-demo-main-form-events.aptos-forms-demo-main-form-updated.fixed-delay:5000}")
    public void pullAptosFormsDemoMainFormUpdatedEvents() {
        FormDefinitionState formDefinitionState = getFirstFormDefinitionState();
        if (formDefinitionState == null) { return; }
        FormPageDefinitionState formPageDefinitionState = formDefinitionState.getPageDefinitions().get(1);
        if (formPageDefinitionState == null) { return; }
        String moduleName = ContractModuleNameProvider.toUnderscoreName(formDefinitionState.getFormId() + formPageDefinitionState.getPageName(), true);
        aptosFormsDemoMainFormEventService.pullAptosFormsDemoMainFormUpdatedEvents(
                getContractModuleNameProvider(moduleName, formDefinitionState, formPageDefinitionState),
                getToFormPageAndAddressFunction(formDefinitionState.getFormSequenceId(), formPageDefinitionState.getPageNumber())
        );
    }

    private FormDefinitionState getFirstFormDefinitionState() {
        java.util.Map<String, Object> filter = new HashMap<>();
        java.util.List<String> orders = new java.util.ArrayList<>();
        orders.add("formSequenceId");
        FormDefinitionState formDefinitionState = formDefinitionStateQueryRepository.getFirst(filter.entrySet(), orders);
        return formDefinitionState;
    }

    public static java.util.function.Function<String, FormPageAndAddress> getToFormPageAndAddressFunction(final long formSequenceId, final int pageNumber) {
        return (address) -> {
            FormPageAndAddress formPageAndAddress = new FormPageAndAddress();
            formPageAndAddress.setFormSequenceId(formSequenceId);
            formPageAndAddress.setPageNumber(pageNumber);
            formPageAndAddress.setAddress(address);
            return formPageAndAddress;
        };
    }

    public static ContractModuleNameProvider getContractModuleNameProvider(final String moduleName, final FormDefinitionState formDefinitionState, final FormPageDefinitionState formPageDefinitionState) {
        ContractModuleNameProvider contractModuleNameProvider = new ContractModuleNameProvider() {
            @Override
            public String getModuleQualifiedEventStructName(String eventCategory) {
                if ("AptosFormsDemoMainFormSubmitted".equals(eventCategory)) {
                    return moduleName + "::" + formPageDefinitionState.getMoveSubmitEventStructName();
                }
                if ("AptosFormsDemoMainFormUpdated".equals(eventCategory)) {
                    return moduleName + "::" + formPageDefinitionState.getMoveUpdateEventStructName();
                }
                throw new IllegalArgumentException("Unknown event category: " + eventCategory);
            }

            @Override
            public String getEventHandleFieldName(String eventCategory) {
                if ("AptosFormsDemoMainFormSubmitted".equals(eventCategory)) {
                    return formPageDefinitionState.getMoveSubmitEventHandleFieldName();
                }
                if ("AptosFormsDemoMainFormUpdated".equals(eventCategory)) {
                    return formPageDefinitionState.getMoveUpdateEventHandleFieldName();
                }
                throw new IllegalArgumentException("Unknown event category: " + eventCategory);
            }

            @Override
            public String getStateTableFieldName() {
                return formPageDefinitionState.getMoveStateTableFieldName();
            }

            @Override
            public String getModuleQualifiedEntityStateStructName() {
                return moduleName + "::" + formPageDefinitionState.getMoveStateStructName();
            }

            @Override
            public String getModuleQualifiedTablesStructName() {
                return moduleName + "::Tables";
            }

            @Override
            public String getModuleQualifiedEventsStructName() {
                return moduleName + "::Events";
            }

            @Override
            public String getContractAddress() {
                return formDefinitionState.getContractAddress();
            }

            @Override
            public String getStoreAccountAddress() {
                return formDefinitionState.getStoreAccountAddress();
            }
        };
        return contractModuleNameProvider;
    }

}
