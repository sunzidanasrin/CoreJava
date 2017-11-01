
package EmailValidation;

import java.time.Clock;
import java.util.Scanner;


public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email");
        
        String email = sc.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");
        
        if (atpos > 1 && (dotpos - atpos) > 2) {
            System.out.println("Email is valid");
        }else{
            System.out.println("Email is Invalid");
        }
    }
}
