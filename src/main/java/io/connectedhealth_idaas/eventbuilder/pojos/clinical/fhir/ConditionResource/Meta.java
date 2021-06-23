package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ConditionResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Meta {
    public List<Security> security;

    public List<Security> getSecurity() { return security; }

    public void setSecurity(List<Security> security) { this.security = security; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }

}
