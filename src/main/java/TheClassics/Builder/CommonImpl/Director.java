package TheClassics.Builder.CommonImpl;

public class Director {

    Builder builder;

    public void build(Builder builder) {
        this.builder = builder;
        builder.start();
        builder.buildBase();
        builder.addWidget();
        builder.insertDoohickey();
        builder.end();
    }
}
