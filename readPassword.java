package Java_programs;

import java.io.Console;


public class readPassword {
    public static void main(String[] args) {

        Console console = System.console();

        if(console==null)
        {
            System.out.println("No Console Available");
            return;
        }

        String string;
        string = console.readLine("Enter your username : " );
        console.printf("Your Username is : ",string);
    }
}
