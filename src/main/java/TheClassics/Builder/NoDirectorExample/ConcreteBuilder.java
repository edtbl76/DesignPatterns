package TheClassics.Builder.NoDirectorExample;

import TheClassics.Builder.Model.*;

public class ConcreteBuilder implements ChainedBuilder{

    private String startMessage = "Building Thing One";
    private String objectType = "concrete";
    private String widgetType = "Widget Jr";
    private int numberOfDoohickeys = 37;
    private String endMessage = "Completing Thing One";

    ComplexObjectClass object;


    @Override
    public ChainedBuilder start(String startMessage) {
        this.startMessage = startMessage;
        return this;
    }

    @Override
    public ChainedBuilder buildBase(String objectType) {
        this.objectType = objectType;
        return this;
    }

    @Override
    public ChainedBuilder addWidget(String widgetType) {
        this.widgetType = widgetType;
        return this;
    }

    @Override
    public ChainedBuilder insertDoohickeys(int numberOfDoohickeys) {
        this.numberOfDoohickeys = numberOfDoohickeys;
        return this;
    }

    @Override
    public ChainedBuilder end(String endMessage) {
        this.endMessage = endMessage;
        return this;
    }

    @Override
    public ComplexObjectClass assembleObject() {
        object = new ComplexObjectClass(
                this.startMessage, this.objectType, this.widgetType, this.numberOfDoohickeys, this.endMessage);
        return object;
    }

    @Override
    public ComplexObjectClass getAssembledObject() {
        return object;
    }
}
