package com.horoscope.management.core.dto;

import java.util.ArrayList;
import java.util.List;

import com.horoscope.management.core.BhavaDetails;

public class HousePositionDTO {

  private List<BhavaDetails> bhavaPositions;

  public List<BhavaDetails> getHousePositions() {
    if (bhavaPositions == null) {
      bhavaPositions = new ArrayList<>();
    }
    return bhavaPositions;
  }

  public BhavaDetails getBhava(int i) {
    return bhavaPositions.get(i - 1);
  }

}
