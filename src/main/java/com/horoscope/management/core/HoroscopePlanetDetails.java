package com.horoscope.management.core;

import java.util.EnumMap;
import com.horoscope.management.common.core.Planet;
public class HoroscopePlanetDetails {

  public EnumMap<Planet, PlanetDetails> horoscopePlanetDetails;

  public void setHoroscopePlanetDetails(EnumMap<Planet, PlanetDetails> horoscopePlanetDetails) {
    this.horoscopePlanetDetails = horoscopePlanetDetails;
  }

  public PlanetDetails getPlanetDetails(Planet planet) {
    return horoscopePlanetDetails.get(planet);
  }

}
