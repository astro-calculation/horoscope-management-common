package com.horoscope.management.core;

import java.util.EnumMap;

import com.horoscope.management.common.core.House;

public class HoroscopeBhavaDetails {

  private EnumMap<House, BhavaDetails> horoscopeBhavaDetails;

  public EnumMap<House, BhavaDetails> getHoroscopeBhavaDetails() {
    return horoscopeBhavaDetails;
  }

  public void setHoroscopeBhavaDetails(EnumMap<House, BhavaDetails> horoscopeBhavaDetails) {
    this.horoscopeBhavaDetails = horoscopeBhavaDetails;
  }

  public BhavaDetails getBhavaDetails(House house) {
    return horoscopeBhavaDetails.get(house);
  }

  public BhavaDetails getBhava(int bhava) {
    BhavaDetails bhavaDetails = null;
    for (House house : horoscopeBhavaDetails.keySet()) {
      if (house.getHouseNumber() == bhava) {
        bhavaDetails = horoscopeBhavaDetails.get(house);
      }
    }
    return bhavaDetails;
  }

}