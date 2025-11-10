package com.astro.model.core;

/**
 * The twelve houses of a horoscope. Each entry stores the conventional
 * one-based house number so callers can perform numeric comparisons.
 */
public enum House {
  HOUSE_1(1),
  HOUSE_2(2),
  HOUSE_3(3),
  HOUSE_4(4),
  HOUSE_5(5),
  HOUSE_6(6),
  HOUSE_7(7),
  HOUSE_8(8),
  HOUSE_9(9),
  HOUSE_10(10),
  HOUSE_11(11),
  HOUSE_12(12);

  private final int houseNumber;

  House(int houseNumber) {
    this.houseNumber = houseNumber;
  }

  public int getHouseNumber() {
    return houseNumber;
  }
}

