package com.horoscope.management.core.dto;

import java.util.EnumMap;

import com.horoscope.management.common.core.House;
import com.horoscope.management.core.HouseDetails;

public class HoroChartDTO {

  private EnumMap<House, HouseDetails> horoscope;

  public EnumMap<House, HouseDetails> getHoroscope() {
    if (horoscope == null) {
      horoscope = new EnumMap<>(House.class);
    }
    return horoscope;
  }

}
