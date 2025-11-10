package com.horoscope.management.core;

import com.horoscope.management.common.core.TimeRange;

public class VimshottariDasaDetails {

  private Integer id;

  private String planetName;

  private Integer parentId;

  private Integer level;

  private TimeRange dasaRange;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPlanetName() {
    return planetName;
  }

  public void setPlanetName(String planetName) {
    this.planetName = planetName;
  }

  public int getParentId() {
    return parentId;
  }

  public void setParentId(int parentId) {
    this.parentId = parentId;
  }

  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public TimeRange getDasaRange() {
    return dasaRange;
  }

  public void setDasaRange(TimeRange dasaRange) {
    this.dasaRange = dasaRange;
  }

  @Override
  public String toString() {
    return "VimshottariDasa [id=" + id + ", planetName=" + planetName + ", parentId=" + parentId +
        ", level=" + level + ", dasaRange=" + dasaRange + "]";
  }

}
