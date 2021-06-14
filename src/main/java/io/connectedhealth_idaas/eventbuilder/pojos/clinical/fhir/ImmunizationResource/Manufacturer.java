package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ImmunizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Manufacturer {
    public String reference;

    public String getReference() { return reference; }

    public void setReference(String reference) { this.reference = reference; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
