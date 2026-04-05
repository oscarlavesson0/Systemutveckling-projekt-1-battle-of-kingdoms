package Com.bok;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new Label("JavaFX fungerar!"), 300, 200));
        stage.setTitle("JavaFX Test");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
