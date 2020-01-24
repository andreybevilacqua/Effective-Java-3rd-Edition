package com.abevilacqua.item5_preferDependencyInjection;

import java.util.List;

import static java.util.Collections.EMPTY_LIST;

// Inappropriate use of singletion - inflexible and untestable
public class SpellCheckerSingleton {

  private final Lexicon dictionary = new Lexicon();

  private static final SpellCheckerSingleton INSTANCE = new SpellCheckerSingleton();

  public SpellCheckerSingleton getInstance() { return INSTANCE; }

  private SpellCheckerSingleton(){} // Noninstantiable

  public static boolean isValid(String word) {
    // ...
    return true;
  }

  public List<String> suggestions(String type) {
    // ...
    return EMPTY_LIST;
  }
}
