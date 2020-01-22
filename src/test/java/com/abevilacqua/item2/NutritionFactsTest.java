package com.abevilacqua.item2;

import com.abevilacqua.item2_builder.NutritionFacts;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
