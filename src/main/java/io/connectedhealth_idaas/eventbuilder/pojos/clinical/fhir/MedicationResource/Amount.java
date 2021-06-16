package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.MedicationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Amount {
    public Numerator numerator;
    public Denominator denominator;

    public Denominator getDenominator() { return denominator; }

    public void setDenominator(Denominator denominator) { this.denominator = denominator; }

    public Numerator getNumerator() { return numerator; }

    public void setNumerator(Numerator numerator) { this.numerator = numerator; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
