package com.agnacore.spaceship.application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    private Stage stage;

    @FXML
    public void handleGameButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(GameController.class.getClassLoader().getResource("game_view.fxml"));
        Stage gameStage = new Stage();
        gameStage.setScene(new Scene(loader.load()));
        GameController gameController = loader.getController();
        gameController.setStage(gameStage);
        gameStage.show();
        stage.close();
    }

    @FXML
    public void handleScoresButtonClicked(ActionEvent event) { }

    @FXML
    public void handleExitButtonClicked(ActionEvent event) {
        Platform.exit();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
