package Java_programs;

import java.util.Arrays;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[][] multi =
                {
                        {1,2,3,4}, // 0th Row
                        {5,6,7,8}, //1st Row
                        {9,10,11,12} //2nd Row
                };
        System.out.println(multi[1][3]);
        System.out.println(Arrays.deepToString(multi));
    }
}
