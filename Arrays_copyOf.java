package Java_programs;

import java.util.Arrays;

public class Arrays_copyOf {
    public static void main(String[] args) {
        int array[] = {10,89,00,23, 27, 56, 45, 14};

        int arr[] = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(arr));

        System.out.println("Are the original and Copied arrays same :- " +Arrays.equals(array,arr));
    }
}
