package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.PatientResource;

import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.OrganizationResource.Coding;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Type {
    public List<io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.OrganizationResource.Coding> coding;

    public List<io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.OrganizationResource.Coding> getCoding(){return coding;}
    public void setCoding( List<Coding> coding) {this.coding=coding;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
