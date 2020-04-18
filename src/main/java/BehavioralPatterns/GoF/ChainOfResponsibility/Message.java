package BehavioralPatterns.GoF.ChainOfResponsibility;

public class Message {
    private String payload;
    private MessagePriority priority;

    public Message(String payload, MessagePriority priority) {
        this.payload = payload;
        this.priority = priority;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public MessagePriority getPriority() {
        return priority;
    }

    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }
}
