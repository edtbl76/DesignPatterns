package TheClassics.Builder.AbstractBuilder;

import TheClassics.Builder.InterfaceBuilder.*;

public class AbstractDirector {

    AbstractBuilder builder;

    public void build(AbstractBuilder builder) {
        this.builder = builder;
        builder.build();
        builder.start();
        builder.buildBase();
        builder.addWidget();
        builder.insertDoohickey();
        builder.end();
    }
}
