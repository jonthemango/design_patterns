package command;

public class LightDimUpCommand implements Command {
    private Light light;

    public LightDimUpCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.up();
        System.out.println("LightDimUpCommand executed: " + light.level());
    }

    @Override
    public void undo() {
        light.down();
        System.out.println("LightDimUpCommand undo: " + light.level());
    }
}
