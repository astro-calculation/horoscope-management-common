package com.horoscope.management.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.horoscope.management.common.core.DegreeMinuteSecond;
import com.horoscope.management.common.core.House;
import com.horoscope.management.common.core.Planet;
import com.horoscope.management.common.core.Star;
import com.horoscope.management.common.core.ZodiacSign;

public class PlanetDetails implements Serializable {

  private static final long serialVersionUID = 9165954378348554823L;

  private Planet planet;

  private double longitude;

  private double velocity;

  private boolean retrograde;

  private DegreeMinuteSecond position;

  private PlanetState state;

  private PlanetStrength strength;

  private ZodiacSign sign;

  private Star star; // Assuming Star is an enum or simple type persistable by DynamoDB

  private House house; // Assuming House is an enum or simple type persistable by DynamoDB

  public PlanetDetails() {}

  public Planet getPlanet() {
    return planet;
  }

  public void setPlanet(Planet planet) {
    this.planet = planet;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public double getVelocity() {
    return velocity;
  }

  public void setVelocity(double velocity) {
    this.velocity = velocity;
  }

  public boolean isRetrograde() {
    return retrograde;
  }

  public void setRetrograde(boolean retrograde) {
    this.retrograde = retrograde;
  }

  public DegreeMinuteSecond getPosition() {
    return position;
  }

  public void setPosition(DegreeMinuteSecond position) {
    this.position = position;
  }

  public PlanetState getState() {
    return state;
  }

  public void setState(PlanetState state) {
    this.state = state;
  }

  public PlanetStrength getStrength() {
    return strength;
  }

  public void setStrength(PlanetStrength strength) {
    this.strength = strength;
  }

  public ZodiacSign getSign() {
    return sign;
  }

  public void setSign(ZodiacSign sign) {
    this.sign = sign;
  }

  public Star getStar() {
    return star;
  }

  public void setStar(Star star) {
    this.star = star;
  }

  /**
   * To check whether the planet is aspecting the given Zodiac Sign.
   *
   * @param zSign
   * @return
   */
  public boolean isAspectingZodiacSign(ZodiacSign zSign) {
    int difference = this.getSign().getZodiacNumber() - zSign.getZodiacNumber();
    if (difference < 0) {
      difference = 12 + difference;
    }
    difference++;

    if (difference == 7) {
      return true;
    } else if (this.getPlanet() == Planet.MARS) {
      if (difference == 4 || difference == 8) {
        return true;
      }
    } else if (this.getPlanet() == Planet.JUPITER) {
      if (difference == 5 || difference == 9) {
        return true;
      }
    } else if (this.getPlanet() == Planet.SATURN) {
      if (difference == 3 || difference == 10) {
        return true;
      }
    }
    return false;
  }

  public boolean isAspectedByPlanet(PlanetDetails secondPlanet) {
    return isAspectingZodiacSign(secondPlanet.getSign());
  }

  public boolean isInQuadrantHouse(ZodiacSign ascendantSign) {
    int difference = this.getSign().getZodiacNumber() - ascendantSign.getZodiacNumber();
    if (difference < 0) {
      difference = 12 + difference + 1;
    } else {
      difference++;
    }
    if (difference == 1 || difference == 4 || difference == 7 || difference == 10) {
      return true;
    }
    return false;
  }

  public boolean isInTrikonaHouse(ZodiacSign ascendantSign) {
    int difference = this.getSign().getZodiacNumber() - ascendantSign.getZodiacNumber();
    if (difference < 0) {
      difference = 12 + difference + 1;
    } else {
      difference++;
    }
    if (difference == 1 || difference == 5 || difference == 9) {
      return true;
    }
    return false;
  }

  public boolean isBeneficForYogaCalculation() {
    List<ZodiacSign> zodiacList = new ArrayList<>();
    switch (this.planet) {
    case SUN:
      zodiacList = Arrays.asList(ZodiacSign.LEO, ZodiacSign.TAURUS, ZodiacSign.AQUARIUS,
        ZodiacSign.SCORPIO, ZodiacSign.ARIES, ZodiacSign.SAGITTARIUS);
      break;
    case MOON:
      zodiacList = Arrays.asList(ZodiacSign.LEO, ZodiacSign.TAURUS, ZodiacSign.AQUARIUS,
        ZodiacSign.SCORPIO, ZodiacSign.ARIES, ZodiacSign.SAGITTARIUS);
      break;
    case MARS:
      zodiacList = Arrays.asList(ZodiacSign.LEO, ZodiacSign.TAURUS, ZodiacSign.AQUARIUS,
        ZodiacSign.SCORPIO, ZodiacSign.ARIES, ZodiacSign.SAGITTARIUS);
      break;
    case MERCURY:
      zodiacList = Arrays.asList(ZodiacSign.LEO, ZodiacSign.TAURUS, ZodiacSign.AQUARIUS,
        ZodiacSign.SCORPIO, ZodiacSign.ARIES, ZodiacSign.SAGITTARIUS);
      break;
    case JUPITER:
      zodiacList = Arrays.asList(ZodiacSign.LEO, ZodiacSign.TAURUS, ZodiacSign.AQUARIUS,
        ZodiacSign.SCORPIO, ZodiacSign.ARIES, ZodiacSign.SAGITTARIUS);
      break;
    case VENUS:
      zodiacList = Arrays.asList(ZodiacSign.LEO, ZodiacSign.TAURUS, ZodiacSign.AQUARIUS,
        ZodiacSign.SCORPIO, ZodiacSign.ARIES, ZodiacSign.SAGITTARIUS);
      break;
    case SATURN:
      zodiacList = Arrays.asList(ZodiacSign.LEO, ZodiacSign.TAURUS, ZodiacSign.AQUARIUS,
        ZodiacSign.SCORPIO, ZodiacSign.ARIES, ZodiacSign.SAGITTARIUS);
      break;
    }

    if (zodiacList.contains(this.getSign())) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isMaleficForYogaCalculation() {
    List<ZodiacSign> zodiacList =
      Arrays.asList(ZodiacSign.GEMINI, ZodiacSign.PISCES, ZodiacSign.LIBRA);
    if (zodiacList.contains(this.getSign())) {
      return true;
    } else {
      return false;
    }
  }

  public House getHouse() {
    return house;
  }

  public void setHouse(House house) {
    this.house = house;
  }

}
