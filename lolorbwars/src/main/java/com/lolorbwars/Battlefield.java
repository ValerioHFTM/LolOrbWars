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
import javafx.scene.paint.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.logging.LogManager;

public class Battlefield {

  @FXML
  private BorderPane battlefieldNode;

  KeyEvents keysEvents;
  static Player p1;
  static Player p2;

  Draw draw;
  // Logger initialize
  public static final Logger LOG = System.getLogger(Battlefield.class.getSimpleName());

  @FXML
  public void initialize() {
    // here i want to output something with my logger....
    p1 = new Player(1, Color.RED, 50, 600);
    p2 = new Player(2, Color.BLUE, 750, 600);
    draw = new Draw(p1, p2);
    battlefieldNode.requestFocus();
    keysEvents = new KeyEvents(draw, battlefieldNode, p1, p2);
    if (true == MenuControll.isNewGame()) {
      LOG.log(Level.INFO, "new game has started");
      // System.out.println("New Game has started");
    } else {
      System.out.println("The game continues");
      System.out.println("Battlefield Initialization successfull");
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
    MenuControll.setPlayer(p1, p2);
    LolOrbWars.setSceneRoot("menu");
  }

  public static void setPlayer(Player p1, Player p2) {
    Battlefield.p1 = p1;
    Battlefield.p2 = p2;
  }
}
