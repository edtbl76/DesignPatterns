package BehavioralPatterns.GoF.Interpreter.BasicExpressionEvaluation;

public class NotExpr implements AbstractExpression {

    private AbstractExpression expr;

    public NotExpr(AbstractExpression expr) {
        this.expr = expr;
    }

    @Override
    public boolean interpret(Context context) {
        return !expr.interpret(context);
    }
}
