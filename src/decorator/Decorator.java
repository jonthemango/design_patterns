package decorator;

public abstract class Decorator extends Component {
    private Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component){
        this.component = component;
    }
}
