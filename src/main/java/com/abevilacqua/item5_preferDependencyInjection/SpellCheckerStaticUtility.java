package com.abevilacqua.item5_preferDependencyInjection;

import java.util.List;

import static java.util.Collections.EMPTY_LIST;

// Inappropriate use of static utility - inflexible and untestable
public class SpellCheckerStaticUtility {

  private static final Lexicon dictionary = new Lexicon();

  private SpellCheckerStaticUtility(){} // Noninstantiable

  public static boolean isValid(String word) {
    // ...
    return true;
  }

  public List<String> suggestions(String type) {
    // ...
    return EMPTY_LIST;
  }
}
