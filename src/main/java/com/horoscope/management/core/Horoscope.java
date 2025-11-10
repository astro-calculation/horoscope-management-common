package com.horoscope.management.core;

import com.horoscope.management.common.CreateHoroscopeRequest;
import com.horoscope.management.common.CreateHoroscopeWithUserDataRequest;

public class Horoscope {
  
  private String horoscopeId;
  
  private CreateHoroscopeRequest createHoroscopeRequest;
  
  private CreateHoroscopeWithUserDataRequest createHoroscopeWithUserDataRequest;
  
  private HoroscopeUserDetails horoscopeUserDetails;
  
  private HoroscopePlanetDetails horoscopePlanetDetails;

  private HoroscopeHouseDetails horoscopeHouseDetails;

  private HoroscopeBhavaDetails horoscopeBhavaDetails;

  private HoroscopePanchangamDetails horoscopePanchangamDetails;

  private HoroscopeShadbalaDetails horoscopeShadbalaDetails;

  private HoroscopeShadvargaDetails horoscopeShadvargaDetails;

  private HoroscopeVimshottariDasaDetails horoscopeVimshottariDasaDetails;

  private HoroscopeBhavabalaDetails horoscopeBhavabalaDetails;

  public String getHoroscopeId() {
    return horoscopeId;
  }

  public void setHoroscopeId(String horoscopeId) {
    this.horoscopeId = horoscopeId;
  }

  public CreateHoroscopeRequest getCreateHoroscopeRequest() {
    return createHoroscopeRequest;
  }

  public void setCreateHoroscopeRequest(CreateHoroscopeRequest createHoroscopeRequest) {
    this.createHoroscopeRequest = createHoroscopeRequest;
  }

  public HoroscopeUserDetails getHoroscopeUserDetails() {
    return horoscopeUserDetails;
  }

  public void setHoroscopeUserDetails(HoroscopeUserDetails horoscopeUserDetails) {
    this.horoscopeUserDetails = horoscopeUserDetails;
  }

  public HoroscopePlanetDetails getHoroscopePlanetDetails() {
    return horoscopePlanetDetails;
  }

  public void setHoroscopePlanetDetails(HoroscopePlanetDetails horoscopePlanetDetails) {
    this.horoscopePlanetDetails = horoscopePlanetDetails;
  }

  public HoroscopeHouseDetails getHoroscopeHouseDetails() {
    return horoscopeHouseDetails;
  }

  public void setHoroscopeHouseDetails(HoroscopeHouseDetails horoscopeHouseDetails) {
    this.horoscopeHouseDetails = horoscopeHouseDetails;
  }

  public HoroscopeBhavaDetails getHoroscopeBhavaDetails() {
    return horoscopeBhavaDetails;
  }

  public void setHoroscopeBhavaDetails(HoroscopeBhavaDetails horoscopeBhavaDetails) {
    this.horoscopeBhavaDetails = horoscopeBhavaDetails;
  }

  public HoroscopePanchangamDetails getHoroscopePanchangamDetails() {
    return horoscopePanchangamDetails;
  }

  public void setHoroscopePanchangamDetails(HoroscopePanchangamDetails horoscopePanchangamDetails) {
    this.horoscopePanchangamDetails = horoscopePanchangamDetails;
  }

  public HoroscopeShadbalaDetails getHoroscopeShadbalaDetails() {
    return horoscopeShadbalaDetails;
  }

  public void setHoroscopeShadbalaDetails(HoroscopeShadbalaDetails horoscopeShadbalaDetails) {
    this.horoscopeShadbalaDetails = horoscopeShadbalaDetails;
  }

  public HoroscopeShadvargaDetails getHoroscopeShadvargaDetails() {
    return horoscopeShadvargaDetails;
  }

  public void setHoroscopeShadvargaDetails(HoroscopeShadvargaDetails horoscopeShadvargaDetails) {
    this.horoscopeShadvargaDetails = horoscopeShadvargaDetails;
  }

  public HoroscopeVimshottariDasaDetails getHoroscopeVimshottariDasaDetails() {
    return horoscopeVimshottariDasaDetails;
  }

  public void setHoroscopeVimshottariDasaDetails(
      HoroscopeVimshottariDasaDetails horoscopeVimshottariDasaDetails) {
    this.horoscopeVimshottariDasaDetails = horoscopeVimshottariDasaDetails;
  }

  public HoroscopeBhavabalaDetails getHoroscopeBhavabalaDetails() {
    return horoscopeBhavabalaDetails;
  }

  public void setHoroscopeBhavabalaDetails(HoroscopeBhavabalaDetails horoscopeBhavabalaDetails) {
    this.horoscopeBhavabalaDetails = horoscopeBhavabalaDetails;
  }

  public CreateHoroscopeWithUserDataRequest getCreateHoroscopeWithUserDataRequest() {
    return createHoroscopeWithUserDataRequest;
  }

  public void setCreateHoroscopeWithUserDataRequest(CreateHoroscopeWithUserDataRequest createHoroscopeWithUserDataRequest) {
    this.createHoroscopeWithUserDataRequest = createHoroscopeWithUserDataRequest;
  }

}
