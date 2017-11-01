
package MaxValue;

import java.util.Scanner;


public class MaxValue {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        arr [0] = s.nextInt();
        arr [1] = s.nextInt();
        arr [2] = s.nextInt();
        arr [3] = s.nextInt();
        arr [4] = s.nextInt();
        System.out.println("Max Number : " + getMaxValue(arr));
    }
    
    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            
                
            }
            
        }
        return maxValue;
                
       
        
                
                
        
    }
}
