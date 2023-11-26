package com.lolorbwars;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class MenuControll {

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
      .addListener((observable, oldValue, newValue) -> {
        // Handle selection change here
        System.out.println("Selected: " + newValue);
      });
  }

  @FXML
  private void switchToPrimary() throws IOException {
    LolOrbWars.setSceneRoot("primary");
  }
}
