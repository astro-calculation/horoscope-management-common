package com.horoscope.management.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Request payload that extends the basic horoscope creation input with
 * arbitrary user-supplied metadata.
 */
public class CreateHoroscopeWithUserDataRequest extends CreateHoroscopeRequest {

  private Map<String, Object> userData = new HashMap<>();

  public Map<String, Object> getUserData() {
    return userData;
  }

  public void setUserData(Map<String, Object> userData) {
    if (userData == null) {
      this.userData = new HashMap<>();
    } else {
      this.userData = userData;
    }
  }
}

