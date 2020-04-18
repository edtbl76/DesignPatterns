package BehavioralPatterns.TheClassics.Interpreter.BasicExpressionEvaluation;

public class OrExpr implements AbstractExpression {

    private AbstractExpression expr1;
    private AbstractExpression expr2;

    public OrExpr(AbstractExpression expr1, AbstractExpression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Context context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
