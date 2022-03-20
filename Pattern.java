package Java_programs;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= scanner.nextInt();
        int count =0;
        for(int i=n*n;i>=1;i--)
        {
            if(i%n !=0)
            {
                continue;
            }
            else
            {
                for(int j=i; j>=1;j--)
                {
                    if(count/j != 1)
                    {
                        System.out.print(n);
                        ++count;
                    }
                    else
                    {
                        count = 0;
                        System.out.print(n-1);
                        ++count;
                    }
                }
                System.out.println();
                count = 0 ;
            }
        }
    }
}
