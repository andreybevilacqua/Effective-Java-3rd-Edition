package com.abevilacqua.item6_avoidCreateUnnecessaryObjects;

import java.util.regex.Pattern;

public class RomanNumerals {

  // Part of class initialization and cached.
  private static final Pattern ROMAN = Pattern.compile("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

  // Performance can be greatly improved
  static boolean isRomanNumeral(String s) {
    return s.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
  }

  // Reusing expensive object for improved performance
  static boolean isRomanNumeral2(String s) {
    return ROMAN.matcher(s).matches();
  }
}
