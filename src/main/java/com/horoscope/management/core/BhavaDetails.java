package com.horoscope.management.core;

import com.horoscope.management.common.core.ZodiacSign;


public class BhavaDetails {

  private ZodiacSign zodiacSign;

  private int bhava;

  private double start;

  private double mid;

  private double end;

  private double length;
  
  public BhavaDetails() {
  }

  public BhavaDetails(ZodiacSign zodiacSign, int bhava, double start, double mid, double end,
      double length) {
    super();
    this.zodiacSign = zodiacSign;
    this.bhava = bhava;
    this.start = start;
    this.mid = mid;
    this.end = end;
    this.length = length;
  }

  public ZodiacSign getZodiacSign() {
    return zodiacSign;
  }

  public void setZodiacSign(ZodiacSign zodiacSign) {
    this.zodiacSign = zodiacSign;
  }

  public int getBhava() {
    return bhava;
  }

  public void setBhava(int bhava) {
    this.bhava = bhava;
  }

  public double getStart() {
    return start;
  }

  public void setStart(double start) {
    this.start = start;
  }

  public double getMid() {
    return mid;
  }

  public void setMid(double mid) {
    this.mid = mid;
  }

  public double getEnd() {
    return end;
  }

  public void setEnd(double end) {
    this.end = end;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

}
