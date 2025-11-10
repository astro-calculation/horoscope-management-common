package com.horoscope.management.core.dto;

import com.horoscope.management.common.core.TimeRange;

public class RahuKalamDTO {

  private TimeRange rahuKalRange;

  public RahuKalamDTO() {}

  public RahuKalamDTO(TimeRange rahuKalRange) {
    super();
    this.rahuKalRange = rahuKalRange;
  }

  public TimeRange getRahuKalRange() {
    return rahuKalRange;
  }

  public void setRahuKalRange(TimeRange rahuKalRange) {
    this.rahuKalRange = rahuKalRange;
  }

  @Override
  public String toString() {
    return "RahukalDTO [rahuKalRange=" + rahuKalRange + "]";
  }

}
