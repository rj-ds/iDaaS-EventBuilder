package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ObservationResource;

import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.PatientResource.Family;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.PatientResource.Period;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Name {

    public String family;
    public List<String> given;


    public String getFamily(){return family;}
    public void setFamily(String family){this.family=family;}

    public List<String> getGiven(){return given;}
    public void setGiven(List<String> given){this.given=given;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
