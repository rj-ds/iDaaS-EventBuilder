package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Period {

    public String start;
    public String end;

    public void setStart(String start) { this.start = start; }

    public String getStart() { return start; }

    public String getEnd() { return end; }

    public void setEnd(String end) { this.end = end; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
