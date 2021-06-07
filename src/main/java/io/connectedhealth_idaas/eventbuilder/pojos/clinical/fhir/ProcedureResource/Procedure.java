package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ProcedureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Procedure {
    public String resourceType;
    public String id;
    public Text text;
    public String status;
    public Code code;
    public Subject subject;
    public String performedDateTime;
    public Recorder recorder;
    public Asserter asserter;
    public List<Performer> performer;
    public List<ReasonCode> reasonCode;
    public List<FollowUp> followUp;
    public List<Note> note;

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Text getText() {return text;}
    public void setText(Text text){this.text=text;}

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Code getCode() { return code; }
    public void setCode(Code code) { this.code = code; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getPerformedDateTime() { return performedDateTime; }
    public void setPerformedDateTime(String performedDateTime) { this.performedDateTime = performedDateTime; }

    public Recorder getRecorder() { return recorder; }
    public void setRecorder(Recorder recorder) { this.recorder = recorder; }

    public Asserter getAsserter() { return asserter; }
    public void setAsserter(Asserter asserter) { this.asserter = asserter; }

    public List<Performer> getPerformer() { return performer; }
    public void setPerformer(List<Performer> performer) { this.performer = performer; }

    public List<ReasonCode> getReasonCode() { return reasonCode; }
    public void setReasonCode(List<ReasonCode> reasonCode) { this.reasonCode = reasonCode; }

    public List<FollowUp> getFollowUp() { return followUp; }
    public void setFollowUp(List<FollowUp> followUp) { this.followUp = followUp; }

    public List<Note> getNote() { return note; }
    public void setNote(List<Note> note) { this.note = note; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
