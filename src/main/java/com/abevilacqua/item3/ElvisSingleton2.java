package com.abevilacqua.item3;

public class ElvisSingleton2 {

  private static final ElvisSingleton2 INSTANCE = new ElvisSingleton2();

  private ElvisSingleton2(){}

  public static ElvisSingleton2 getInstance(){return INSTANCE;}

  public void doSomething(){}

  // In case of serialization/deserialization, to preserve singleton property.
  private Object readResolve() {
    return INSTANCE;
  }
}
