package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ProcedureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Identifier {
    public String value;

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
