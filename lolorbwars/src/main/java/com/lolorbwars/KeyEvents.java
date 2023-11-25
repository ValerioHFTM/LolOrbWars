package com.lolorbwars;

import java.io.IOException;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class KeyEvents {

  BorderPane battlefieldNode;

  public KeyEvents(BorderPane battlefieldNode) {
    this.battlefieldNode = battlefieldNode;
  }

  public void doKeys(KeyEvent event) throws IOException {
    if (event.getCode() == KeyCode.SPACE) {
      // switchToSecondary();
      draw();
      System.out.println("it seems to work " + this.battlefieldNode);
    }
  }

  // public void switchToSecondary() throws IOException {
  //   // LolOrbWars.setSceneRoot("secondary");
  // }

  public void draw() {
    double centerX = 150; // X center position
    double centerY = 150; // Y center position
    double size = 50; // Side length of the hexagon

    // Create a hexagon using a Polygon
    Polygon hexagon = new Polygon();
    for (int i = 0; i < 6; i++) {
      double angle = 2.0 * Math.PI / 6 * i;
      double x = centerX + size * Math.cos(angle);
      double y = centerY + size * Math.sin(angle);
      hexagon.getPoints().addAll(x, y);
    }
    hexagon.setFill(Color.GREEN); // Fill color of the hexagon
    battlefieldNode.getChildren().add(hexagon);
  }
}
