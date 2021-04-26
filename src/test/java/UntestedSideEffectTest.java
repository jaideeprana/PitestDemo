import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UntestedSideEffectTest {
  @Test
  public void shouldFailWhenGivenFalse() {
    assertEquals("FAIL", UntestedSideEffect.foo(false));
  }

  @Test
  public void shouldBeOkWhenGivenTrue() {
    assertEquals("OK", UntestedSideEffect.foo(true));
  }
}
