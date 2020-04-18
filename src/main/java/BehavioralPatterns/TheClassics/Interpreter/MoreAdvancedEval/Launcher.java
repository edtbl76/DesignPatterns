package BehavioralPatterns.TheClassics.Interpreter.MoreAdvancedEval;

public class Launcher {

    public static void main(String[] args) {

        Context context = new Context(10, "hello", "world");

        Expr expr1 = new Terminal(1, "hi");
        Expr expr2 = new Terminal(10, "hello");
        Expr expr3 = new Terminal(100, "world");
        Expr expr4 = new Terminal(1000, "planet");

        ExpressionBuilder builder = new ExpressionBuilder();

        // expression evals
        System.out.println("Expression 1 and any other?: " +
                builder.andOrOr(expr1, expr2, expr3, expr4).interpret(context));
        System.out.println("Expression 2 and any other?: " +
                builder.andOrOr(expr2, expr1, expr3, expr4).interpret(context));
        System.out.println("Expression 3 and any other?: " +
                builder.andOrOr(expr3, expr2, expr1, expr4).interpret(context));
        System.out.println("Expression 4 and any other?: " +
                builder.andOrOr(expr4, expr2, expr3, expr1).interpret(context));

        System.out.println("Expression 1 or (2 but not 3):" + builder.OrAndNot(expr1, expr2, expr3).interpret(context));
        System.out.println("Expression 2 or (3 but not 4):" + builder.OrAndNot(expr2, expr3, expr4).interpret(context));
    }
}
