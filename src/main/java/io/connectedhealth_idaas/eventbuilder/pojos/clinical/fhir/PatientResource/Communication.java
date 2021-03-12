package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.PatientResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Communication {

    public Language language;
    public boolean preferred;

    public Language getLanguage(){return language;}
    public void setLanguage(Language language){this.language=language;}

    public boolean isPreferred(){return preferred;}
    public void setPreferred(boolean preferred){this.preferred=preferred;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
