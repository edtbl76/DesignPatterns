package CreationalPatterns.GoF.Builder.AbstractBuilder2;

public class AbstractConcreteBuilderTwo extends AbstractBuilder {

    private String name;

    public AbstractConcreteBuilderTwo(String name) {
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
        object.add("pavement");
    }

    @Override
    public void end() {
        System.out.println(String.format("Completing %s", this.name));
        object.add("[MORE]->");
    }
}
