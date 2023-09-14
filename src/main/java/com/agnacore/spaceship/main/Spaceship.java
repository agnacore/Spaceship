package com.agnacore.spaceship.main;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;


public class Spaceship extends Application {

	public static void main(String[] args)
	{
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// start the game
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setContentText("Hello, world!");
		alert.showAndWait();
	}

}
