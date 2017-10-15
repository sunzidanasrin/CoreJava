
package assertion;

import java.util.Scanner;


public class TestAssertion {

   
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ur age");
        int value = s.nextInt();
        assert value >= 18 : "Not Valid";
        
        System.out.println("Value is " + value);
    }
    
}
