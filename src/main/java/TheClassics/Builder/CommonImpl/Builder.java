package TheClassics.Builder.CommonImpl;

public interface Builder {

    void start();
    void buildBase();
    void addWidget();
    void insertDoohickey();
    void end();

    ComplexObject getComplexObject();
}
