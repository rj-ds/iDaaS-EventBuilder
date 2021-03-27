package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ObservationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Meta {


    public List<String> profile;


    public List<String> getProfile(){return profile;}
    public void setProfile(List<String> profile){this.profile=profile;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
