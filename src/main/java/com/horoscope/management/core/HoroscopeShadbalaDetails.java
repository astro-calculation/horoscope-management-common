package com.horoscope.management.core;

import java.util.EnumMap;
import com.horoscope.management.common.core.Shadbala;
public class HoroscopeShadbalaDetails {

  private EnumMap<Shadbala, ShadbalaDetails> horoscopeShadbalaDetails;

  public void setHoroscopeShadbalaDetails(
      EnumMap<Shadbala, ShadbalaDetails> horoscopeShadbalaDetails) {
    this.horoscopeShadbalaDetails = horoscopeShadbalaDetails;
  }

  public ShadbalaDetails getShadbalaDetails(Shadbala shadBala) {
    return horoscopeShadbalaDetails.get(shadBala);
  }

}
