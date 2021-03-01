package io.connectedhealth_idaas.eventbuilder.parsers.clinical;

import io.connectedhealth_idaas.eventbuilder.events.platform.RoutingEvent;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntoleranceResource.AllergyIntolerence;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntoleranceResource.Note;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;
/*
 * Designed to support general parsing of FHIR messages
 *
 */
public class FHIRStreamParser {

    private static final Logger LOG = LoggerFactory.getLogger(FHIRStreamParser.class);

        public RoutingEvent buildRoutingEvent (String body){
            RoutingEvent routingEvent = new RoutingEvent();
            Gson gson = new Gson();
            AllergyIntolerence allergy = new AllergyIntolerence();
            UUID uuid = UUID.randomUUID();
            String uuidstr = uuid.toString();
            allergy = gson.fromJson(body, AllergyIntolerence.class);
            String messageTypeData = "AllergyIntolerence";
            String messageSendingDate = allergy.getRecordedDate();
            String messageSendingHour = allergy.getRecordedDate().substring(11, 13);
            String messageTime = allergy.getRecordedDate().substring(11, 19);
            System.out.println(allergy.getRecordedDate());
            System.out.println(messageSendingHour);
            String facilityId = allergy.getId();
            String resourceType = allergy.getResourceType();
            String messageEvent = allergy.getText().getStatus();
            List<Note> obj = allergy.getNote();
            String noteVal = obj.get(0).getText();
            routingEvent.setSendingApp(resourceType);
            routingEvent.setFacilityId(facilityId);
            routingEvent.setIndustryStd("FHIR");
            routingEvent.setMessageDateTime(messageSendingDate);
            routingEvent.setMessageDate(messageSendingDate);
            routingEvent.setMessageHour(messageSendingHour);
            routingEvent.setMessageTime(messageTime);
            routingEvent.setMessageType(resourceType);
            routingEvent.setMessageEvent(messageEvent);
            routingEvent.setMessageId(facilityId);
            routingEvent.setUniqueMessageId(uuidstr);
            routingEvent.setMessageVersion("V1");
            routingEvent.setMessageData(noteVal);

            return routingEvent;
        }

    }
