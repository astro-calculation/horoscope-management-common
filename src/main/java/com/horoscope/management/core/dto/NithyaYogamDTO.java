package com.horoscope.management.core.dto;

import java.util.Map;

import com.horoscope.management.common.core.NithyaYogam;
import com.horoscope.management.common.core.TimeRange;

public class NithyaYogamDTO {

  private NithyaYogam nithyaYogam;

  private int nithyaYogamNumber;

  private Map<String, String> localizedNithyaYogamName;

  private transient TimeRange nithyaYogamRange;

  public NithyaYogamDTO() {
    super();
  }

  public NithyaYogamDTO(NithyaYogam nithyaYogam, int nithyaYogamNumber,
      Map<String, String> localizedNithyaYogamName, TimeRange nithyaYogamRange) {
    super();
    this.nithyaYogam = nithyaYogam;
    this.nithyaYogamNumber = nithyaYogamNumber;
    this.localizedNithyaYogamName = localizedNithyaYogamName;
    this.nithyaYogamRange = nithyaYogamRange;
  }

  public NithyaYogam getNithyaYogam() {
    return nithyaYogam;
  }

  public void setNithyaYogam(NithyaYogam nithyaYogam) {
    this.nithyaYogam = nithyaYogam;
  }

  public int getNithyaYogamNumber() {
    return nithyaYogamNumber;
  }

  public void setNithyaYogamNumber(int nithyaYogamNumber) {
    this.nithyaYogamNumber = nithyaYogamNumber;
  }

  public Map<String, String> getLocalizedNithyaYogamName() {
    return localizedNithyaYogamName;
  }

  public void setLocalizedNithyaYogamName(Map<String, String> localizedNithyaYogamName) {
    this.localizedNithyaYogamName = localizedNithyaYogamName;
  }

  public TimeRange getNithyaYogamRange() {
    return nithyaYogamRange;
  }

  public void setNithyaYogamRange(TimeRange nithyaYogamRange) {
    this.nithyaYogamRange = nithyaYogamRange;
  }

  @Override
  public String toString() {
    return "NithyaYogamDTO [nithyaYogamName=" + nithyaYogam.name() + ", nithyaYogamNumber=" +
        nithyaYogamNumber + ", localizedNithyaYogamName=" + localizedNithyaYogamName +
        ", nithyaYogamRange=" + nithyaYogamRange + "]";
  }

}
