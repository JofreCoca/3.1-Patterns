package Level_1_Exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo undo= Undo.getInstanceUndo();
        Scanner sc = new Scanner(System.in);
        boolean next=true;
        while(next){
            System.out.println("Enter new command");
            String command = sc.nextLine();
            if(command.equals("exit undo")){
                next=false;
            }else{
                undo.addCommand(command);
            }
            undo.listCommands();
        }
        undo.deleteCommandLast();
        undo.listCommands();
    }
}