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

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class LolOrbWars extends Application {

  private static Scene scene;

  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage stage) throws IOException {
    scene = new Scene(loadFXML("menu"), 1200, 800);
    stage.setScene(scene);
    stage.show();
  }

  static void setSceneRoot(String fxml) throws IOException {
    scene.setRoot(loadFXML(fxml));
  }

  private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(
      LolOrbWars.class.getResource("/" + fxml + ".fxml")
    );
    return fxmlLoader.load();
  }
}
