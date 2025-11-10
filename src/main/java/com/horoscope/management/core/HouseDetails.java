package com.horoscope.management.core;

import java.util.List;

import com.horoscope.management.common.core.Planet;
import com.horoscope.management.common.core.ZodiacSign;

public class HouseDetails {

  private ZodiacSign zodiacSign;

  private List<Planet> planetsInHouse;

  private List<Planet> planetsAspectingHouse;

  public ZodiacSign getZodiacSign() {
    return zodiacSign;
  }

  public void setZodiacSign(ZodiacSign zodiacSign) {
    this.zodiacSign = zodiacSign;
  }

  public List<Planet> getPlanetsInHouse() {
    return planetsInHouse;
  }

  public void setPlanetsInHouse(List<Planet> planetsInHouse) {
    this.planetsInHouse = planetsInHouse;
  }

  public List<Planet> getPlanetsAspectingHouse() {
    return planetsAspectingHouse;
  }

  public void setPlanetsAspectingHouse(List<Planet> planetsAspectingHouse) {
    this.planetsAspectingHouse = planetsAspectingHouse;
  }

}
