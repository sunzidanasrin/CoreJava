
package PassFail;

import java.util.Scanner;


public class PassFail {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Written Mark");
        int written = s.nextInt();
        System.out.println("Enter EVI number");
        int evi = s.nextInt();
        int total = written + evi;
        if (written >= 70 && evi >= 30) {
           if (written >= 100 && evi >= 30) {
               System.out.println("you can input over 100 and 50 respecting");
           } else{
           System.out.println("your Marks is" + total +" And you are pass");
           }
        }else{
        System.out.println("your Marks is" + total +" And you are failed");
        }
    }
}
