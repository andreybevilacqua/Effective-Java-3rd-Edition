package com.abevilacqua.item3_singleton;

public class Elvis2 {

  private static final Elvis2 INSTANCE = new Elvis2();

  private Elvis2(){}

  public static Elvis2 getInstance(){return INSTANCE;}

  public void doSomething(){}

  // In case of serialization/deserialization, to preserve singleton property.
  private Object readResolve() {
    return INSTANCE;
  }
}
