/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinJava;

import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */
public class MinJava {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        arr [0] = s.nextInt();
        arr [1] = s.nextInt();
        arr [2] = s.nextInt();
        arr [3] = s.nextInt();
        arr [4] = s.nextInt();
        System.out.println("Min Number : " + getMinValue(arr));
    }
    
    public static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            
                
            }
            
        }
        return minValue;
                
       
        
                
                
        
    }
}
