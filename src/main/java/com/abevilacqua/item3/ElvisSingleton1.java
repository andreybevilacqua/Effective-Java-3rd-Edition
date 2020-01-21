package com.abevilacqua.item3;

public class ElvisSingleton1 {

  public static final ElvisSingleton1 INSTANCE = new ElvisSingleton1();

  private ElvisSingleton1(){}

  public void doSomething(){}

  // In case of serialization/deserialization, to preserve singleton property.
  private Object readResolve() {
    return INSTANCE;
  }
}
