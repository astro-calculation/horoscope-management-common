package com.horoscope.management.core.dto;

import com.horoscope.management.common.core.Star;
import com.horoscope.management.common.core.TimeRange;

public class StarDTO {

  private Star nakshatram;

  private int nakshatramNumber;

  private int nakshatramPadam;

  private TimeRange nakshatraRange;

  public StarDTO() {}

  public StarDTO(Star nakshatram, int nakshatramNumber, int nakshatramPadam,
      TimeRange nakshatraRange) {
    super();
    this.nakshatram = nakshatram;
    this.nakshatramNumber = nakshatramNumber;
    this.nakshatramPadam = nakshatramPadam;
    this.nakshatraRange = nakshatraRange;
  }

  public Star getNakshatram() {
    return nakshatram;
  }

  public void setNakshatram(Star nakshatram) {
    this.nakshatram = nakshatram;
  }

  public int getNakshatramNumber() {
    return nakshatramNumber;
  }

  public void setNakshatramNumber(int nakshatramNumber) {
    this.nakshatramNumber = nakshatramNumber;
  }

  public int getNakshatramPadam() {
    return nakshatramPadam;
  }

  public void setNakshatramPadam(int nakshatramPadam) {
    this.nakshatramPadam = nakshatramPadam;
  }

  public TimeRange getNakshatraRange() {
    return nakshatraRange;
  }

  public void setNakshatraRange(TimeRange nakshatraRange) {
    this.nakshatraRange = nakshatraRange;
  }

}
