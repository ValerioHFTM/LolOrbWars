/*
 * ----------------------------------------------------------------
 * Project:       LoLOrbWars
 * Authors:       Valerio Bottinelli, Mateusz Kurowski
 * Release Date:  xx.xx.2024
 * File Name:     Battlefield.java
 * ----------------------------------------------------------------
 * File Information:
 * This is the Main entry point of the Programm.
 * We create the
 *
 *
 * ----------------------------------------------------------------
 */

package com.lolorbwars;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class Battlefield {

  static Player p1;
  static Player p2;

  @FXML
  private BorderPane battlefieldNode;

  KeyEvents keysEvents;

  @FXML
  public void initialize() {
    battlefieldNode.requestFocus();
    keysEvents = new KeyEvents(battlefieldNode, p1, p2);
    if (true == MenuControll.isNewGame()) {
      System.out.println("It is a new game");
    } else {
      System.out.println("The game continues");
    }
    System.out.println("Battlefield Initialization successfull");
  }

  @FXML
  public void handleKeyPressed(KeyEvent event) throws IOException {
    System.out.println("Key pressed: ");
    keysEvents.doKeys(event);
  }

  @FXML
  public static void switchToMenu() throws IOException {
    LolOrbWars.setSceneRoot("menu");
  }

  public static void setPlayer(Player p1, Player p2) {
    Battlefield.p1 = p1;
    Battlefield.p2 = p2;
  }
}
