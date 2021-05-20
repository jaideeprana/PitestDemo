package com.jaideeprana;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

class MyopicMockistTest {
  Collaborator mockCollaborator = mock(Collaborator.class);
  @Test
  void shouldPerformActionWhenGivenTrue() {
    MyopicMockist.foo(mockCollaborator,true);
    verify(mockCollaborator).performAction();
  }

  @Test
  void shouldNotPerformActionWhenGivenFalse() {
    MyopicMockist.foo(mockCollaborator,false);
    verify(mockCollaborator, never()).performAction();
  }
}
