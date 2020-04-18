package StructuralPatterns.GoF.Decorator.Common;

public abstract class AbstractDecorator extends Component {

    /*
        Only
     */
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    /*
        This is not the same method() as in our Component.
        This is the same concept of proxying/substituting/delegating the task as in Proxy.
     */
    public void method() {
        if (component != null) {
            component.method();
        }
    }
}
