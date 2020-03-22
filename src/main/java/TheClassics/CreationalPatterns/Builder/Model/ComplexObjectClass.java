package TheClassics.CreationalPatterns.Builder.Model;

public class ComplexObjectClass {

    private String startMessage;
    private String objectType;
    private String widgetType;
    private int numberOfDoohickeys;
    private String endMessage;

    public ComplexObjectClass(
            final String startMessage,
            String objectType,
            String widgetType,
            int numberOfDoohickeys,
            String endMessage) {

        this.startMessage = startMessage;
        this.objectType = objectType;
        this.widgetType = widgetType;
        this.numberOfDoohickeys = numberOfDoohickeys;
        this.endMessage = endMessage;

    }

    public String getStartMessage() {
        return startMessage;
    }

    public String getObjectType() {
        return objectType;
    }

    public String getWidgetType() {
        return widgetType;
    }

    public int getNumberOfDoohickeys() {
        return numberOfDoohickeys;
    }

    public String getEndMessage() {
        return endMessage;
    }

    @Override
    public String toString() {
        return "ComplexObjectClass{" +
                "startMessage='" + startMessage + '\'' +
                ", objectType='" + objectType + '\'' +
                ", widgetType='" + widgetType + '\'' +
                ", numberOfDoohickeys=" + numberOfDoohickeys +
                ", endMessage='" + endMessage + '\'' +
                '}';
    }
}
