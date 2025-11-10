package com.horoscope.management.core;

import org.joda.time.DateTime;
import com.astro.model.db.converter.JodaDateTimeConverter;


public class EventsDTO {

  private String eventName;

  private DateTime startingTime;

  private DateTime endingTime;

  private String eventType;

  private String description;

  public EventsDTO() {
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  
  public DateTime getStartingTime() {
    return startingTime;
  }

  public void setStartingTime(DateTime startingTime) {
    this.startingTime = startingTime;
  }

  
  public DateTime getEndingTime() {
    return endingTime;
  }

  public void setEndingTime(DateTime endingTime) {
    this.endingTime = endingTime;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
