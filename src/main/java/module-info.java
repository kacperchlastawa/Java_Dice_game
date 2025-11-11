module pl.dice_game.java_dice_game {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens pl.dice_game.java_dice_game to javafx.fxml;
    exports pl.dice_game.java_dice_game;
}