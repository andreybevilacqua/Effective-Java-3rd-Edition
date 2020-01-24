package com.abevilacqua.item5_preferDependencyInjection;

import java.util.List;

import static java.util.Collections.EMPTY_LIST;
import static java.util.Objects.requireNonNull;

// Dependency injection provides flexibility and testability
public class SpellChecker {

  private final Lexicon dictionary;

  public SpellChecker(Lexicon dictionary) {
    this.dictionary = requireNonNull(dictionary);
  }

  public static boolean isValid(String word) {
    // ...
    return true;
  }

  public List<String> suggestions(String type) {
    // ...
    return EMPTY_LIST;
  }
}
