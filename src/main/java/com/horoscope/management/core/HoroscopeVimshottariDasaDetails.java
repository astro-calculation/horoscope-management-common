package com.horoscope.management.core;

import java.util.ArrayList;
import java.util.List;

public class HoroscopeVimshottariDasaDetails {

  private List<VimshottariDasaDetails> dasaData;

  public List<VimshottariDasaDetails> getDasaData() {
    if (dasaData == null) {
      dasaData = new ArrayList<VimshottariDasaDetails>();
    }
    return dasaData;
  }

}
