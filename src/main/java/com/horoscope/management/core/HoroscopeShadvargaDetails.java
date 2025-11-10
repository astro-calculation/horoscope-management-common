package com.horoscope.management.core;

import java.util.EnumMap;
import com.horoscope.management.common.core.Shadvarga;

public class HoroscopeShadvargaDetails {

  public EnumMap<Shadvarga, ShadvargaDetails> horoscopeShadvargaDetails;

  public void setHoroscopeShadvargaDetails(
      EnumMap<Shadvarga, ShadvargaDetails> horoscopeShadvargaDetails) {
    this.horoscopeShadvargaDetails = horoscopeShadvargaDetails;
  }

  public ShadvargaDetails getShadvargaDetails(Shadvarga shadvarga) {
    return horoscopeShadvargaDetails.get(shadvarga);
  }

}
