package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ObservationResource;

import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.PatientResource.Extension;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class BirthDate {


    public List<Extension> extension;

    public List<Extension> getExtension(){return extension;}
    public void setExtension(List<Extension> extension){this.extension=extension;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
