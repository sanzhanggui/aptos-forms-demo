// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.formdefinition;

import java.util.*;
import java.math.*;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.Event;

public interface FormPageDefinitionState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    Integer getPageNumber();

    String getPageName();

    String getMoveStateTableFieldName();

    String getMoveStateStructName();

    String getMoveSubmitEventHandleFieldName();

    String getMoveUpdateEventHandleFieldName();

    String getMoveSubmitEventStructName();

    String getMoveUpdateEventStructName();

    Long getOffChainVersion();

    String getCreatedBy();

    OffsetDateTime getCreatedAt();

    String getUpdatedBy();

    OffsetDateTime getUpdatedAt();

    Boolean getActive();

    Boolean getDeleted();

    Long getFormDefinitionFormSequenceId();

    interface MutableFormPageDefinitionState extends FormPageDefinitionState {
        void setPageNumber(Integer pageNumber);

        void setPageName(String pageName);

        void setMoveStateTableFieldName(String moveStateTableFieldName);

        void setMoveStateStructName(String moveStateStructName);

        void setMoveSubmitEventHandleFieldName(String moveSubmitEventHandleFieldName);

        void setMoveUpdateEventHandleFieldName(String moveUpdateEventHandleFieldName);

        void setMoveSubmitEventStructName(String moveSubmitEventStructName);

        void setMoveUpdateEventStructName(String moveUpdateEventStructName);

        void setOffChainVersion(Long offChainVersion);

        void setCreatedBy(String createdBy);

        void setCreatedAt(OffsetDateTime createdAt);

        void setUpdatedBy(String updatedBy);

        void setUpdatedAt(OffsetDateTime updatedAt);

        void setActive(Boolean active);

        void setDeleted(Boolean deleted);

        void setFormDefinitionFormSequenceId(Long formDefinitionFormSequenceId);


        void mutate(Event e);

        //void when(FormPageDefinitionEvent.FormPageDefinitionStateCreated e);

        //void when(FormPageDefinitionEvent.FormPageDefinitionStateMergePatched e);

        //void when(FormPageDefinitionEvent.FormPageDefinitionStateRemoved e);
    }

    interface SqlFormPageDefinitionState extends MutableFormPageDefinitionState {
        FormDefinitionFormPageDefinitionId getFormDefinitionFormPageDefinitionId();

        void setFormDefinitionFormPageDefinitionId(FormDefinitionFormPageDefinitionId formDefinitionFormPageDefinitionId);


        boolean isStateUnsaved();

        boolean getForReapplying();
    }
}

