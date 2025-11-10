package com.horoscope.management.core.dto;

import java.sql.Date;

import com.horoscope.management.common.Latitude;
import com.horoscope.management.common.Longitude;

public class UserDataDTO {

  private String firstName;

  private String lastName;

  private String gender;

  private String dateOfBirth;

  private String birthTimeActual;

  private String birthTimeCalculated;

  private boolean actualBirthTimeAvailable;

  private String birthPlace;

  private Latitude latitude;

  private Longitude longitude;

  private String timezone;

  private String countryOfBirth;

  private boolean stayedOutsideCountryOfBirth;

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

  private boolean wealthEarnedFromParents;

  private int noOfHousesOwnedByNative;

  private int noOfVehiclesOwnedByNative;

  private boolean singer;

  private boolean dancer;

  private boolean havingExtraMaritalRelationship;

  private boolean spiritual;

  private boolean politicallyInclined;

  private boolean famous;

  private boolean notorious;

  private boolean fradulentCasesAgainstNative;

  private boolean killer;

  private boolean imprisoned;

  private boolean metWithMajorAccident;

  private boolean athleticPerson;

  private boolean primeMinister;

  private boolean memberOfLegislativeAssembly;

  private boolean indianAdministrativeService;

  private boolean memberOfPartliament;

  private String dateOfDeath;

  private UserAdditionalDetailsDTO userAdditionalDetails;

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

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getBirthTimeActual() {
    return birthTimeActual;
  }

  public void setBirthTimeActual(String birthTimeActual) {
    this.birthTimeActual = birthTimeActual;
  }

  public String getBirthTimeCalculated() {
    return birthTimeCalculated;
  }

  public void setBirthTimeCalculated(String birthTimeCalculated) {
    this.birthTimeCalculated = birthTimeCalculated;
  }

  public boolean isActualBirthTimeAvailable() {
    return actualBirthTimeAvailable;
  }

  public void setActualBirthTimeAvailable(boolean actualBirthTimeAvailable) {
    this.actualBirthTimeAvailable = actualBirthTimeAvailable;
  }

  public String getBirthPlace() {
    return birthPlace;
  }

  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
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

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public String getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public boolean isStayedOutsideCountryOfBirth() {
    return stayedOutsideCountryOfBirth;
  }

  public void setStayedOutsideCountryOfBirth(boolean stayedOutsideCountryOfBirth) {
    this.stayedOutsideCountryOfBirth = stayedOutsideCountryOfBirth;
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

  public boolean isWealthEarnedFromParents() {
    return wealthEarnedFromParents;
  }

  public void setWealthEarnedFromParents(boolean wealthEarnedFromParents) {
    this.wealthEarnedFromParents = wealthEarnedFromParents;
  }

  public int getNoOfHousesOwnedByNative() {
    return noOfHousesOwnedByNative;
  }

  public void setNoOfHousesOwnedByNative(int noOfHousesOwnedByNative) {
    this.noOfHousesOwnedByNative = noOfHousesOwnedByNative;
  }

  public int getNoOfVehiclesOwnedByNative() {
    return noOfVehiclesOwnedByNative;
  }

  public void setNoOfVehiclesOwnedByNative(int noOfVehiclesOwnedByNative) {
    this.noOfVehiclesOwnedByNative = noOfVehiclesOwnedByNative;
  }

  public boolean isSinger() {
    return singer;
  }

  public void setSinger(boolean singer) {
    this.singer = singer;
  }

  public boolean isDancer() {
    return dancer;
  }

  public void setDancer(boolean dancer) {
    this.dancer = dancer;
  }

  public boolean isHavingExtraMaritalRelationship() {
    return havingExtraMaritalRelationship;
  }

  public void setHavingExtraMaritalRelationship(boolean havingExtraMaritalRelationship) {
    this.havingExtraMaritalRelationship = havingExtraMaritalRelationship;
  }

  public boolean isSpiritual() {
    return spiritual;
  }

  public void setSpiritual(boolean spiritual) {
    this.spiritual = spiritual;
  }

  public boolean isPoliticallyInclined() {
    return politicallyInclined;
  }

  public void setPoliticallyInclined(boolean politicallyInclined) {
    this.politicallyInclined = politicallyInclined;
  }

  public boolean isFamous() {
    return famous;
  }

  public void setFamous(boolean famous) {
    this.famous = famous;
  }

  public boolean isNotorious() {
    return notorious;
  }

  public void setNotorious(boolean notorious) {
    this.notorious = notorious;
  }

  public boolean isFradulentCasesAgainstNative() {
    return fradulentCasesAgainstNative;
  }

  public void setFradulentCasesAgainstNative(boolean fradulentCasesAgainstNative) {
    this.fradulentCasesAgainstNative = fradulentCasesAgainstNative;
  }

  public boolean isKiller() {
    return killer;
  }

  public void setKiller(boolean killer) {
    this.killer = killer;
  }

  public boolean isImprisoned() {
    return imprisoned;
  }

  public void setImprisoned(boolean imprisoned) {
    this.imprisoned = imprisoned;
  }

  public boolean isMetWithMajorAccident() {
    return metWithMajorAccident;
  }

  public void setMetWithMajorAccident(boolean metWithMajorAccident) {
    this.metWithMajorAccident = metWithMajorAccident;
  }

  public boolean isAthleticPerson() {
    return athleticPerson;
  }

  public void setAthleticPerson(boolean athleticPerson) {
    this.athleticPerson = athleticPerson;
  }

  public boolean isPrimeMinister() {
    return primeMinister;
  }

  public void setPrimeMinister(boolean primeMinister) {
    this.primeMinister = primeMinister;
  }

  public boolean isMemberOfLegislativeAssembly() {
    return memberOfLegislativeAssembly;
  }

  public void setMemberOfLegislativeAssembly(boolean memberOfLegislativeAssembly) {
    this.memberOfLegislativeAssembly = memberOfLegislativeAssembly;
  }

  public boolean isIndianAdministrativeService() {
    return indianAdministrativeService;
  }

  public void setIndianAdministrativeService(boolean indianAdministrativeService) {
    this.indianAdministrativeService = indianAdministrativeService;
  }

  public boolean isMemberOfPartliament() {
    return memberOfPartliament;
  }

  public void setMemberOfPartliament(boolean memberOfPartliament) {
    this.memberOfPartliament = memberOfPartliament;
  }

  public String getDateOfDeath() {
    return dateOfDeath;
  }

  public void setDateOfDeath(String dateOfDeath) {
    this.dateOfDeath = dateOfDeath;
  }

  public UserAdditionalDetailsDTO getUserAdditionalDetails() {
    return userAdditionalDetails;
  }

  public void setUserAdditionalDetails(UserAdditionalDetailsDTO userAdditionalDetails) {
    this.userAdditionalDetails = userAdditionalDetails;
  }

}
