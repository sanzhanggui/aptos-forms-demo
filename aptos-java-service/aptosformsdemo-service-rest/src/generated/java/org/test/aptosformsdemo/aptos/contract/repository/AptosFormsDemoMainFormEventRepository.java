// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.repository;

import org.test.aptosformsdemo.domain.aptosformsdemomainform.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface AptosFormsDemoMainFormEventRepository extends JpaRepository<AbstractAptosFormsDemoMainFormEvent, AptosFormsDemoMainFormEventId> {

    List<AbstractAptosFormsDemoMainFormEvent> findByStatusIsNull();

    AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted findFirstAptosFormsDemoMainFormSubmittedByOrderByAptosEventSequenceNumber();

    AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated findFirstAptosFormsDemoMainFormUpdatedByOrderByAptosEventSequenceNumber();

}
