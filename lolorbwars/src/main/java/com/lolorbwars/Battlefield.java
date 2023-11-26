package com.lolorbwars;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class Battlefield {

  @FXML
  private BorderPane battlefieldNode;

  KeyEvents keysEvents;

  @FXML
  public void initialize() {
    battlefieldNode.requestFocus();
    keysEvents = new KeyEvents(battlefieldNode);
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
}
