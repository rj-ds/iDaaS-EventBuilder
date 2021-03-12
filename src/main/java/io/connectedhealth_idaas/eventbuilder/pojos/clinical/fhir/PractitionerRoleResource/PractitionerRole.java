package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.PractitionerRoleResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class PractitionerRole {
    public String resourceType;
    public String id;
    public String type;
    public List<Entry> entry;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}
    public String getId(){return id;}
    public void setId(String id){this.id=id;}
    public String getType(){return type;}
    public void setType(String type){this.type=type;}
    public List<Entry> getEntry(){return entry;}
    public void setEntry(List<Entry> entry){this.entry=entry;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
