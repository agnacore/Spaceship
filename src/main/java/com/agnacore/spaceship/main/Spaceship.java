package com.agnacore.spaceship.main;

import com.agnacore.spaceship.application.GameController;
import com.agnacore.spaceship.application.MainMenuController;
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
		FXMLLoader loader = new FXMLLoader(MainMenuController.class.getClassLoader().getResource("main_menu.fxml"));
		primaryStage.setScene(new Scene(loader.load()));
		MainMenuController mainMenuController = loader.getController();
		mainMenuController.setStage(primaryStage);
		primaryStage.show();
	}

}
