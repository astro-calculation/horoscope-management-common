package com.horoscope.management.common.core;

/**
 * Vedic astrology planets that are frequently referenced across the data
 * transfer objects. The list intentionally includes the seven classical planets
 * together with the lunar nodes Rahu and Ketu so that downstream consumers can
 * model a typical horoscope without needing additional dependencies.
 */
public enum Planet {
  SUN,
  MOON,
  MARS,
  MERCURY,
  JUPITER,
  VENUS,
  SATURN,
  RAHU,
  KETU;
}

