package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ConditionResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Stage {
    public Summary summary;
    public List<Assessment> assessment;

    public List<Assessment> getAssessment() { return assessment; }

    public void setAssessment(List<Assessment> assessment) { this.assessment = assessment; }

    public Summary getSummary() { return summary; }

    public void setSummary(Summary summary) { this.summary = summary; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}
