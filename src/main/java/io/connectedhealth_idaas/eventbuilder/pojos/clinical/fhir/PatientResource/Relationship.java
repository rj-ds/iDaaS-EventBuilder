package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.PatientResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.checkerframework.checker.units.qual.C;

import java.util.List;

public class Relationship {

    public List<Coding> coding;

    public List<Coding> getCoding(){return coding;}
    public void setCoding(List<Coding> coding){this.coding=coding;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
