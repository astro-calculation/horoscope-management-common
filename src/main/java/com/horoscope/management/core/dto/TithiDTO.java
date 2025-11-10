package com.horoscope.management.core.dto;

import com.horoscope.management.common.core.Paksham;
import com.horoscope.management.common.core.TimeRange;
import com.horoscope.management.common.core.Tithi;

public class TithiDTO {

  private Tithi tithi;

  private int tithiNumber;

  private Paksham paksham;

  private TimeRange tithiRange;

  public TithiDTO() {
    super();
  }

  public TithiDTO(Tithi tithi, int tithiNumber, TimeRange tithiRange) {
    super();
    this.tithi = tithi;
    this.tithiNumber = tithiNumber;
    this.tithiRange = tithiRange;
  }

  public Tithi getTithi() {
    return tithi;
  }

  public void setTithi(Tithi tithi) {
    this.tithi = tithi;
  }

  public int getTithiNumber() {
    return tithiNumber;
  }

  public void setTithiNumber(int tithiNumber) {
    this.tithiNumber = tithiNumber;
  }

  public TimeRange getTithiRange() {
    return tithiRange;
  }

  public void setTithiRange(TimeRange tithiRange) {
    this.tithiRange = tithiRange;
  }

  public Paksham getPaksham() {
    return paksham;
  }

  public void setPaksham(Paksham paksham) {
    this.paksham = paksham;
  }

}
