package BehavioralPatterns.TheClassics.Strategy;

public interface TransportType {
    // no default implementation, BUT, each transport type determines its own implementation w/o being coupled
    // separately to the Context
    void transport();
}
