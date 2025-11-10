package com.horoscope.management.common.core;

/**
 * Represents a named yoga along with an optional textual description. This
 * lightweight value object avoids coupling the DTO layer to any external
 * catalogues.
 */
public class HoroscopeYoga {

  private String name;
  private String description;

  public HoroscopeYoga() {}

  public HoroscopeYoga(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}

