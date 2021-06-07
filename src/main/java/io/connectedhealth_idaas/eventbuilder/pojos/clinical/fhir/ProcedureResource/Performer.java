package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ProcedureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Performer {
    public Actor actor;

    public Actor getActor() { return actor; }

    public void setActor(Actor actor) { this.actor = actor; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
