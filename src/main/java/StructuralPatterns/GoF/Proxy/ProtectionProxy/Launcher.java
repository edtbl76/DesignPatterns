package StructuralPatterns.GoF.Proxy.ProtectionProxy;

public class Launcher {

    public static void main(String[] args) {

        /*
            Example of an authorized user.
            - NOTE: our first output is <user> is calling proxy method()
            I did this on purpose, because it is common to LOG (for auditing purposes) users as they log in.

            - The second output is the result of the operation based on whether or not you where authorized
            to execute the method.
         */
        ProtectedProxy proxyAuth = new ProtectedProxy("me");
        proxyAuth.method();

        /*
            Example of a "not" authorized user.
         */
        ProtectedProxy proxyNoAuth = new ProtectedProxy("ShadyHacker");
        proxyNoAuth.method();
    }
}
