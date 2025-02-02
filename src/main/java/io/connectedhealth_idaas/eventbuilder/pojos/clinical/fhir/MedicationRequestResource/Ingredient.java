package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.MedicationRequestResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Ingredient {
    public ItemCodeableConcept itemCodeableConcept;
    public Strength strength;

    public ItemCodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

    public void setItemCodeableConcept(ItemCodeableConcept itemCodeableConcept) { this.itemCodeableConcept = itemCodeableConcept; }

    public Strength getStrength() { return strength; }

    public void setStrength(Strength strength) { this.strength = strength; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
