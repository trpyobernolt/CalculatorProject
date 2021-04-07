package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    private static Label label = new Label(Working.working);

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Calculator");
        Pane display = new VBox();
        InteractionPanel numbers = new InteractionPanel();
        display.getChildren().addAll(label, numbers);
        Scene scene = new Scene(display, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static Label getLabel() {
        return label;
    }
}
