package command;


public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.on();
        System.out.println("LightOnCommand executed: " + light.level());
    }

    @Override
    public void undo() {
        this.light.off();
        System.out.println("LightOnCommand undo: " + light.level());
    }
}
