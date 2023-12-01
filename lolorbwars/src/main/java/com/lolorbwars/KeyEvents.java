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
  Player p1, p2;

  public KeyEvents(BorderPane battlefieldNode, Player p1, Player p2) {
    this.p1 = p1;
    this.p2 = p2;
    this.battlefieldNode = battlefieldNode;
  }

  public void doKeys(KeyEvent event) throws IOException {
    switch (event.getCode()) {
      case SPACE:
        Battlefield.switchToMenu();
        System.out.println("Space");
        System.out.println("it seems to work " + this.battlefieldNode);
        break;
      case ENTER:
        draw.form(battlefieldNode, p1);
        System.out.println("Enter");
        break;
      default:
        break;
    }
  }
}
