package BehavioralPatterns.TheClassics.Interpreter.BasicExpressionEvaluation;

import java.util.List;

public class Context {

    private final int number;
    private final List<String> stringList;

    public Context(int number, String... strings) {
        this.number = number;
        this.stringList = List.of(strings);
    }

    public int getNumber() {
        return number;
    }

    public List<String> getStrings() {
        return stringList;
    }
}
