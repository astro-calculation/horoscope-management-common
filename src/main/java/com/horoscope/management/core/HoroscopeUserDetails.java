package com.horoscope.management.core;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import com.horoscope.management.common.Latitude;
import com.horoscope.management.common.Longitude;

/**
 * 
 * All dateTimes are in Users' based on users input timezone
 * 
 * @author unnikrishnanpurushothamannair
 *
 */
public class HoroscopeUserDetails {

  private String firstName;

  private String lastName;

  private String gender;

  private DateTime birthDateTimeInUserTimezone;
  
  private DateTime birthDateTimeUTCTimezone;

  private DateTimeZone birthTimezone;
  
  private boolean isActualBirthTimeAvailable;

  private Latitude latitude;

  private Longitude longitude;

  private double ayanamsha;

  private DateTime sunrise;

  private DateTime sunset;
  
  private String birthPlace;
  
  private String stateOfBirth;

  private String countryOfBirth;

  private String primaryProfession;

  private String secondaryProfession;

  private String additionalProfessionDetails;

  private int netWorth;

  private String marriageDate;

  private int noOfBrothers;

  private int noOfSisters;

  private int noOfSpouses;

  private int noOfSons;

  private int noOfDaughters;

  private String additionalDetails;

  private String importantEvents;

  private String dateOfDeath;

  public HoroscopeUserDetails() {}

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public DateTime getBirthDateTimeInUserTimezone() {
    return birthDateTimeInUserTimezone;
  }

  public void setBirthDateTimeInUserTimezone(DateTime birthDateTimeInUserTimezone) {
    this.birthDateTimeInUserTimezone = birthDateTimeInUserTimezone;
  }

  public DateTime getBirthDateTimeUTCTimezone() {
    return birthDateTimeUTCTimezone;
  }

  public void setBirthDateTimeUTCTimezone(DateTime birthDateTimeUTCTimezone) {
    this.birthDateTimeUTCTimezone = birthDateTimeUTCTimezone;
  }

  public DateTimeZone getBirthTimezone() {
    return birthTimezone;
  }

  public void setBirthTimezone(DateTimeZone birthTimezone) {
    this.birthTimezone = birthTimezone;
  }

  public boolean isActualBirthTimeAvailable() {
    return isActualBirthTimeAvailable;
  }

  public void setActualBirthTimeAvailable(boolean isActualBirthTimeAvailable) {
    this.isActualBirthTimeAvailable = isActualBirthTimeAvailable;
  }

  public Latitude getLatitude() {
    return latitude;
  }

  public void setLatitude(Latitude latitude) {
    this.latitude = latitude;
  }

  public Longitude getLongitude() {
    return longitude;
  }

  public void setLongitude(Longitude longitude) {
    this.longitude = longitude;
  }

  public double getAyanamsha() {
    return ayanamsha;
  }

  public void setAyanamsha(double ayanamsha) {
    this.ayanamsha = ayanamsha;
  }

  public DateTime getSunrise() {
    return sunrise;
  }

  public void setSunrise(DateTime sunrise) {
    this.sunrise = sunrise;
  }

  public DateTime getSunset() {
    return sunset;
  }

  public void setSunset(DateTime sunset) {
    this.sunset = sunset;
  }

  
  public String getBirthPlace() {
    return birthPlace;
  }

  
  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  
  public String getStateOfBirth() {
    return stateOfBirth;
  }

  
  public void setStateOfBirth(String stateOfBirth) {
    this.stateOfBirth = stateOfBirth;
  }

  public String getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public String getPrimaryProfession() {
    return primaryProfession;
  }

  public void setPrimaryProfession(String primaryProfession) {
    this.primaryProfession = primaryProfession;
  }

  public String getSecondaryProfession() {
    return secondaryProfession;
  }

  public void setSecondaryProfession(String secondaryProfession) {
    this.secondaryProfession = secondaryProfession;
  }

  public String getAdditionalProfessionDetails() {
    return additionalProfessionDetails;
  }

  public void setAdditionalProfessionDetails(String additionalProfessionDetails) {
    this.additionalProfessionDetails = additionalProfessionDetails;
  }

  public int getNetWorth() {
    return netWorth;
  }

  public void setNetWorth(int netWorth) {
    this.netWorth = netWorth;
  }

  public String getMarriageDate() {
    return marriageDate;
  }

  public void setMarriageDate(String marriageDate) {
    this.marriageDate = marriageDate;
  }

  public int getNoOfBrothers() {
    return noOfBrothers;
  }

  public void setNoOfBrothers(int noOfBrothers) {
    this.noOfBrothers = noOfBrothers;
  }

  public int getNoOfSisters() {
    return noOfSisters;
  }

  public void setNoOfSisters(int noOfSisters) {
    this.noOfSisters = noOfSisters;
  }

  public int getNoOfSpouses() {
    return noOfSpouses;
  }

  public void setNoOfSpouses(int noOfSpouses) {
    this.noOfSpouses = noOfSpouses;
  }

  public int getNoOfSons() {
    return noOfSons;
  }

  public void setNoOfSons(int noOfSons) {
    this.noOfSons = noOfSons;
  }

  public int getNoOfDaughters() {
    return noOfDaughters;
  }

  public void setNoOfDaughters(int noOfDaughters) {
    this.noOfDaughters = noOfDaughters;
  }

  public String getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(String additionalDetails) {
    this.additionalDetails = additionalDetails;
  }

  public String getImportantEvents() {
    return importantEvents;
  }

  public void setImportantEvents(String importantEvents) {
    this.importantEvents = importantEvents;
  }

  public String getDateOfDeath() {
    return dateOfDeath;
  }

  public void setDateOfDeath(String dateOfDeath) {
    this.dateOfDeath = dateOfDeath;
  }

}
