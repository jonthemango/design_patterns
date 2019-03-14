package command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Invoker {
    private ArrayList<Command> commands;

    public Invoker(){
        commands = new ArrayList<Command>();
    }

    public Invoker storeCommand(Command command){
        commands.add(command);
        return this;
    }

    public void execute(){ // example
        for (Command c : commands){
            c.execute();
        }
    }

    public void undo(){ // example
        for (int i=commands.size()-1; i>=0; i--){
            commands.get(i).undo();
        }
    }
}
