package BehavioralPatterns.GoF.Interpreter.BasicExpressionEvaluation;

public class ExpressionBuilder {

    public AbstractExpression build(AbstractExpression expr1, String operator, AbstractExpression expr2) {

        switch(operator.toLowerCase()) {
            case "or":
                return new OrExpr(expr1, expr2);
            case "and":
                return new AndExpr(expr1, expr2);
            case "not":
                return new NotExpr(expr1);
            default:
                System.out.println("Unsupported Operator");
                return null;
        }
    }
}
