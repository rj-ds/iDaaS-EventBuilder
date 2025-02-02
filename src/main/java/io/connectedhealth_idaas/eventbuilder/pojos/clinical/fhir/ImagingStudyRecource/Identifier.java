package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ImagingStudyRecource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Identifier {
    public String value;
    public String system;
    public Type type;
    public Assigner assigner;
    public String use;

    public Assigner getAssigner() { return assigner; }

    public void setAssigner(Assigner assigner) { this.assigner = assigner; }

    public String getUse() { return use; }

    public void setUse(String use) { this.use = use; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String getSystem() { return system; }

    public void setSystem(String system) { this.system = system; }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
