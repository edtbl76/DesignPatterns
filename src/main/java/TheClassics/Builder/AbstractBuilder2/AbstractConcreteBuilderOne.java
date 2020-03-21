package TheClassics.Builder.AbstractBuilder2;

public class AbstractConcreteBuilderOne extends AbstractBuilder {

    private String name;


    public AbstractConcreteBuilderOne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println(String.format("Creating %s", this.name));
        object.add(String.format("<-[%s]", this.name));
    }

    @Override
    public void buildBase() {
        object.add("concrete");
    }

    @Override
    public void end() {
        System.out.println(String.format("Completing %s", this.name));
        object.add("[EOM]->");
    }
}
