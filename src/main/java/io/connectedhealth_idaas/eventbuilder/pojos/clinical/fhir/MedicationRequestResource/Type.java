package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.MedicationRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Type {
    public List<Coding> coding;
    public String system;
    public String code;
    public String display;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public List<Coding> getCoding() { return coding; }

    public void setCoding(List<Coding> coding) { this.coding = coding; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
