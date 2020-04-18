package BehavioralPatterns.GoF.Interpreter.MoreAdvancedEval;

public class AndExpr implements Expr {

    private Expr expr1;
    private Expr expr2;

    public AndExpr(Expr expr1, Expr expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Context context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
