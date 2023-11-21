package com.lolorbwars;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

  @FXML
  private void switchToBattlefield() throws IOException {
    LolOrbWars.setSceneRoot("battlefield");
  }
}
