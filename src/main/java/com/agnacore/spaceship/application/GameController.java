package com.agnacore.spaceship.application;

import com.agnacore.spaceship.game.Enemy;
import com.agnacore.spaceship.game.Player;
import com.agnacore.spaceship.game.Ship;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    @FXML
    private AnchorPane gamePane;
    private Stage stage;
    // Track all ships in the game(?)
    private List<Ship> ships;

    public GameController() {}

    // The FXML fields are populated before this is called.
    @FXML
    public void initialize() {
        ships = new ArrayList<Ship>();
        ships.add(new Player(0, 0, (int)gamePane.getPrefWidth() / 2, (int)gamePane.getPrefHeight() / 2, 45, 45));
        ships.add(new Enemy(0, 0, 0, 0 ,45, 45));
        // TEMP Draw all ships
        System.out.println("Hello");
        for (Ship ship : ships) {
            ship.getSprite().setTranslateX(ship.getPosition()[0]);
            ship.getSprite().setTranslateY(ship.getPosition()[1]);
            gamePane.getChildren().add(ship.getSprite());
        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
