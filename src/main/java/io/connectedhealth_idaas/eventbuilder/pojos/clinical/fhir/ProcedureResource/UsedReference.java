package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ProcedureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class UsedReference {
    public String display;

    public String getDisplay() { return display; }

    public void setDisplay(String display) { this.display = display; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
