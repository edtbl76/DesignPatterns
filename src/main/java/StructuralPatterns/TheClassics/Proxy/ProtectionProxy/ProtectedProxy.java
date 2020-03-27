package StructuralPatterns.TheClassics.Proxy.ProtectionProxy;

import java.util.*;

public class ProtectedProxy extends AbstractSubject {

    static ConcreteSubject subject;

    private String currentUser;
    private List<String> registeredUsers;

    public ProtectedProxy(String currentUser) {
        registeredUsers = Arrays.asList("me", "you", "him", "her");
        this.currentUser = currentUser;
    }

    @Override
    public void method() {
        System.out.println(currentUser + " is calling proxy method()");

        // "fake auth check"
        if (registeredUsers.contains(currentUser)) {

            // Lazy init. Remember this is a null check for first time init.
            if (subject == null)
                subject = new ConcreteSubject();
            subject.method();
        } else {
            System.out.println("Hit the road " + currentUser + ", you don't have permssion.");
        }

    }
}
