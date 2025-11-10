package com.horoscope.management.core.dto;

import com.horoscope.management.common.core.HoroscopeYoga;

public class HoroscopeYogaDTO {

  private HoroscopeYoga horoscopeYoga;

  private boolean isPositiveYoga;

  private String predictionBasedOnYoga;

  public HoroscopeYoga getHoroscopeYoga() {
    return horoscopeYoga;
  }

  public void setHoroscopeYoga(HoroscopeYoga horoscopeYoga) {
    this.horoscopeYoga = horoscopeYoga;
  }

  public boolean isPositiveYoga() {
    return isPositiveYoga;
  }

  public void setPositiveYoga(boolean isPositiveYoga) {
    this.isPositiveYoga = isPositiveYoga;
  }

  public String getPredictionBasedOnYoga() {
    return predictionBasedOnYoga;
  }

  public void setPredictionBasedOnYoga(String predictionBasedOnYoga) {
    this.predictionBasedOnYoga = predictionBasedOnYoga;
  }

}
