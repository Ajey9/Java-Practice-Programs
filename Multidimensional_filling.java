package Java_programs;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Multidimensional_filling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int array[][] = new int[3][3];
//        for (int row = 0; row < 3; row++) {
//            for (int column = 0; column < 3; column++) {
//                array[row][column] = scanner.nextInt();
//            }
//        }
//
//        for (int row = 0; row < 3; row++) {
//            for (int column = 0; column < 3; column++) {
//                System.out.print(array[row][column]+ " ");
//            }
//            System.out.println();
//        }
        System.out.println(new Date().toString());
        System.out.println(LocalDate.now());
        LocalDate localDate = LocalDate.now().plusDays(100);
        System.out.println("After 100 days, the Date will be : " +localDate);
    }
}
