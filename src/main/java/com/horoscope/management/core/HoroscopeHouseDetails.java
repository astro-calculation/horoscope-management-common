package com.horoscope.management.core;

import java.util.EnumMap;
import com.horoscope.management.common.core.House;
public class HoroscopeHouseDetails {

  private EnumMap<House, HouseDetails> horoscopeHouseDetails;

  public void setHoroscopeHouseDetails(EnumMap<House, HouseDetails> horoscopeHouseDetails) {
    this.horoscopeHouseDetails = horoscopeHouseDetails;
  }

  public HouseDetails getHouseDetails(House house) {
    return horoscopeHouseDetails.get(house);
  }

}
