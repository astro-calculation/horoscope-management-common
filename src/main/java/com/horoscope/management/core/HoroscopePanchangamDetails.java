package com.horoscope.management.core;

import org.joda.time.DateTime;

import com.horoscope.management.common.core.Karanam;
import com.horoscope.management.common.core.NithyaYogam;
import com.horoscope.management.common.core.TimeRange;

public class HoroscopePanchangamDetails {

  private String star;

  private int starPadam;
  
  private TimeRange starRange;

  private String weekDay;

  private String tithi;
  
  private TimeRange tithiRange;

  private String paksham;

  private String karanam;
  
  private TimeRange karanamRange;

  private String nithyayogam;
  
  private TimeRange nithyaYogamRange;

  public String getStar() {
    return star;
  }

  public void setStar(String star) {
    this.star = star;
  }

  public int getStarPadam() {
    return starPadam;
  }

  public void setStarPadam(int starPadam) {
    this.starPadam = starPadam;
  }

  public TimeRange getStarRange() {
    return starRange;
  }

  public void setStarRange(TimeRange starRange) {
    this.starRange = starRange;
  }

  public String getWeekDay() {
    return weekDay;
  }

  public void setWeekDay(String weekDay) {
    this.weekDay = weekDay;
  }

  public String getTithi() {
    return tithi;
  }

  public void setTithi(String tithi) {
    this.tithi = tithi;
  }

  public TimeRange getTithiRange() {
    return tithiRange;
  }

  public void setTithiRange(TimeRange tithiRange) {
    this.tithiRange = tithiRange;
  }

  public String getPaksham() {
    return paksham;
  }

  public void setPaksham(String paksham) {
    this.paksham = paksham;
  }

  public String getKaranam() {
    return karanam;
  }

  public void setKaranam(String karanam) {
    this.karanam = karanam;
  }

  public TimeRange getKaranamRange() {
    return karanamRange;
  }

  public void setKaranamRange(TimeRange karanamRange) {
    this.karanamRange = karanamRange;
  }

  public String getNithyayogam() {
    return nithyayogam;
  }

  public void setNithyayogam(String nithyayogam) {
    this.nithyayogam = nithyayogam;
  }

  public TimeRange getNithyaYogamRange() {
    return nithyaYogamRange;
  }

  public void setNithyaYogamRange(TimeRange nithyaYogamRange) {
    this.nithyaYogamRange = nithyaYogamRange;
  }

}
