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

public abstract class AbstractAptosFormsDemoMainFormAggregate extends AbstractAggregate implements AptosFormsDemoMainFormAggregate {
    private AptosFormsDemoMainFormState.MutableAptosFormsDemoMainFormState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAptosFormsDemoMainFormAggregate(AptosFormsDemoMainFormState state) {
        this.state = (AptosFormsDemoMainFormState.MutableAptosFormsDemoMainFormState)state;
    }

    public AptosFormsDemoMainFormState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void throwOnInvalidStateTransition(Command c) {
        AptosFormsDemoMainFormCommand.throwOnInvalidStateTransition(this.state, c);
    }

    protected void apply(Event e) {
        onApplying(e);
        //state.mutate(e);
        changes.add(e);
    }


    ////////////////////////

    public static class SimpleAptosFormsDemoMainFormAggregate extends AbstractAptosFormsDemoMainFormAggregate {
        public SimpleAptosFormsDemoMainFormAggregate(AptosFormsDemoMainFormState state) {
            super(state);
        }

        @Override
        public void submit(BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, DateRange fr_d8rw, DateRange fr_dy3l, BigInteger fr_6f68, TimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoMainFormCommands.Submit c) {
            try {
                verifySubmit(fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_d8rw, fr_dy3l, fr_6f68, fr_47yy, fr_gh3o, fr_fbba, fr_hhzp, single_text1, c);
            } catch (Exception ex) {
                throw new DomainError("VerificationFailed", ex);
            }

            Event e = newAptosFormsDemoMainFormSubmitted(fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_d8rw, fr_dy3l, fr_6f68, fr_47yy, fr_gh3o, fr_fbba, fr_hhzp, single_text1, offChainVersion, commandId, requesterId);
            apply(e);
        }

        @Override
        public void update(BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, DateRange fr_d8rw, DateRange fr_dy3l, BigInteger fr_6f68, TimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoMainFormCommands.Update c) {
            try {
                verifyUpdate(fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_d8rw, fr_dy3l, fr_6f68, fr_47yy, fr_gh3o, fr_fbba, fr_hhzp, single_text1, c);
            } catch (Exception ex) {
                throw new DomainError("VerificationFailed", ex);
            }

            Event e = newAptosFormsDemoMainFormUpdated(fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_d8rw, fr_dy3l, fr_6f68, fr_47yy, fr_gh3o, fr_fbba, fr_hhzp, single_text1, offChainVersion, commandId, requesterId);
            apply(e);
        }

        protected void verifySubmit(BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, DateRange fr_d8rw, DateRange fr_dy3l, BigInteger fr_6f68, TimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, AptosFormsDemoMainFormCommands.Submit c) {
            BigInteger Fr_5pqi = fr_5pqi;
            String[] Fr_duif = fr_duif;
            String[] Fr_6i34 = fr_6i34;
            String Fr_8xjs = fr_8xjs;
            String Fr_9c3f = fr_9c3f;
            BigInteger Fr_4ok6 = fr_4ok6;
            String Fr_b3ub = fr_b3ub;
            BigInteger Fr_1z7o = fr_1z7o;
            DateRange Fr_d8rw = fr_d8rw;
            DateRange Fr_dy3l = fr_dy3l;
            BigInteger Fr_6f68 = fr_6f68;
            TimeRange Fr_47yy = fr_47yy;
            String[] Fr_gh3o = fr_gh3o;
            String[] Fr_fbba = fr_fbba;
            XRenderFormDate Fr_hhzp = fr_hhzp;
            String Single_text1 = single_text1;

            ReflectUtils.invokeStaticMethod(
                    "org.test.aptosformsdemo.domain.aptosformsdemomainform.SubmitLogic",
                    "verify",
                    new Class[]{AptosFormsDemoMainFormState.class, BigInteger.class, String[].class, String[].class, String.class, String.class, BigInteger.class, String.class, BigInteger.class, DateRange.class, DateRange.class, BigInteger.class, TimeRange.class, String[].class, String[].class, XRenderFormDate.class, String.class, VerificationContext.class},
                    new Object[]{getState(), fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_d8rw, fr_dy3l, fr_6f68, fr_47yy, fr_gh3o, fr_fbba, fr_hhzp, single_text1, VerificationContext.forCommand(c)}
            );

//package org.test.aptosformsdemo.domain.aptosformsdemomainform;
//
//public class SubmitLogic {
//    public static void verify(AptosFormsDemoMainFormState aptosFormsDemoMainFormState, BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, DateRange fr_d8rw, DateRange fr_dy3l, BigInteger fr_6f68, TimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, VerificationContext verificationContext) {
//    }
//}

        }
           

        protected void verifyUpdate(BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, DateRange fr_d8rw, DateRange fr_dy3l, BigInteger fr_6f68, TimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, AptosFormsDemoMainFormCommands.Update c) {
            BigInteger Fr_5pqi = fr_5pqi;
            String[] Fr_duif = fr_duif;
            String[] Fr_6i34 = fr_6i34;
            String Fr_8xjs = fr_8xjs;
            String Fr_9c3f = fr_9c3f;
            BigInteger Fr_4ok6 = fr_4ok6;
            String Fr_b3ub = fr_b3ub;
            BigInteger Fr_1z7o = fr_1z7o;
            DateRange Fr_d8rw = fr_d8rw;
            DateRange Fr_dy3l = fr_dy3l;
            BigInteger Fr_6f68 = fr_6f68;
            TimeRange Fr_47yy = fr_47yy;
            String[] Fr_gh3o = fr_gh3o;
            String[] Fr_fbba = fr_fbba;
            XRenderFormDate Fr_hhzp = fr_hhzp;
            String Single_text1 = single_text1;

            ReflectUtils.invokeStaticMethod(
                    "org.test.aptosformsdemo.domain.aptosformsdemomainform.UpdateLogic",
                    "verify",
                    new Class[]{AptosFormsDemoMainFormState.class, BigInteger.class, String[].class, String[].class, String.class, String.class, BigInteger.class, String.class, BigInteger.class, DateRange.class, DateRange.class, BigInteger.class, TimeRange.class, String[].class, String[].class, XRenderFormDate.class, String.class, VerificationContext.class},
                    new Object[]{getState(), fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_d8rw, fr_dy3l, fr_6f68, fr_47yy, fr_gh3o, fr_fbba, fr_hhzp, single_text1, VerificationContext.forCommand(c)}
            );

//package org.test.aptosformsdemo.domain.aptosformsdemomainform;
//
//public class UpdateLogic {
//    public static void verify(AptosFormsDemoMainFormState aptosFormsDemoMainFormState, BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, DateRange fr_d8rw, DateRange fr_dy3l, BigInteger fr_6f68, TimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, VerificationContext verificationContext) {
//    }
//}

        }
           

        protected AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted newAptosFormsDemoMainFormSubmitted(BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, DateRange fr_d8rw, DateRange fr_dy3l, BigInteger fr_6f68, TimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, Long offChainVersion, String commandId, String requesterId) {
            AptosFormsDemoMainFormEventId eventId = new AptosFormsDemoMainFormEventId(getState().getSignerAddress(), null);
            AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted e = new AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted();

            e.setAptosEventVersion(null); // todo Need to update 'verify' method to return event properties.
            e.setAptosEventSequenceNumber(null); // todo Need to update 'verify' method to return event properties.
            e.setAptosEventType(null); // todo Need to update 'verify' method to return event properties.
            e.setAptosEventGuid(null); // todo Need to update 'verify' method to return event properties.
            e.setStatus(null); // todo Need to update 'verify' method to return event properties.

            e.setCommandId(commandId);
            e.setCreatedBy(requesterId);
            e.setCreatedAt((OffsetDateTime)ApplicationContext.current.getTimestampService().now(OffsetDateTime.class));

            e.setAptosFormsDemoMainFormEventId(eventId);
            return e;
        }

        protected AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated newAptosFormsDemoMainFormUpdated(BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, DateRange fr_d8rw, DateRange fr_dy3l, BigInteger fr_6f68, TimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, Long offChainVersion, String commandId, String requesterId) {
            AptosFormsDemoMainFormEventId eventId = new AptosFormsDemoMainFormEventId(getState().getSignerAddress(), null);
            AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated e = new AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated();

            e.setAptosEventVersion(null); // todo Need to update 'verify' method to return event properties.
            e.setAptosEventSequenceNumber(null); // todo Need to update 'verify' method to return event properties.
            e.setAptosEventType(null); // todo Need to update 'verify' method to return event properties.
            e.setAptosEventGuid(null); // todo Need to update 'verify' method to return event properties.
            e.setStatus(null); // todo Need to update 'verify' method to return event properties.

            e.setCommandId(commandId);
            e.setCreatedBy(requesterId);
            e.setCreatedAt((OffsetDateTime)ApplicationContext.current.getTimestampService().now(OffsetDateTime.class));

            e.setAptosFormsDemoMainFormEventId(eventId);
            return e;
        }

    }

}

