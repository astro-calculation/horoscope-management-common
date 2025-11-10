package com.horoscope.management.core;

import java.util.EnumMap;
import com.horoscope.management.common.core.Bhavabala;
public class HoroscopeBhavabalaDetails {

  private EnumMap<Bhavabala, BhavabalaDetails> horoscopeBhavabalaDetails;

  public void sethoroscopeBhavabalaDetails(
      EnumMap<Bhavabala, BhavabalaDetails> horoscopeBhavabalaDetails) {
    this.horoscopeBhavabalaDetails = horoscopeBhavabalaDetails;
  }

  public BhavabalaDetails getBhavabalaDetails(Bhavabala bhavaBala) {
    return horoscopeBhavabalaDetails.get(bhavaBala);
  }

}
