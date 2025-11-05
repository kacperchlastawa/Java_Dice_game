module pl.dice_game.java_dice_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.dice_game.java_dice_game to javafx.fxml;
    exports pl.dice_game.java_dice_game;
}