package com.lolorbwars;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class Battlefield {

  @FXML
  private BorderPane battlefieldNode;

  @FXML
  public void initialize() {
    battlefieldNode.requestFocus();
    System.out.println("Initialization successfull");
  }

  // key event is not happening... no idea why... lets find out later
  @FXML
  private void handleKeyPressed(KeyEvent event) throws IOException {
    if (event.getCode() == KeyCode.SPACE) {
      switchToSecondary();
      System.out.println("it seems not to work");
    }
  }

  @FXML
  private void switchToSecondary() throws IOException {
    LolOrbWars.setSceneRoot("secondary");
  }
}
