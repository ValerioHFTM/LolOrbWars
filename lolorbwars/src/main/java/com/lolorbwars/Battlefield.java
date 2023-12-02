package com.lolorbwars;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class Battlefield {

  @FXML
  private BorderPane battlefieldNode;

  KeyEvents keysEvents;
  static Player p1;
  static Player p2;

  Draw draw;

  @FXML
  public void initialize() {
    p1 = new Player(1, Color.RED, 50, 600);
    p2 = new Player(2, Color.BLUE, 750, 600);
    draw = new Draw(p1, p2);
    battlefieldNode.requestFocus();
    keysEvents = new KeyEvents(draw, battlefieldNode, p1, p2);
    if (true == MenuControll.isNewGame()) {
      System.out.println("New Game has started");
    } else {
      System.out.println("The game continues");
      System.out.println("Battlefield Initialization successfull");

    }
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
}
