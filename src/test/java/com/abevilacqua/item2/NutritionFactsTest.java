package com.abevilacqua.item2;

import com.abevilacqua.item2_builder.NutritionFacts;
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
  }
}
