package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Controller {
    public Label world;
    public Button hello;
    public GridPane okvir;

    public void Submit(ActionEvent actionEvent) {
        world.setText("Hello World!");
       // world.setFont(Font.font("Arial", FontWeight.BOLD, 32));
        world.setFont(Font.font("Arial", FontPosture.ITALIC, 32));
        okvir.setStyle("-fx-background-color: LIGHTSALMON");
    }
}
