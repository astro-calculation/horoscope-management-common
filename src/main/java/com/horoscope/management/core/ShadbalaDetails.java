package com.horoscope.management.core;

import java.util.EnumMap;

import com.horoscope.management.common.core.Planet;

public class ShadbalaDetails {

  private EnumMap<Planet, Double> shadbalaDetails;

  public EnumMap<Planet, Double> getShadbalaDetails() {
    if(shadbalaDetails == null) {
      shadbalaDetails = new EnumMap<>(Planet.class);
    }
    return shadbalaDetails;
  }

  public void setShadbalaDetails(EnumMap<Planet, Double> shadbalaDetails) {
    this.shadbalaDetails = shadbalaDetails;
  }

}
