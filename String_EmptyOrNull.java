package Java_programs;

import java.sql.SQLOutput;

public class String_EmptyOrNull {
    public static void main(String[] args) {
        String string = " Ajay Gathadi ";

        System.out.println("Length of the 'string' variable is :  " + string.length());
       if(string.equals(null))
           System.out.println("Null");
       else if(string != null && string.length() !=0 )
           System.out.println("String is neither Null nor Empty");
       else
           System.out.println("Empty");

       System.out.println(string.codePointCount(0,string.length()));

       int codePoint = string.offsetByCodePoints(2,4);
        System.out.println("CodePoint : " +codePoint);
        System.out.println("Data at " +codePoint+ " is " +string.charAt(codePoint));
        System.out.println(string.codePointAt(codePoint));
        System.out.println("\uD83D\uDE00");
        System.out.println("\u1F60");
        System.out.println("\u1111");
    }
}
