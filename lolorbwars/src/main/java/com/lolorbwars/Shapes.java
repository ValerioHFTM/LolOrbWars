/*
 * ----------------------------------------------------------------
 * Project:       LoLOrbWars
 * Authors:       Valerio Bottinelli, Mateusz Kurowski
 * Release Date:  xx.xx.2024
 * File Name:     Shapes.java
 * ----------------------------------------------------------------
 * File Information:
 * We define the shapes of the players wit this emumeration
 * Those shapes can later be chosen in the main menu.
 * ----------------------------------------------------------------
 * Communication with:
 *
 */
package com.lolorbwars;

public enum Shapes {
  TRIANGLE(3),
  PENTAGON(5),
  HEXAGON(6),
  HEPTAGON(7),
  OCTAGON(8),
  NONAGON(9),
  DECAGON(10);

  // private final int sides;

  Shapes(int sides) {
    // this.sides = sides;
  }
}
