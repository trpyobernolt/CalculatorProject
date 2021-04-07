package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ClearButton extends Button {

    ClearButton(String s) {
        super(s);
        setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Label label = Main.getLabel();
                Working.working = "0";
                Working.expression.setLength(0);
                label.setText(Working.working);
                }
            });
    }
}
