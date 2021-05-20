package com.jaideeprana;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UntestedSideEffectTest {
  @Test
  void shouldFailWhenGivenFalse() {
    assertEquals("FAIL", UntestedSideEffect.foo(false));
  }

  @Test
  void shouldBeOkWhenGivenTrue() {
    assertEquals("OK", UntestedSideEffect.foo(true));
  }
}
