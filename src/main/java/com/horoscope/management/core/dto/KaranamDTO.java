package com.horoscope.management.core.dto;

import java.util.Map;

import com.horoscope.management.common.core.Karanam;
import com.horoscope.management.common.core.TimeRange;

public class KaranamDTO {

  private Karanam karanam;

  private int karanamNumber;

  private boolean isSthiraKaranam;

  private Map<String, String> localizedKaranamName;

  private TimeRange karanamRange;

  public KaranamDTO() {}

  public KaranamDTO(Karanam karanam, int karanamNumber, boolean isSthiraKaranam,
      Map<String, String> localizedKaranamName, TimeRange karanamRange) {
    super();
    this.karanam = karanam;
    this.karanamNumber = karanamNumber;
    this.isSthiraKaranam = isSthiraKaranam;
    this.localizedKaranamName = localizedKaranamName;
    this.karanamRange = karanamRange;
  }

  public Karanam getKaranam() {
    return karanam;
  }

  public void setKaranam(Karanam karanam) {
    this.karanam = karanam;
  }

  public int getKaranamNumber() {
    return karanamNumber;
  }

  public void setKaranamNumber(int karanamNumber) {
    this.karanamNumber = karanamNumber;
  }

  public boolean isSthiraKaranam() {
    return isSthiraKaranam;
  }

  public void setSthiraKaranam(boolean isSthiraKaranam) {
    this.isSthiraKaranam = isSthiraKaranam;
  }

  public Map<String, String> getLocalizedKaranamName() {
    return localizedKaranamName;
  }

  public void setLocalizedKaranamName(Map<String, String> localizedKaranamName) {
    this.localizedKaranamName = localizedKaranamName;
  }

  public TimeRange getKaranamRange() {
    return karanamRange;
  }

  public void setKaranamRange(TimeRange karanamRange) {
    this.karanamRange = karanamRange;
  }

  @Override
  public String toString() {
    return "KaranamDTO [karanamName=" + karanam.name() + ", karanamNumber=" + karanamNumber +
        ", isSthiraKaranam=" + isSthiraKaranam + ", localizedKaranamName=" + localizedKaranamName +
        "]";
  }

}
