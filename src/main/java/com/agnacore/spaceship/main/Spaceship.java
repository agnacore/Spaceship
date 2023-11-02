package com.agnacore.spaceship.main;

import com.agnacore.spaceship.application.GameController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class Spaceship extends Application {

	public static void main(String[] args)
	{
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(GameController.class.getClassLoader().getResource("game_view.fxml"));
		primaryStage.setScene(new Scene(loader.load()));
		GameController gameController = loader.getController();
		gameController.setStage(primaryStage);
		primaryStage.show();
	}

}
