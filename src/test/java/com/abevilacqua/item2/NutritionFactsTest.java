package com.abevilacqua.item2;

import com.abevilacqua.item2_builder.NutritionFacts;
import org.junit.Assert;
import org.junit.Test;

public class NutritionFactsTest {

  @Test
  public void shouldCreateNewNutritionViaBuilder() {
    NutritionFacts cocaCola = new NutritionFacts
        .Builder(240, 8)
        .calories(100)
        .sodium(35)
        .carbohydrate(27)
        .build();

    Assert.assertEquals(240, cocaCola.getServingSize());
    Assert.assertEquals(8, cocaCola.getServings());
    Assert.assertEquals(100, cocaCola.getCalories());
    Assert.assertEquals(35, cocaCola.getSodium());
    Assert.assertEquals(27, cocaCola.getCarbohydrate());
  }
}
