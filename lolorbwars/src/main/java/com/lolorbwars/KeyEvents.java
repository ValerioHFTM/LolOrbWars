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

import java.io.IOException;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class KeyEvents {

  BorderPane battlefieldNode;
  DropShadow shadow;
  Draw draw;
  Player p1, p2;
  Shapes shape;

  public KeyEvents(
    Draw draw,
    BorderPane battlefieldNode,
    Player p1,
    Player p2
  ) {
    this.p1 = p1;
    this.p2 = p2;
    this.battlefieldNode = battlefieldNode;
    this.draw = draw;
  }

  public void doKeys(KeyEvent event) throws IOException {
    if (event.getCode() == KeyCode.SPACE) {
      MenuControll.setPlayer(p1, p2);
      Battlefield.switchToMenu();
      System.out.println("Space");
      System.out.println("it seems to work " + this.battlefieldNode);
      // switchToMenu();
    }
    if (event.getCode() == KeyCode.ENTER) {
      System.out.println("Doublecheck PlayerNumber: " + p1.getIndex());
      System.out.println("Doublecheck PlayerForm: " + p1.getForm());
      draw.form(battlefieldNode, p1, p1.getForm());
      System.out.println("Enter");
    }
  }
}
