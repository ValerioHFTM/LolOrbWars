package com.lolorbwars;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class MenuControll {

  private static boolean newGame = true;
  static Player p1, p2;
  @FXML
  private Button startResume;

  @FXML
  private ChoiceBox<Shapes> P1_Shape;

  public void initialize() {

    P1_Shape.getItems().addAll(Shapes.values());
    // Add default shape to player one
    P1_Shape.setValue(Shapes.PENTAGON);

    P1_Shape
        .getSelectionModel()
        .selectedItemProperty()
        .addListener((observable, oldValue, newForm) -> {
          // Handle selection change here
          System.out.println("Selected: " + newForm);
          p1.setForm(newForm);
        });
  }

  // @FXML
  // private void switchToPrimary() throws IOException {
  // this.newGame = false;
  // LolOrbWars.setSceneRoot("primary");
  // }

  @FXML
  private void switchToBattlefield() throws IOException {

    newGame = false;
    LolOrbWars.setSceneRoot("battlefield");

  }

  public static boolean isNewGame() {
    return newGame;
  }

  public static void setPlayer(Player p1, Player p2) {
    MenuControll.p1 = p1;
    MenuControll.p2 = p2;
  }
}
