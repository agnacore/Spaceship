package com.agnacore.spaceship.application;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class GameController {
    @FXML
    private Canvas gameCanvas;
    private Stage stage;

    public GameController() {}

    // The FXML fields are populated before this is called.
    @FXML
    public void initialize() {

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
