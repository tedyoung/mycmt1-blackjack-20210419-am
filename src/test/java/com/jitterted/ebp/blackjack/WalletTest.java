package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {

  @Test
  public void newWalletIsEmpty() throws Exception {
    Wallet wallet = new Wallet();

    assertThat(wallet.isEmpty())
        .isTrue();
  }

  @Test
  public void newWalletAddMoneyIsNotEmpty() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(10);

    assertThat(wallet.isEmpty())
        .isFalse();
  }

  @Test
  public void newWalletHasZeroBalance() throws Exception {
    Wallet wallet = new Wallet();

    assertThat(wallet.balance())
        .isZero();
  }

  @Test
  public void newWalletAdd7ThenBalanceIs7() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(7);

    assertThat(wallet.balance())
        .isEqualTo(7);
  }

  @Test
  public void newWalletAdd8AndAdd9ThenBalanceIs17() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(8);
    wallet.addMoney(9);

    assertThat(wallet.balance())
        .isEqualTo(8 + 9);

  }

  @Test
  public void addNegativeMoneyThrowsException() throws Exception {
    Wallet wallet = new Wallet();

    assertThatThrownBy(() -> {
      wallet.addMoney(-1);
    }).isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  public void addZeroThrowsException() throws Exception {
    Wallet wallet = new Wallet();

    assertThatThrownBy(() -> {
      wallet.addMoney(0);
    }).isInstanceOf(IllegalArgumentException.class);

  }
}
