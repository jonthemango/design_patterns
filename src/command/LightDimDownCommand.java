package command;

public class LightDimDownCommand implements Command {

    private Light light;

    public LightDimDownCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.down();
        System.out.println("LightDimDownCommand executed: " + light.level());
    }

    @Override
    public void undo() {
        light.up();
        System.out.println("LightDimDownCommand undo: " + light.level());
    }
}
