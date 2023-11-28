package com.lolorbwars;

import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Draw {

  BorderPane battlefieldNode;
  DropShadow shadow;

  // public void form() {}

  public void form(BorderPane battlefieldNode, int a) {
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
    hexagon.setEffect(useShadow(shadow));
    battlefieldNode.getChildren().add(hexagon);
  }

  // pimp the effects of the player polygons
  public DropShadow useShadow(DropShadow shadow) {
    shadow = new DropShadow();
    shadow.setRadius(10); // Set the radius of the shadow
    shadow.setOffsetX(5); // Set the X offset of the shadow
    shadow.setOffsetY(5); // Set the Y offset of the shadow
    shadow.setColor(Color.DARKGRAY); // Set the color of the shadow
    return shadow;
  }
}
