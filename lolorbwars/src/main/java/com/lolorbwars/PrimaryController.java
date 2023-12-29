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
import javafx.fxml.FXML;

public class PrimaryController {

  @FXML
  private void switchToBattlefield() throws IOException {
    LolOrbWars.setSceneRoot("battlefield");
  }
}
