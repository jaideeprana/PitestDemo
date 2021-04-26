package com.jaideeprana;

public class UntestedSideEffect {
  public static String foo(boolean b) {
    if (b) {
      performVitallyImportantBusinessFunction();
      return "OK";
    }

    return "FAIL";
  }

  private static void performVitallyImportantBusinessFunction() {
    SomeImportantBusinessCall someImportantBusinessCall = new SomeImportantBusinessCall();

    if (someImportantBusinessCall.save() == 1) {
      System.out.println("Info saved");
    }
  }
}
