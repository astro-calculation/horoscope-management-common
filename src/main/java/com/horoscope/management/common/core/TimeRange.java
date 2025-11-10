package com.horoscope.management.common.core;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Simple immutable value object capturing a time interval. When precise date
 * handling is not required, callers can leave the values {@code null}.
 */
public class TimeRange {

  private OffsetDateTime start;
  private OffsetDateTime end;

  public TimeRange() {}

  public TimeRange(OffsetDateTime start, OffsetDateTime end) {
    this.start = start;
    this.end = end;
  }

  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TimeRange)) {
      return false;
    }
    TimeRange timeRange = (TimeRange) o;
    return Objects.equals(start, timeRange.start) &&
        Objects.equals(end, timeRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    return "TimeRange{" +
        "start=" + start +
        ", end=" + end +
        '}';
  }
}

