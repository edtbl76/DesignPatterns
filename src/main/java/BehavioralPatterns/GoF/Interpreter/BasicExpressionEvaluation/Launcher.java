package BehavioralPatterns.GoF.Interpreter.BasicExpressionEvaluation;

public class Launcher {

    public static void main(String[] args) {

        Context context = new Context(10, "hello", "world");

        AbstractExpression expr1 = new Terminal(1, "hi");
        AbstractExpression expr2 = new Terminal(10, "hello");
        AbstractExpression expr3 = new Terminal(100, "world");
        AbstractExpression expr4 = new Terminal(1000, "planet");

        ExpressionBuilder builder = new ExpressionBuilder();

        System.out.println("Expression 1 has a match: " + expr1.interpret(context));
        System.out.println("Expression 2 has a match: " + expr2.interpret(context));
        System.out.println("Expression 3 has a match: " + expr3.interpret(context));
        System.out.println("Expression 4 has a match: " + expr4.interpret(context));

        // expression evals
        System.out.println("Expression 1 or 3: " + builder.build(expr1, "OR", expr3).interpret(context));
        System.out.println("Expression 2 and 4: " + builder.build(expr2, "AND", expr4).interpret(context));
        System.out.println("Expression 3 does NOT match: "
                + builder.build(expr3, "NOT", null).interpret(context));
    }
}
