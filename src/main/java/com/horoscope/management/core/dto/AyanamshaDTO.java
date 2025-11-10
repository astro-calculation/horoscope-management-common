package com.horoscope.management.core.dto;

import com.horoscope.management.common.core.DegreeMinuteSecond;

public class AyanamshaDTO {

  private String ayanamshaName;

  private int ayanamshaNumber;

  private DegreeMinuteSecond ayanamshaValue;

  public AyanamshaDTO() {
    super();
  }

  public AyanamshaDTO(String ayanamshaName, int ayanamshaNumber,
      DegreeMinuteSecond ayanamshaValue) {
    super();
    this.ayanamshaName = ayanamshaName;
    this.ayanamshaNumber = ayanamshaNumber;
    this.ayanamshaValue = ayanamshaValue;
  }

  public String getAyanamshaName() {
    return ayanamshaName;
  }

  public void setAyanamshaName(String ayanamshaName) {
    this.ayanamshaName = ayanamshaName;
  }

  public int getAyanamshaNumber() {
    return ayanamshaNumber;
  }

  public void setAyanamshaNumber(int ayanamshaNumber) {
    this.ayanamshaNumber = ayanamshaNumber;
  }

  public DegreeMinuteSecond getAyanamshaValue() {
    return ayanamshaValue;
  }

  public void setAyanamshaValue(DegreeMinuteSecond ayanamshaValue) {
    this.ayanamshaValue = ayanamshaValue;
  }

}
