
package ArraySorting;

import java.util.Arrays;


public class ArraySortingPrac {
    public static void main(String[] args) {
        int [][] data = {
            {10,20,30,40},
            {10,20,30,40},
            {10,20,30,40},
            {10,20,30,40},
        };
        
        for (int[] is : data) {
            Arrays.sort(is);
            for (int i : is) {
                System.out.print(i+ " ");  
            }
            System.out.println();
        }
    }
}
