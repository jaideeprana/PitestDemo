package com.jaideeprana;

public class MyopicMockist {
  public static String foo(Collaborator c, boolean b) {
    if ( b ) {
      return c.performAction();
    }

    return "FOO";
  }
}
