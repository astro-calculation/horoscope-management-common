package com.horoscope.management.core.dto;

import org.joda.time.DateTime;

public class SunRiseSunSetDTO {

  private DateTime sunrise;

  private DateTime sunset;

  public SunRiseSunSetDTO() {}

  public SunRiseSunSetDTO(DateTime sunrise, DateTime sunset, String sunRiseTime,
      String sunSetTime) {
    super();
    this.sunrise = sunrise;
    this.sunset = sunset;
  }

  public DateTime getSunrise() {
    return sunrise;
  }

  public void setSunrise(DateTime sunrise) {
    this.sunrise = sunrise;
  }

  public DateTime getSunset() {
    return sunset;
  }

  public void setSunset(DateTime sunset) {
    this.sunset = sunset;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((sunrise == null) ? 0 : sunrise.hashCode());
    result = prime * result + ((sunset == null) ? 0 : sunset.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SunRiseSunSetDTO other = (SunRiseSunSetDTO) obj;
    if (sunrise == null) {
      if (other.sunrise != null)
        return false;
    } else if (!sunrise.equals(other.sunrise))
      return false;
    if (sunset == null) {
      if (other.sunset != null)
        return false;
    } else if (!sunset.equals(other.sunset))
      return false;
    return true;
  }

}
