package com.horoscope.management.common.core;

/**
 * Basic representation of transit information for a planet. This keeps only the
 * minimal data that the DTO layer needs; additional attributes can be added as
 * the use-cases expand.
 */
public class TransitDetails {

  private Planet planet;
  private TimeRange transitWindow;
  private String summary;

  public TransitDetails() {}

  public TransitDetails(Planet planet, TimeRange transitWindow, String summary) {
    this.planet = planet;
    this.transitWindow = transitWindow;
    this.summary = summary;
  }

  public Planet getPlanet() {
    return planet;
  }

  public void setPlanet(Planet planet) {
    this.planet = planet;
  }

  public TimeRange getTransitWindow() {
    return transitWindow;
  }

  public void setTransitWindow(TimeRange transitWindow) {
    this.transitWindow = transitWindow;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }
}

