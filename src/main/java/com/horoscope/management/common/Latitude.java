package com.horoscope.management.common;


public class Latitude {

  private int degree;

  private int minutes;

  private int seconds;

  private String direction;

  public Latitude(int degree, int minutes, int seconds, String direction) {
    super();
    this.degree = degree;
    this.minutes = minutes;
    this.seconds = seconds;
    this.direction = direction;
  }

  public Latitude(int degree, int minutes, int seconds) {
    super();
    this.degree = degree;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public Latitude copy(Latitude dms) {
    Latitude newInstance = new Latitude(dms.getDegree(), dms.getMinutes(), dms.getSeconds());
    newInstance.setDirection(dms.getDirection());
    return newInstance;
  }

  public Latitude() {}

  public int getDegree() {
    return degree;
  }

  public void setDegree(int degree) {
    this.degree = degree;
  }

  public int getMinutes() {
    return minutes;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  public int getSeconds() {
    return seconds;
  }

  public void setSeconds(int seconds) {
    this.seconds = seconds;
  }

  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  @Override
  public String toString() {
    return "Latitude [degree=" + degree + ", minutes=" + minutes + ", seconds=" + seconds + "]";
  }

  public String getLatitudeString() {
    return "" + degree + "º" + minutes + "'" + seconds + "\"" + direction;
  }

}
