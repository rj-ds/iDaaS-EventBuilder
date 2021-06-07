package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.CarePlanResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Contained {
    public String resourceType;
    public String id;
    public ClinicalStatus clinicalStatus;
    public VerificationStatus verificationStatus;
    public Code code;
    public Subject subject;

    public ClinicalStatus getClinicalStatus() { return clinicalStatus; }

    public void setClinicalStatus(ClinicalStatus clinicalStatus) { this.clinicalStatus = clinicalStatus; }

    public Code getCode() { return code; }

    public void setCode(Code code) { this.code = code; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getResourceType() { return resourceType; }

    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public Subject getSubject() { return subject; }

    public void setSubject(Subject subject) { this.subject = subject; }

    public VerificationStatus getVerificationStatus() { return verificationStatus; }

    public void setVerificationStatus(VerificationStatus verificationStatus) { this.verificationStatus = verificationStatus; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
