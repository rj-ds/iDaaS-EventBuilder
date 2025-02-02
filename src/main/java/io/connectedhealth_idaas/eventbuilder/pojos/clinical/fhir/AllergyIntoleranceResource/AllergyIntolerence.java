package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntoleranceResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


import java.util.Date;
import java.util.List;

public class AllergyIntolerence {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public ClinicalStatus clinicalStatus;
    public VerificationStatus verificationStatus;
    public String type;
    public List<String> category;
    public String criticality;
    public Code code;
    public Patient patient;
    public String onsetDateTime;
    public String recordedDate;
    public Recorder recorder;
    public Asserter asserter;
    public String lastOccurrence;
    public List<Note> note;
    public List<Reaction> reaction;
    public Meta meta;

    public String getResourceType() {return resourceType;}
    public void setResourceType(String resourceType) { this.resourceType=resourceType;}

    public String getId() {return id;}
    public void setId(String id) { this.id=id;}

    public Text getText() {return text;}
    public void setText(Text text){this.text=text;}

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    public ClinicalStatus getClinicalStatus() {return clinicalStatus;}
    public void setClinicalStatus(ClinicalStatus clinicalStatus){this.clinicalStatus=clinicalStatus;}


    public VerificationStatus getVerificationStatus() {return verificationStatus;}
    public void setVerificationStatus(VerificationStatus verificationStatus){this.verificationStatus=verificationStatus;}

    public String getType() {return type;}
    public void setType(String type) { this.type=type;}

    public List<String> getCategory() {return category;}
    public void setCategory(List<String> category) { this.category=category;}

    public String getCriticality() {return criticality;}
    public void setCriticality(String criticality) { this.criticality=criticality;}

    public Code getCode() {return code;}
    public void setCode(Code code){this.code=code;}

    public Patient getPatient() {return patient;}
    public void setPatient(Patient patient){this.patient=patient;}

    public String getOnsetDateTime() {return onsetDateTime;}
    public void setOnsetDateTime(String onsetDateTime) { this.onsetDateTime=onsetDateTime;}

    public String getRecordedDate() {return recordedDate;}
    public void setRecordedDate(String recordedDate) { this.recordedDate=recordedDate;}

    public Recorder getRecorder() {return recorder;}
    public void setRecorder(Recorder recorder){this.recorder=recorder;}

    public Asserter getAsserter() {return asserter;}
    public void setAsserter(Asserter asserter){this.asserter=asserter;}


    public String getLastOccurrence() {return lastOccurrence;}
    public void setLastOccurrence(String lastOccurrence) { this.lastOccurrence=lastOccurrence;}


    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }


    public List<Reaction> getReaction() {
        return reaction;
    }

    public void setReaction(List<Reaction> reaction) {
        this.reaction = reaction;
    }

    public Meta getMeta() {return meta;}
    public void setMeta(Meta meta){this.meta=meta;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
