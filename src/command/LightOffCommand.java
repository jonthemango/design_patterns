package command;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
        System.out.println("LightOffCommand executed: " + light.level());

    }

    @Override
    public void undo() {
        this.light.off();
        System.out.println("LightOffCommand undo: " + light.level());
    }
}
