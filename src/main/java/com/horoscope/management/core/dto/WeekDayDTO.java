package com.horoscope.management.core.dto;

import java.util.Map;

import com.horoscope.management.common.core.Language;

public class WeekDayDTO {

  private String weekDayName;

  private Map<Language, String> localizedWeekDayName;

  private int weekDayNumber;

  private String weekDayGodName;

  public WeekDayDTO() {}

  public WeekDayDTO(String weekDayName, Map<Language, String> localizedWeekDayName,
      int weekDayNumber, String weekDayGodName) {
    this.weekDayName = weekDayName;
    this.localizedWeekDayName = localizedWeekDayName;
    this.weekDayNumber = weekDayNumber;
    this.weekDayGodName = weekDayGodName;
  }

  public String getWeekDayName() {
    return weekDayName;
  }

  public void setWeekDayName(String weekDayName) {
    this.weekDayName = weekDayName;
  }

  public Map<Language, String> getLocalizedWeekDayName() {
    return localizedWeekDayName;
  }

  public void setLocalizedWeekDayName(Map<Language, String> localizedWeekDayName) {
    this.localizedWeekDayName = localizedWeekDayName;
  }

  public int getWeekDayNumber() {
    return weekDayNumber;
  }

  public void setWeekDayNumber(int weekDayNumber) {
    this.weekDayNumber = weekDayNumber;
  }

  public String getWeekDayGodName() {
    return weekDayGodName;
  }

  public void setWeekDayGodName(String weekDayGodName) {
    this.weekDayGodName = weekDayGodName;
  }

  @Override
  public String toString() {
    return "WeekDayDetails [weekDayName=" + weekDayName + ", localizedWeekDayName=" +
        localizedWeekDayName + ", weekDayNumber=" + weekDayNumber + ", weekDayGodName=" +
        weekDayGodName + "]";
  }

}
