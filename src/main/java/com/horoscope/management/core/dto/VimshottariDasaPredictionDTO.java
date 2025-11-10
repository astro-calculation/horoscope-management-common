package com.horoscope.management.core.dto;

import java.util.HashMap;
import java.util.Map;

import com.horoscope.management.core.VimshottariDasaDetails;

public class VimshottariDasaPredictionDTO {

  private Map<VimshottariDasaDetails, String> dasaPrediction;

  public Map<VimshottariDasaDetails, String> getDasaPrediction() {
    if (dasaPrediction == null) {
      dasaPrediction = new HashMap<>();
    }
    return dasaPrediction;
  }

}
