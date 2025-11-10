package com.astro.model.core;

/**
 * Enumeration of the 12 zodiac signs in their traditional order. Each entry
 * stores its human readable name and one-based ordinal number, matching the
 * expectations of the legacy code that previously depended on an external
 * shared library.
 */
public enum ZodiacSign {
  ARIES(1, "Aries"),
  TAURUS(2, "Taurus"),
  GEMINI(3, "Gemini"),
  CANCER(4, "Cancer"),
  LEO(5, "Leo"),
  VIRGO(6, "Virgo"),
  LIBRA(7, "Libra"),
  SCORPIO(8, "Scorpio"),
  SAGITTARIUS(9, "Sagittarius"),
  CAPRICORN(10, "Capricorn"),
  AQUARIUS(11, "Aquarius"),
  PISCES(12, "Pisces");

  private final int zodiacNumber;
  private final String displayName;

  ZodiacSign(int zodiacNumber, String displayName) {
    this.zodiacNumber = zodiacNumber;
    this.displayName = displayName;
  }

  /**
   * Returns the traditional one-based index of the sign.
   */
  public int getZodiacNumber() {
    return zodiacNumber;
  }

  public String getDisplayName() {
    return displayName;
  }
}

