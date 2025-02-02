package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ImagingStudyRecource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Modality {
    public String system;
    public String code;

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getSystem() { return system; }

    public void setSystem(String system) { this.system = system; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
