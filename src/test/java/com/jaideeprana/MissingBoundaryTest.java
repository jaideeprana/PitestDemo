package com.jaideeprana;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingBoundaryTest {
  @Test
  void shouldReturnFooWhenGiven1() {
    assertEquals("foo", MissingBoundary.foo(1));
  }

  @Test
  void shouldReturnBarWhenGivenMinus1() {
    assertEquals("bar", MissingBoundary.foo(-1));
  }
}
