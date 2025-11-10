package com.horoscope.management.common;

import com.horoscope.management.core.Horoscope;

public class CreateHoroscopeWithUserDataResponse {

  private String userId;

  private String horoscopeId;
  
  private Horoscope  horoscope;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getHoroscopeId() {
    return horoscopeId;
  }

  public void setHoroscopeId(String horoscopeId) {
    this.horoscopeId = horoscopeId;
  }

  public Horoscope getHoroscope() {
    return horoscope;
  }

  public void setHoroscope(Horoscope horoscope) {
    this.horoscope = horoscope;
  }

}
