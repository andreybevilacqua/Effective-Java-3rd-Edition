package com.abevilacqua.item3_singleton;

public class Elvis1 {

  public static final Elvis1 INSTANCE = new Elvis1();

  private Elvis1(){}

  public void doSomething(){}

  // In case of serialization/deserialization, to preserve singleton property.
  private Object readResolve() {
    return INSTANCE;
  }
}
