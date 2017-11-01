
package ArraySorting;

import java.util.Arrays;


public class ArraySorting {
    public static void main(String[] args) {
        int [][] data = {{10, 20, 30},
            {25, 22, 30, 40},
            {20, 23, 15, 30},
            {45, 30, 40, 44}};
        
        System.out.println("Data Table");
        for (int [] d : data) {
          Arrays.sort(d);
            for (int a : d) {
                System.out.println(a + " ");
            }
            System.out.println();
        }
    }
}
