package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.MedicationAdministrationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;

public class EffectivePeriod {
    public Date start;
    public Date end;

    public Date getStart() { return start; }

    public void setStart(Date start) { this.start = start; }

    public Date getEnd() { return end; }

    public void setEnd(Date end) { this.end = end; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
