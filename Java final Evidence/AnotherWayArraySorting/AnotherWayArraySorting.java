
package AnotherWayArraySorting;

import java.util.Scanner;


public class AnotherWayArraySorting {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to calculate interest");
        
        System.out.println("Enter rate annually : ");
        float amount = s.nextFloat();
        
        System.out.println("Enter rate annually : ");
        float time = s.nextFloat();
        
        System.out.println("Enter rate annually : ");
        float rate = s.nextFloat();
        
        float interest = calculateInterest(amount, rate , time);
        float sudasol = amount + interest;
        System.out.println("Simple Interested : " + interest +" And Sudasol " + sudasol);
    }
    
    public static float calculateInterest(float principal, float rate, float time) {
        float interest = (principal*rate*time)/100;
        return  interest;
    }
}
