package Level_1_Exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Undo {
    private static Undo instanceUndo;
    private List<String> commands;
    private Undo(){
        this.commands=new ArrayList<String>();
    }
    public static Undo getInstanceUndo(){
        if(instanceUndo==null){
            instanceUndo=new Undo();
        }
        return instanceUndo;
    }
    public void addCommand(String command){
        this.commands.add(command);
        System.out.println("Command introduced correctly");
    }
    public void deleteCommandLast(){
        try{
            this.commands.removeLast();
            System.out.println("Command removed correctly");
        } catch (NoSuchElementException e) {
            System.out.println("Error removed position");
        }

    }
    public void listCommands(){
        System.out.println("List commands:");
        commands.forEach(System.out::println);
    }
}
