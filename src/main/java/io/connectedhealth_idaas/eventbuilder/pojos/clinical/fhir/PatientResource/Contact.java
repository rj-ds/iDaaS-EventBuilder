package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.PatientResource;

import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.OrganizationResource.Address;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.OrganizationResource.Name;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.OrganizationResource.Purpose;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.OrganizationResource.Telecom;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Contact {
    public List<Relationship> relationship;
    public Name name;
    public List<Telecom> telecom;
    public Address address;
    public String gender;
    public Period period;

    public List<Relationship> getRelationship(){return relationship;}
    public void setRelationship(List<Relationship> relationship){this.relationship=relationship;}

    public Period getPeriod(){return period;}
    public void setPeriod(Period period){this.period=period;}


    public Name getName(){return name;}
    public void setName(Name name){this.name=name;}

    public List<Telecom> getTelecom(){return telecom;}
    public void setTelecom(List<Telecom> telecom){this.telecom=telecom;}

    public Address getAddress(){return address;}
    public void setAddress(Address address){this.address=address;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender=gender;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
