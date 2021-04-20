package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SuitTest {

  @Test
  public void heartsAreRed() throws Exception {
    Suit hearts = Suit.HEARTS;

    assertThat(hearts.isRed())
        .isTrue();
  }
}