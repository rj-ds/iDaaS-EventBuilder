package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ClinicalImpressionResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Finding {
    public ItemCodeableConcept itemCodeableConcept;

    public ItemCodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

    public void setItemCodeableConcept(ItemCodeableConcept itemCodeableConcept) { this.itemCodeableConcept = itemCodeableConcept; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
