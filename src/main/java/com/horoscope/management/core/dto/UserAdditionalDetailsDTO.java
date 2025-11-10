package com.horoscope.management.core.dto;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class UserAdditionalDetailsDTO {

  private DateTime dateAndTimeOfBirthInUTC;

  private DateTime dateAndTimeOfBirthInUserTimeZone;

  private DateTime sunriseTimeInUserTimeZone;

  private DateTime sunsetTimeInUserTimeZone;

  private DateTimeZone userTimezone;

  public UserAdditionalDetailsDTO() {
  }

  public DateTime getDateAndTimeOfBirthInUTC() {
    return dateAndTimeOfBirthInUTC;
  }

  public void setDateAndTimeOfBirthInUTC(DateTime dateAndTimeOfBirthInUTC) {
    this.dateAndTimeOfBirthInUTC = dateAndTimeOfBirthInUTC;
  }

  public DateTime getDateAndTimeOfBirthInUserTimeZone() {
    return dateAndTimeOfBirthInUserTimeZone;
  }

  public void setDateAndTimeOfBirthInUserTimeZone(DateTime dateAndTimeOfBirthInUserTimeZone) {
    this.dateAndTimeOfBirthInUserTimeZone = dateAndTimeOfBirthInUserTimeZone;
  }

  public DateTime getSunriseTimeInUserTimeZone() {
    return sunriseTimeInUserTimeZone;
  }

  public void setSunriseTimeInUserTimeZone(DateTime sunriseTimeInUserTimeZone) {
    this.sunriseTimeInUserTimeZone = sunriseTimeInUserTimeZone;
  }

  public DateTime getSunsetTimeInUserTimeZone() {
    return sunsetTimeInUserTimeZone;
  }

  public void setSunsetTimeInUserTimeZone(DateTime sunsetTimeInUserTimeZone) {
    this.sunsetTimeInUserTimeZone = sunsetTimeInUserTimeZone;
  }

  public DateTimeZone getUserTimezone() {
    return userTimezone;
  }

  public void setUserTimezone(DateTimeZone userTimezone) {
    this.userTimezone = userTimezone;
  }

}
