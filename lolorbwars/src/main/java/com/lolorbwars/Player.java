/*
 * ----------------------------------------------------------------
 * Project:       LoLOrbWars
 * Authors:       Valerio Bottinelli, Mateusz Kurowski
 * Release Date:  xx.xx.2024
 * File Name:     MenuControll.java
 * ----------------------------------------------------------------
 * File Information:
 *
 *
 *
 *
 * ----------------------------------------------------------------
 */
package com.lolorbwars;

import java.util.HashMap;

// This is the player
public class Player {

  private Shapes form;
  private HashMap<Integer, Integer> playerCoordinates = new HashMap<>();

  public Player(Integer x, Integer y) {
    playerCoordinates.put(x, y);
  }

  public void setForm(Shapes newForm) {
    this.form = newForm;
  }

  public Shapes getForm() {
    return form;
  }
}
