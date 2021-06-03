package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Reference {

    public String value;

    public String getValue(){return value;}
    public void setValue(String value){this.value=value;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
