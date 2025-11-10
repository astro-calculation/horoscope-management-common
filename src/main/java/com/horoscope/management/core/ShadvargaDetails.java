package com.horoscope.management.core;

import java.util.EnumMap;

import com.horoscope.management.common.core.Planet;
import com.horoscope.management.common.core.ZodiacSign;

public class ShadvargaDetails {

  private EnumMap<Planet, ZodiacSign> divisionalChartMap;

  public EnumMap<Planet, ZodiacSign> getDivisionalChartMap() {
    if (divisionalChartMap == null) {
      divisionalChartMap = new EnumMap<>(Planet.class);
    }
    return divisionalChartMap;
  }

}
