// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform;

import java.util.*;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.domain.AbstractEvent;

public abstract class AbstractAptosFormsDemoMainFormEvent extends AbstractEvent implements AptosFormsDemoMainFormEvent.SqlAptosFormsDemoMainFormEvent, AptosEvent.MutableAptosEvent, HasStatus.MutableHasStatus {
    private AptosFormsDemoMainFormEventId aptosFormsDemoMainFormEventId = new AptosFormsDemoMainFormEventId();

    public AptosFormsDemoMainFormEventId getAptosFormsDemoMainFormEventId() {
        return this.aptosFormsDemoMainFormEventId;
    }

    public void setAptosFormsDemoMainFormEventId(AptosFormsDemoMainFormEventId eventId) {
        this.aptosFormsDemoMainFormEventId = eventId;
    }
    
    public String getSignerAddress() {
        return getAptosFormsDemoMainFormEventId().getSignerAddress();
    }

    public void setSignerAddress(String signerAddress) {
        getAptosFormsDemoMainFormEventId().setSignerAddress(signerAddress);
    }

    private boolean eventReadOnly;

    public boolean getEventReadOnly() { return this.eventReadOnly; }

    public void setEventReadOnly(boolean readOnly) { this.eventReadOnly = readOnly; }

    public BigInteger getVersion() {
        return getAptosFormsDemoMainFormEventId().getVersion();
    }
    
    public void setVersion(BigInteger version) {
        getAptosFormsDemoMainFormEventId().setVersion(version);
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

    protected AbstractAptosFormsDemoMainFormEvent() {
    }

    protected AbstractAptosFormsDemoMainFormEvent(AptosFormsDemoMainFormEventId eventId) {
        this.aptosFormsDemoMainFormEventId = eventId;
    }


    public abstract String getEventClass();

    public static class AptosFormsDemoMainFormLobEvent extends  AbstractAptosFormsDemoMainFormEvent {

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
            return "AptosFormsDemoMainFormLobEvent";
        }

    }

    public static class AptosFormsDemoMainFormSubmitted extends AptosFormsDemoMainFormLobEvent {

        @Override
        public String getEventClass() {
            return "AptosFormsDemoMainFormSubmitted";
        }

    }


}

