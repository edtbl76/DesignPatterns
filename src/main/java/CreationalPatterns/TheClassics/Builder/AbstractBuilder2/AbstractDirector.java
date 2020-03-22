package CreationalPatterns.TheClassics.Builder.AbstractBuilder2;

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
