package sample;

public class MismatchedOperatorsException extends Exception {
    MismatchedOperatorsException(String s) {
        super (s);
    }
    MismatchedOperatorsException(){
        super("Illegal amount of operators");
    }
}
