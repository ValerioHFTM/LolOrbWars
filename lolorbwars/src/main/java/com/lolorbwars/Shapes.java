package com.lolorbwars;

public enum Shapes {
  TRIANGLE(3),
  PENTAGON(5),
  HEXAGON(6),
  HEPTAGON(7),
  OCTAGON(8),
  NONAGON(9),
  DECAGON(10);

  private final int sides;

  Shapes(int sides) {
    this.sides = sides;
  }
}
