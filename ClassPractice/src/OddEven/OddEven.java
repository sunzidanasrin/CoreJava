
package OddEven;

import java.util.Scanner;


public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calculate Sum");
        System.out.print("Enter start number ");
        int sn = s.nextInt();
        System.out.print("Enter End number ");
        int en = s.nextInt();
        calculateSum(sn,en);
    }
    public static void calculateSum(int sn, int en) {
        int sum = 0;
        if (sn<en){
            for (int i = sn; i <= en; i++) {
                sum += i;
            }
            
        }else{
            for (int i = sn; i <= en; i--) {
               sum += i; 
            }
        }
        System.out.println("Sum : " + sum);
    }
            
}
