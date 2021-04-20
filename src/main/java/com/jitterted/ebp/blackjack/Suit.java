package com.jitterted.ebp.blackjack;

public enum Suit {
  SPADES("♠"),
  DIAMONDS("♦"),
  HEARTS("♥"),
  CLUBS("♣");

  private final String symbol;

  public String symbol() {
    return symbol;
  }

  Suit(String symbol) {
    this.symbol = symbol;
  }
}