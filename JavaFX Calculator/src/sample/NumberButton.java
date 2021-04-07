package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NumberButton extends Button {

    NumberButton(String s) {
        super(s);
        setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Label label = Main.getLabel();
                if (Working.working.equals("0")) {
                    if(!s.equals(".")) {
                        Working.working = s;
                    }
                }
                else {
                    Working.working += s;
                }
                label.setText(Working.working);
            }
        });
    }
}
