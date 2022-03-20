package Java_programs;


public class CommandLineArguements {
    public static void main(String[] args)  {
        if(args.length==0 || args[0].equals("-h"))
            System.out.println("Hello");
        else if(args[0].equals("-g"))
            System.out.println("GoodBye ");

        //print the other command-line arguments
        for(int i=0;i< args.length;i++)
        {
            System.out.print(" "+args[i]);
        }
        System.out.println("!!");
    }
}
