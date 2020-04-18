package BehavioralPatterns.GoF.Observer;

public class ObserverTwo implements Observer {

    private String name;

    public ObserverTwo(String name) {
        this.name = name;
    }

    @Override
    public void update(int updatedValue) {
        System.out.println(name + " RCVD NOTIFICATION: Updated value in Subject = " + updatedValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
