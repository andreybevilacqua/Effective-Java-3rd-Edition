package com.abevilacqua.item2;

import com.abevilacqua.item2_builder.Calzone;
import com.abevilacqua.item2_builder.NyPizza;
import org.junit.Test;

import static com.abevilacqua.item2_builder.NyPizza.Size.SMALL;
import static com.abevilacqua.item2_builder.Pizza.Topping.*;
import static org.junit.Assert.*;

public class PizzaTest {

  @Test
  public void shouldCreateNyPizzaFromGenericConstructorTest() {
    NyPizza nyPizza = new NyPizza
        .Builder(SMALL)
        .addTopping(SAUSAGE)
        .addTopping(ONION)
        .build();
    assertEquals(SMALL, nyPizza.getSize());
    assertTrue(nyPizza.getToppings().contains(SAUSAGE));
    assertTrue(nyPizza.getToppings().contains(ONION));
  }

  @Test
  public void shouldCreateCalzoneFromGenericConstructorTest() {
    Calzone calzone = new Calzone
        .Builder()
        .sauceInside()
        .addTopping(HAM)
        .build();
    assertTrue(calzone.isSauceInside());
    assertTrue(calzone.getToppings().contains(HAM));
    assertFalse(calzone.getToppings().contains(ONION));
  }
}
