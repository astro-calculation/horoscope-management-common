package com.horoscope.management.core;

import com.horoscope.management.common.core.TimeRange;

public class GulikaKalamDTO {

  private TimeRange gulikaKalRange;

  public GulikaKalamDTO() {}

  public GulikaKalamDTO(TimeRange gulikaKalRange) {
    super();
    this.gulikaKalRange = gulikaKalRange;
  }

  public TimeRange getGulikaKalRange() {
    return gulikaKalRange;
  }

  public void setGulikaKalRange(TimeRange gulikaKalRange) {
    this.gulikaKalRange = gulikaKalRange;
  }

  @Override
  public String toString() {
    return "GulikaKalDetails [gulikaKalRange=" + gulikaKalRange + "]";
  }

}
