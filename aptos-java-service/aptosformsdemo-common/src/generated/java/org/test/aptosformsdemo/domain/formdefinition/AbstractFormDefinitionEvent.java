// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.formdefinition;

import java.util.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.domain.AbstractEvent;

public abstract class AbstractFormDefinitionEvent extends AbstractEvent implements FormDefinitionEvent.SqlFormDefinitionEvent, AptosEvent.MutableAptosEvent, HasStatus.MutableHasStatus {
    private FormDefinitionEventId formDefinitionEventId = new FormDefinitionEventId();

    public FormDefinitionEventId getFormDefinitionEventId() {
        return this.formDefinitionEventId;
    }

    public void setFormDefinitionEventId(FormDefinitionEventId eventId) {
        this.formDefinitionEventId = eventId;
    }
    
    public Long getFormSequenceId() {
        return getFormDefinitionEventId().getFormSequenceId();
    }

    public void setFormSequenceId(Long formSequenceId) {
        getFormDefinitionEventId().setFormSequenceId(formSequenceId);
    }

    private boolean eventReadOnly;

    public boolean getEventReadOnly() { return this.eventReadOnly; }

    public void setEventReadOnly(boolean readOnly) { this.eventReadOnly = readOnly; }

    public Long getOffChainVersion() {
        return getFormDefinitionEventId().getOffChainVersion();
    }
    
    public void setOffChainVersion(Long offChainVersion) {
        getFormDefinitionEventId().setOffChainVersion(offChainVersion);
    }

    private BigInteger aptosEventVersion;

    public BigInteger getAptosEventVersion() {
        return this.aptosEventVersion;
    }
    
    public void setAptosEventVersion(BigInteger aptosEventVersion) {
        this.aptosEventVersion = aptosEventVersion;
    }

    private BigInteger aptosEventSequenceNumber;

    public BigInteger getAptosEventSequenceNumber() {
        return this.aptosEventSequenceNumber;
    }
    
    public void setAptosEventSequenceNumber(BigInteger aptosEventSequenceNumber) {
        this.aptosEventSequenceNumber = aptosEventSequenceNumber;
    }

    private String aptosEventType;

    public String getAptosEventType() {
        return this.aptosEventType;
    }
    
    public void setAptosEventType(String aptosEventType) {
        this.aptosEventType = aptosEventType;
    }

    private AptosEventGuid aptosEventGuid;

    public AptosEventGuid getAptosEventGuid() {
        return this.aptosEventGuid;
    }
    
    public void setAptosEventGuid(AptosEventGuid aptosEventGuid) {
        this.aptosEventGuid = aptosEventGuid;
    }

    private String status;

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    private String createdBy;

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private OffsetDateTime createdAt;

    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    private String commandType;

    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    protected AbstractFormDefinitionEvent() {
    }

    protected AbstractFormDefinitionEvent(FormDefinitionEventId eventId) {
        this.formDefinitionEventId = eventId;
    }


    public abstract String getEventClass();

    public static class FormDefinitionLobEvent extends  AbstractFormDefinitionEvent {

        public Map<String, Object> getDynamicProperties() {
            return dynamicProperties;
        }

        public void setDynamicProperties(Map<String, Object> dynamicProperties) {
            if (dynamicProperties == null) {
                throw new IllegalArgumentException("dynamicProperties is null.");
            }
            this.dynamicProperties = dynamicProperties;
        }

        private Map<String, Object> dynamicProperties = new HashMap<>();

        @Override
        public String getEventClass() {
            return "FormDefinitionLobEvent";
        }

    }


    public static abstract class AbstractFormDefinitionStateEvent extends AbstractFormDefinitionEvent implements FormDefinitionEvent.FormDefinitionStateEvent {
        private String formId;

        public String getFormId()
        {
            return this.formId;
        }

        public void setFormId(String formId)
        {
            this.formId = formId;
        }

        private String contractAddress;

        public String getContractAddress()
        {
            return this.contractAddress;
        }

        public void setContractAddress(String contractAddress)
        {
            this.contractAddress = contractAddress;
        }

        private String storeAccountAddress;

        public String getStoreAccountAddress()
        {
            return this.storeAccountAddress;
        }

        public void setStoreAccountAddress(String storeAccountAddress)
        {
            this.storeAccountAddress = storeAccountAddress;
        }

        private String startPageName;

        public String getStartPageName()
        {
            return this.startPageName;
        }

        public void setStartPageName(String startPageName)
        {
            this.startPageName = startPageName;
        }

        private BigInteger version;

        public BigInteger getVersion()
        {
            return this.version;
        }

        public void setVersion(BigInteger version)
        {
            this.version = version;
        }

        private Boolean active;

        public Boolean getActive()
        {
            return this.active;
        }

        public void setActive(Boolean active)
        {
            this.active = active;
        }

        protected AbstractFormDefinitionStateEvent(FormDefinitionEventId eventId) {
            super(eventId);
        }
    }

    public static abstract class AbstractFormDefinitionStateCreated extends AbstractFormDefinitionStateEvent implements FormDefinitionEvent.FormDefinitionStateCreated
    {
        public AbstractFormDefinitionStateCreated() {
            this(new FormDefinitionEventId());
        }

        public AbstractFormDefinitionStateCreated(FormDefinitionEventId eventId) {
            super(eventId);
        }

        public String getEventClass() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractFormDefinitionStateMergePatched extends AbstractFormDefinitionStateEvent implements FormDefinitionEvent.FormDefinitionStateMergePatched
    {
        public AbstractFormDefinitionStateMergePatched() {
            this(new FormDefinitionEventId());
        }

        public AbstractFormDefinitionStateMergePatched(FormDefinitionEventId eventId) {
            super(eventId);
        }

        public String getEventClass() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyFormIdRemoved;

        public Boolean getIsPropertyFormIdRemoved() {
            return this.isPropertyFormIdRemoved;
        }

        public void setIsPropertyFormIdRemoved(Boolean removed) {
            this.isPropertyFormIdRemoved = removed;
        }

        private Boolean isPropertyContractAddressRemoved;

        public Boolean getIsPropertyContractAddressRemoved() {
            return this.isPropertyContractAddressRemoved;
        }

        public void setIsPropertyContractAddressRemoved(Boolean removed) {
            this.isPropertyContractAddressRemoved = removed;
        }

        private Boolean isPropertyStoreAccountAddressRemoved;

        public Boolean getIsPropertyStoreAccountAddressRemoved() {
            return this.isPropertyStoreAccountAddressRemoved;
        }

        public void setIsPropertyStoreAccountAddressRemoved(Boolean removed) {
            this.isPropertyStoreAccountAddressRemoved = removed;
        }

        private Boolean isPropertyStartPageNameRemoved;

        public Boolean getIsPropertyStartPageNameRemoved() {
            return this.isPropertyStartPageNameRemoved;
        }

        public void setIsPropertyStartPageNameRemoved(Boolean removed) {
            this.isPropertyStartPageNameRemoved = removed;
        }

        private Boolean isPropertyVersionRemoved;

        public Boolean getIsPropertyVersionRemoved() {
            return this.isPropertyVersionRemoved;
        }

        public void setIsPropertyVersionRemoved(Boolean removed) {
            this.isPropertyVersionRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }


    }


    public static abstract class AbstractFormDefinitionStateDeleted extends AbstractFormDefinitionStateEvent implements FormDefinitionEvent.FormDefinitionStateDeleted
    {
        public AbstractFormDefinitionStateDeleted() {
            this(new FormDefinitionEventId());
        }

        public AbstractFormDefinitionStateDeleted(FormDefinitionEventId eventId) {
            super(eventId);
        }

        public String getEventClass() {
            return StateEventType.DELETED;
        }

    }

    public static class SimpleFormDefinitionStateCreated extends AbstractFormDefinitionStateCreated
    {
        public SimpleFormDefinitionStateCreated() {
        }

        public SimpleFormDefinitionStateCreated(FormDefinitionEventId eventId) {
            super(eventId);
        }
    }

    public static class SimpleFormDefinitionStateMergePatched extends AbstractFormDefinitionStateMergePatched
    {
        public SimpleFormDefinitionStateMergePatched() {
        }

        public SimpleFormDefinitionStateMergePatched(FormDefinitionEventId eventId) {
            super(eventId);
        }
    }

    public static class SimpleFormDefinitionStateDeleted extends AbstractFormDefinitionStateDeleted
    {
        public SimpleFormDefinitionStateDeleted() {
        }

        public SimpleFormDefinitionStateDeleted(FormDefinitionEventId eventId) {
            super(eventId);
        }
    }

}

