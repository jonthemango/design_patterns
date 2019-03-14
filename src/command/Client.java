package command;


public class Client {


    public static void main(String args[]){
        Light light = new Light();
        Command c1 = new LightDimDownCommand(light);
        Command c2 = new LightDimUpCommand(light);
        Command c3 = new LightOffCommand(light);
        Command c4 = new LightOnCommand(light);

        Invoker invoker = new Invoker();
        invoker.storeCommand(c1).storeCommand(c2).storeCommand(c3).storeCommand(c4);
        invoker.execute();
        invoker.undo();
    }
}
