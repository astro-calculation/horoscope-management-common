package com.horoscope.management.core.dto;

import java.util.EnumMap;
import java.util.List;

import com.horoscope.management.common.core.Planet;
import com.horoscope.management.common.core.TransitDetails;

public class TransitDTO {

  private EnumMap<Planet, List<TransitDetails>> planetaryTransitDetails;

  public EnumMap<Planet, List<TransitDetails>> getPlanetaryTransitDetails() {
    if (planetaryTransitDetails == null) {
      planetaryTransitDetails = new EnumMap<>(Planet.class);
    }
    return planetaryTransitDetails;
  }

}
