package com.lolorbwars;

import java.io.IOException;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class KeyEvents {

  BorderPane battlefieldNode;
  DropShadow shadow;
  Draw draw = new Draw();

  public KeyEvents(BorderPane battlefieldNode) {
    this.battlefieldNode = battlefieldNode;
  }

  public void doKeys(KeyEvent event) throws IOException {
    if (event.getCode() == KeyCode.SPACE) {
      Battlefield.switchToMenu();
      System.out.println("Space");
      draw.form(battlefieldNode);
      System.out.println("it seems to work " + this.battlefieldNode);
      // switchToMenu();
    }
  }
}
