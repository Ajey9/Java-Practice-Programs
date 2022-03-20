package Java_programs;

public class Exception_Handling {
    public static void main(String[] args) {
        int i = 1;
        int j= 0;
        int number ;
        try{
            number = i/j;
        }
        catch(Exception e)
        {
            System.out.println("0");
        }
        finally {
            System.out.println("Well, This is Arithmetic Expcetion, But we have returned 0 for you");
            System.exit(2);
        }
    }
}
