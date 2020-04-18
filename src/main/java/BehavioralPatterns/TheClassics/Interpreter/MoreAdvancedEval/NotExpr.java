package BehavioralPatterns.TheClassics.Interpreter.MoreAdvancedEval;

public class NotExpr implements Expr {

    private Expr expr;

    public NotExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public boolean interpret(Context context) {
        return !expr.interpret(context);
    }
}
