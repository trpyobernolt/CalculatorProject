package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OperandButton extends Button {

    OperandButton(String s) {
        super(s);
        setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Label label = Main.getLabel();
                Working.expression.append(" ").append(Working.working);
                Working.working = "";
                Working.expression.append(" ").append(s);
                label.setText("0");
            }
        });
    }
}
