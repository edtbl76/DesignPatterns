package BehavioralPatterns.TheClassics.Interpreter.MoreAdvancedEval;

public class Terminal implements Expr {

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
