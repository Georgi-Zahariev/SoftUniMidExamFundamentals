
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        List<String> list = Arrays.stream(inp.nextLine().split("!")).collect(Collectors.toList());
        String inputLine = inp.nextLine();
        while(!inputLine.equals("Go Shopping!")){
            String []command = inputLine.split(" ");
            String c=command[0];
             switch (c){
                 case "Urgent":
                 if(!list.contains(command[1]))
                     list.add(0,command[1]);
                     break;
                 case "Unnecessary":
                     if(list.contains(command[1]))
                         list.remove(command[1]);
                     break;
                 case "Correct":
                     if(list.contains(command[1]))
                         list.set( list.indexOf(command[1]), command[2]);
                     break;
                 case "Rearrange":
                     if(list.contains(command[1])){
                         list.remove(command[1]);
                     list.add(command[1]);}
                     break;
             }
                inputLine=inp.nextLine();
        }

        System.out.println(String.join(", ",list));

    }
}
