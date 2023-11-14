// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.formdefinition;

import java.util.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.Event;

public interface FormDefinitionEvent extends Event, AptosEvent, HasStatus {

    interface SqlFormDefinitionEvent extends FormDefinitionEvent {
        FormDefinitionEventId getFormDefinitionEventId();

        boolean getEventReadOnly();

        void setEventReadOnly(boolean readOnly);
    }

    Long getFormSequenceId();

    //void setFormSequenceId(Long formSequenceId);

    Long getOffChainVersion();
    
    //void setOffChainVersion(Long offChainVersion);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    OffsetDateTime getCreatedAt();

    void setCreatedAt(OffsetDateTime createdAt);

    String getCommandId();

    void setCommandId(String commandId);

    interface FormDefinitionStateEvent extends FormDefinitionEvent {
        String getFormId();

        void setFormId(String formId);

        String getContractAddress();

        void setContractAddress(String contractAddress);

        String getStoreAccountAddress();

        void setStoreAccountAddress(String storeAccountAddress);

        String getStartPageName();

        void setStartPageName(String startPageName);

        BigInteger getVersion();

        void setVersion(BigInteger version);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface FormDefinitionStateCreated extends FormDefinitionStateEvent
    {
    
    }


    interface FormDefinitionStateMergePatched extends FormDefinitionStateEvent
    {
        Boolean getIsPropertyFormIdRemoved();

        void setIsPropertyFormIdRemoved(Boolean removed);

        Boolean getIsPropertyContractAddressRemoved();

        void setIsPropertyContractAddressRemoved(Boolean removed);

        Boolean getIsPropertyStoreAccountAddressRemoved();

        void setIsPropertyStoreAccountAddressRemoved(Boolean removed);

        Boolean getIsPropertyStartPageNameRemoved();

        void setIsPropertyStartPageNameRemoved(Boolean removed);

        Boolean getIsPropertyVersionRemoved();

        void setIsPropertyVersionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);



    }

    interface FormDefinitionStateDeleted extends FormDefinitionStateEvent
    {
    }


}

