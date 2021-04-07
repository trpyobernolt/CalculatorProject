package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class EqualsButton extends Button {

    EqualsButton(String s) {
        super(s);
        setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Label label = Main.getLabel();
                Working.expression.append(" ").append(Working.working);
                System.out.println("Expression is: " + Working.expression);
                ReversePolish decrypt = new ReversePolish();
                ArrayList<String> reverse = decrypt.convert(Working.expression.toString().split(" "));
                System.out.println("Reverse Polish notation is: " + reverse.toString());
                String[] arr = new String[reverse.size()];
                for(int i = 0; i < reverse.size(); i++) {
                    arr[i] = reverse.get(i);
                }
                Double answer = null;
                try {
                    answer = decrypt.compute(arr);
                    label.setText(answer.toString());
                    Working.expression.setLength(0);
                    Working.expression.trimToSize();
                    Working.expression.append(" " + answer);
                } catch (MismatchedOperatorsException e) {
                    e.getMessage();
                    label.setText("ERROR");
                    Working.working = "0";
                    Working.expression.trimToSize();
                    Working.expression.setLength(0);
                }
                System.out.print("Final answer is: " + answer);
            }
        });
    }
}
