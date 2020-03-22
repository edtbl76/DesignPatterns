package TheClassics.CreationalPatterns.Builder.InterfaceBuilder1;

public class InterfaceDirector {

    InterfaceBuilder builder;

    public void build(InterfaceBuilder builder) {
        this.builder = builder;
        builder.start();
        builder.buildBase();
        builder.addWidget();
        builder.insertDoohickey();
        builder.end();
    }
}
