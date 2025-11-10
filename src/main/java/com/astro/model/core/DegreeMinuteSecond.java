package com.astro.model.core;

import java.util.Objects;

/**
 * Simple representation of an angle measure expressed as degrees, minutes and
 * seconds. This mirrors the structure that the legacy DTOs expect while keeping
 * the implementation lightweight.
 */
public class DegreeMinuteSecond {

  private int degrees;
  private int minutes;
  private double seconds;

  public DegreeMinuteSecond() {}

  public DegreeMinuteSecond(int degrees, int minutes, double seconds) {
    this.degrees = degrees;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public int getDegrees() {
    return degrees;
  }

  public void setDegrees(int degrees) {
    this.degrees = degrees;
  }

  public int getMinutes() {
    return minutes;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  public double getSeconds() {
    return seconds;
  }

  public void setSeconds(double seconds) {
    this.seconds = seconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof DegreeMinuteSecond)) {
      return false;
    }
    DegreeMinuteSecond that = (DegreeMinuteSecond) o;
    return degrees == that.degrees &&
        minutes == that.minutes &&
        Double.compare(that.seconds, seconds) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(degrees, minutes, seconds);
  }

  @Override
  public String toString() {
    return degrees + "°" + minutes + "'" + seconds + "\"";
  }
}

