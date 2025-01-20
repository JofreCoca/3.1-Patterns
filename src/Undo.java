import java.util.ArrayList;
import java.util.List;

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
    public void deleteCommand(int position){
        this.commands.remove(position);
        System.out.println("Command removed correctly");
    }
    public void listCommands(){
        System.out.println("List commands:");
        commands.forEach(System.out::println);
    }
}
