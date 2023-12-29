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

import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

// import javafx.scene.shape.Shape;

public class Draw {

  // private BorderPane battlefieldNode;
  private DropShadow shadow;
  private Player p1, p2;
  private int x, y;

  // public void form() {}
  public Draw(Player p1, Player p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  public void form(BorderPane battlefieldNode, Player p, Shapes shapes) {
    x = p.getPlayerCoordinates("x");
    y = p.getPlayerCoordinates("y");

    double centerX = x; // X center position
    double centerY = y; // Y center position
    System.out.println(
      "Player index: " +
      p.getIndex() +
      "\nPlayer Coordinates: (x:" +
      x +
      " y:" +
      y +
      "\nPlayer Shape: " +
      shapes
    );
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
