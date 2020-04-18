package BehavioralPatterns.GoF.Interpreter.MoreAdvancedEval;

public class ExpressionBuilder {

    /*
        More complicated rules engine
     */
    public Expr andOrOr(Expr expr1, Expr expr2, Expr expr3, Expr expr4) {

        return new AndExpr(expr1,
                new OrExpr(expr2,
                        new OrExpr(expr3, expr4)));
    }

    public Expr OrAndNot(Expr expr1, Expr expr2, Expr expr3) {
        return new OrExpr(expr1,
                new AndExpr(expr2,
                        new NotExpr(expr3)));

    }
}
