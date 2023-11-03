// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform;

import java.util.*;
import java.math.*;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.AptosFormsDemoMainFormEvent.*;

public abstract class AbstractAptosFormsDemoMainFormState implements AptosFormsDemoMainFormState.SqlAptosFormsDemoMainFormState {

    private String signerAddress;

    public String getSignerAddress() {
        return this.signerAddress;
    }

    public void setSignerAddress(String signerAddress) {
        this.signerAddress = signerAddress;
    }

    private Map<String, Object> dynamicProperties = new HashMap<>();

    public Map<String, Object> getDynamicProperties() {
        return this.dynamicProperties;
    }

    public void setDynamicProperties(Map<String, Object> dynamicProperties) {
        this.dynamicProperties = dynamicProperties;
    }

    private BigInteger version;

    public BigInteger getVersion() {
        return this.version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    private Long offChainVersion;

    public Long getOffChainVersion() {
        return this.offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion) {
        this.offChainVersion = offChainVersion;
    }

    private String createdBy;

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private String updatedBy;

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    private Boolean active;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    private Boolean deleted;

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isStateUnsaved() {
        return this.getOffChainVersion() == null;
    }

    private Boolean stateReadOnly;

    public Boolean getStateReadOnly() { return this.stateReadOnly; }

    public void setStateReadOnly(Boolean readOnly) { this.stateReadOnly = readOnly; }

    private boolean forReapplying;

    public boolean getForReapplying() {
        return forReapplying;
    }

    public void setForReapplying(boolean forReapplying) {
        this.forReapplying = forReapplying;
    }

    public AbstractAptosFormsDemoMainFormState(List<Event> events) {
        initializeForReapplying();
        if (events != null && events.size() > 0) {
            this.setSignerAddress(((AptosFormsDemoMainFormEvent.SqlAptosFormsDemoMainFormEvent) events.get(0)).getAptosFormsDemoMainFormEventId().getSignerAddress());
            for (Event e : events) {
                //mutate(e);
                this.setOffChainVersion((this.getOffChainVersion() == null ? AptosFormsDemoMainFormState.VERSION_NULL : this.getOffChainVersion()) + 1);
            }
        }
    }


    public AbstractAptosFormsDemoMainFormState() {
        initializeProperties();
    }

    protected void initializeForReapplying() {
        this.forReapplying = true;

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }

    @Override
    public int hashCode() {
        return getSignerAddress().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj instanceof AptosFormsDemoMainFormState) {
            return Objects.equals(this.getSignerAddress(), ((AptosFormsDemoMainFormState)obj).getSignerAddress());
        }
        return false;
    }


//    public void mutate(Event e) {
//        setStateReadOnly(false);
//        if (false) {
//            ;
//        } else if (e instanceof AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted) {
//            when((AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted)e);
//        } else {
//            throw new UnsupportedOperationException(String.format("Unsupported event type: %1$s", e.getClass().getName()));
//        }
//    }

    protected void merge(AptosFormsDemoMainFormState s) {
        if (s == this) {
            return;
        }
        this.setDynamicProperties(s.getDynamicProperties());
        this.setVersion(s.getVersion());
        this.setActive(s.getActive());
    }
//
//    public void when(AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted e) {
//        throwOnWrongEvent(e);
//
//        BigInteger fr_5pqi = e.getFr_5pqi();
//        BigInteger Fr_5pqi = fr_5pqi;
//        String[] fr_duif = e.getFr_duif();
//        String[] Fr_duif = fr_duif;
//        String[] fr_6i34 = e.getFr_6i34();
//        String[] Fr_6i34 = fr_6i34;
//        String fr_8xjs = e.getFr_8xjs();
//        String Fr_8xjs = fr_8xjs;
//        String fr_9c3f = e.getFr_9c3f();
//        String Fr_9c3f = fr_9c3f;
//        BigInteger fr_4ok6 = e.getFr_4ok6();
//        BigInteger Fr_4ok6 = fr_4ok6;
//        String fr_b3ub = e.getFr_b3ub();
//        String Fr_b3ub = fr_b3ub;
//        BigInteger fr_1z7o = e.getFr_1z7o();
//        BigInteger Fr_1z7o = fr_1z7o;
//        DateRange fr_d8rw = e.getFr_d8rw();
//        DateRange Fr_d8rw = fr_d8rw;
//        DateRange fr_dy3l = e.getFr_dy3l();
//        DateRange Fr_dy3l = fr_dy3l;
//        BigInteger fr_6f68 = e.getFr_6f68();
//        BigInteger Fr_6f68 = fr_6f68;
//        TimeRange fr_47yy = e.getFr_47yy();
//        TimeRange Fr_47yy = fr_47yy;
//        String[] fr_gh3o = e.getFr_gh3o();
//        String[] Fr_gh3o = fr_gh3o;
//        String[] fr_fbba = e.getFr_fbba();
//        String[] Fr_fbba = fr_fbba;
//        XRenderFormDate fr_hhzp = e.getFr_hhzp();
//        XRenderFormDate Fr_hhzp = fr_hhzp;
//        String single_text1 = e.getSingle_text1();
//        String Single_text1 = single_text1;
//        BigInteger aptosEventVersion = e.getAptosEventVersion();
//        BigInteger AptosEventVersion = aptosEventVersion;
//        BigInteger aptosEventSequenceNumber = e.getAptosEventSequenceNumber();
//        BigInteger AptosEventSequenceNumber = aptosEventSequenceNumber;
//        String aptosEventType = e.getAptosEventType();
//        String AptosEventType = aptosEventType;
//        AptosEventGuid aptosEventGuid = e.getAptosEventGuid();
//        AptosEventGuid AptosEventGuid = aptosEventGuid;
//        String status = e.getStatus();
//        String Status = status;
//
//        if (this.getCreatedBy() == null){
//            this.setCreatedBy(e.getCreatedBy());
//        }
//        if (this.getCreatedAt() == null){
//            this.setCreatedAt(e.getCreatedAt());
//        }
//        this.setUpdatedBy(e.getCreatedBy());
//        this.setUpdatedAt(e.getCreatedAt());
//
//        AptosFormsDemoMainFormState updatedAptosFormsDemoMainFormState = (AptosFormsDemoMainFormState) ReflectUtils.invokeStaticMethod(
//                    "org.test.aptosformsdemo.domain.aptosformsdemomainform.SubmitLogic",
//                    "mutate",
//                    new Class[]{AptosFormsDemoMainFormState.class, BigInteger.class, String[].class, String[].class, String.class, String.class, BigInteger.class, String.class, BigInteger.class, DateRange.class, DateRange.class, BigInteger.class, TimeRange.class, String[].class, String[].class, XRenderFormDate.class, String.class, BigInteger.class, BigInteger.class, String.class, AptosEventGuid.class, String.class, MutationContext.class},
//                    new Object[]{this, fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_d8rw, fr_dy3l, fr_6f68, fr_47yy, fr_gh3o, fr_fbba, fr_hhzp, single_text1, aptosEventVersion, aptosEventSequenceNumber, aptosEventType, aptosEventGuid, status, MutationContext.forEvent(e, s -> {if (s == this) {return this;} else {throw new UnsupportedOperationException();}})}
//            );
//
////package org.test.aptosformsdemo.domain.aptosformsdemomainform;
////
////public class SubmitLogic {
////    public static AptosFormsDemoMainFormState mutate(AptosFormsDemoMainFormState aptosFormsDemoMainFormState, BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, DateRange fr_d8rw, DateRange fr_dy3l, BigInteger fr_6f68, TimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, BigInteger aptosEventVersion, BigInteger aptosEventSequenceNumber, String aptosEventType, AptosEventGuid aptosEventGuid, String status, MutationContext<AptosFormsDemoMainFormState, AptosFormsDemoMainFormState.MutableAptosFormsDemoMainFormState> mutationContext) {
////    }
////}
//
//        if (this != updatedAptosFormsDemoMainFormState) { merge(updatedAptosFormsDemoMainFormState); } //else do nothing
//
//    }

    public void save() {
    }

    protected void throwOnWrongEvent(AptosFormsDemoMainFormEvent event) {
        String stateEntityId = this.getSignerAddress(); // Aggregate Id
        String eventEntityId = ((AptosFormsDemoMainFormEvent.SqlAptosFormsDemoMainFormEvent)event).getAptosFormsDemoMainFormEventId().getSignerAddress(); // EntityBase.Aggregate.GetEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId)) {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }


        Long stateVersion = this.getOffChainVersion();

    }


    public static class SimpleAptosFormsDemoMainFormState extends AbstractAptosFormsDemoMainFormState {

        public SimpleAptosFormsDemoMainFormState() {
        }

        public SimpleAptosFormsDemoMainFormState(List<Event> events) {
            super(events);
        }

        public static SimpleAptosFormsDemoMainFormState newForReapplying() {
            SimpleAptosFormsDemoMainFormState s = new SimpleAptosFormsDemoMainFormState();
            s.initializeForReapplying();
            return s;
        }

    }



}

