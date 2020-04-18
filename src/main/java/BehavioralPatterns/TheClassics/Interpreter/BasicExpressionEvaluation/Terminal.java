package BehavioralPatterns.TheClassics.Interpreter.BasicExpressionEvaluation;

public class Terminal implements AbstractExpression {

    private final int number;
    private final String string;

    public Terminal(int number, String string) {
        this.number = number;
        this.string = string;
    }

    @Override
    public boolean interpret(Context context) {
        return number >= context.getNumber() && context.getStrings().contains(string);
    }
}
