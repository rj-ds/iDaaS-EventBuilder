package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ImmunizationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Performer {
    public Function function;
    public Actor actor;

    public Function getFunction() { return function; }

    public void setFunction(Function function) { this.function = function; }

    public Actor getActor() { return actor; }

    public void setActor(Actor actor) { this.actor = actor; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
