package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InteractionPanel extends VBox {
    public InteractionPanel() {
        init();
    }

    private void init() {
        NumberButton seven = new NumberButton("7");
        NumberButton eight = new NumberButton("8");
        NumberButton nine = new NumberButton("9");
        NumberButton four = new NumberButton("4");
        NumberButton five = new NumberButton("5");
        NumberButton six = new NumberButton("6");
        NumberButton one = new NumberButton("1");
        NumberButton two = new NumberButton("2");
        NumberButton three = new NumberButton("3");
        NumberButton zero = new NumberButton("0");
        NumberButton decimal = new NumberButton(".");
        OperandButton divide = new OperandButton("/");
        OperandButton multiply = new OperandButton("*");
        OperandButton subtract = new OperandButton("-");
        OperandButton plus = new OperandButton("+");
        EqualsButton equals = new EqualsButton("=");
        ClearButton clear = new ClearButton("CLEAR ALL");

        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        HBox row4 = new HBox();
        HBox row5 = new HBox();

        row1.getChildren().addAll(clear, divide);
        row2.getChildren().addAll(seven,eight,nine,multiply);
        row3.getChildren().addAll(four,five,six,subtract);
        row4.getChildren().addAll(one,two,three,plus);
        row5.getChildren().addAll(zero,decimal,equals);

        this.getChildren().addAll(row1,row2,row3,row4,row5);
    }
}
