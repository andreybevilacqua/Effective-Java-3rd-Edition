package com.abevilacqua.item2;

import com.abevilacqua.item2_builder.Calzone;
import com.abevilacqua.item2_builder.NutritionFacts;
import com.abevilacqua.item2_builder.NyPizza;
import com.abevilacqua.item2_builder.Pizza;
import org.junit.Assert;
import org.junit.Test;

import static com.abevilacqua.item2_builder.NyPizza.Size.SMALL;
import static com.abevilacqua.item2_builder.Pizza.Topping.*;
import static org.junit.Assert.*;

public class NutritionFactsTest {

  @Test
  public void shouldCreateNewNutritionViaBuilder() {
    NutritionFacts cocaCola = new NutritionFacts
        .Builder(240, 8)
        .calories(100)
        .sodium(35)
        .carbohydrate(27)
        .build();

    assertEquals(240, cocaCola.getServingSize());
    assertEquals(8, cocaCola.getServings());
    assertEquals(100, cocaCola.getCalories());
    assertEquals(35, cocaCola.getSodium());
    assertEquals(27, cocaCola.getCarbohydrate());
  }

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
