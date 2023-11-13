// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.taskservice;

import org.test.aptosformsdemo.aptos.contract.service.AptosFormsDemoMainFormEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Value;
import org.test.aptosformsdemo.aptos.contract.ContractConstants;
import org.test.aptosformsdemo.aptos.contract.AptosAccount;
import org.test.aptosformsdemo.aptos.contract.repository.AptosAccountRepository;
import org.test.aptosformsdemo.aptos.contract.ContractModuleNameProvider;
import org.test.aptosformsdemo.aptos.contract.DefaultContractModuleNameProvider;
import org.test.aptosformsdemo.domain.FormSequenceIdAndAddress;
import org.test.aptosformsdemo.aptos.contract.TestTenantizedIdFunctions;

@Service
public class PullAptosFormsDemoMainFormEventsTaskService {

    @Value("${aptos.contract.address}")
    private String aptosContractAddress;

    @Autowired
    private AptosAccountRepository aptosAccountRepository;

    @Autowired
    private AptosFormsDemoMainFormEventService aptosFormsDemoMainFormEventService;

    @Scheduled(fixedDelayString = "${aptos.contract.pull-aptos-forms-demo-main-form-events.aptos-forms-demo-main-form-submitted.fixed-delay:5000}")
    public void pullAptosFormsDemoMainFormSubmittedEvents() {
        aptosFormsDemoMainFormEventService.pullAptosFormsDemoMainFormSubmittedEvents(getContractModuleNameProvider(), getToFormSequenceIdAndAddressFunction());
    }

    @Scheduled(fixedDelayString = "${aptos.contract.pull-aptos-forms-demo-main-form-events.aptos-forms-demo-main-form-updated.fixed-delay:5000}")
    public void pullAptosFormsDemoMainFormUpdatedEvents() {
        aptosFormsDemoMainFormEventService.pullAptosFormsDemoMainFormUpdatedEvents(getContractModuleNameProvider(), getToFormSequenceIdAndAddressFunction());
    }

    private java.util.function.Function<String, FormSequenceIdAndAddress> getToFormSequenceIdAndAddressFunction() {
       return TestTenantizedIdFunctions.toFormSequenceIdAndAddressFunction(); // todo only for test
    }

    private ContractModuleNameProvider getContractModuleNameProvider() {
        DefaultContractModuleNameProvider contractModuleNameProvider = new DefaultContractModuleNameProvider();
        contractModuleNameProvider.setContractAddress(aptosContractAddress);
        contractModuleNameProvider.setStoreAccountAddress(getResourceAccountAddress());
        return contractModuleNameProvider;
    }

    private String getResourceAccountAddress() {
        return aptosAccountRepository.findById(ContractConstants.RESOURCE_ACCOUNT_ADDRESS)
                .map(AptosAccount::getAddress).orElse(null);
    }
}
