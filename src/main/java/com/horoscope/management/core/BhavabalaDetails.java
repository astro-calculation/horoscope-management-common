package com.horoscope.management.core;

import java.util.EnumMap;

import com.horoscope.management.common.core.House;

public class BhavabalaDetails {

  private EnumMap<House, Double> bhavabalaDetails;

  public EnumMap<House, Double> getBhavabalaDetails() {
    if(bhavabalaDetails == null) {
      bhavabalaDetails = new EnumMap<>(House.class);
    }
    return bhavabalaDetails;
  }

  public void setBhavabalaDetails(EnumMap<House, Double> bhavabalaDetails) {
    this.bhavabalaDetails = bhavabalaDetails;
  }

}
