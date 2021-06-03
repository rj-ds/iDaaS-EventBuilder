package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Payor {

    public Identifier identifier;

    public Identifier getIdentifier(){return identifier;}
    public void setIdentifier(Identifier identifier){this.identifier=identifier;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
