
package MaxValue;

import java.util.Arrays;


public class MaxEasy {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        System.out.println("Max Number: " + getMaxValue(a));
         System.out.println("Min Number: " + getMinValue(a));
        
    
    }
    public static int getMaxValue(int[] arr) {
      Arrays.sort(arr);
      return arr[arr.length-1];
    }
    
      public static int getMinValue(int[] arr) {
      Arrays.sort(arr);
      return arr[0];
    }
}
