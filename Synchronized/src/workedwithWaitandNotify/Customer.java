
package workedwithWaitandNotify;


public class Customer {
   int amount = 10000;
   synchronized  void withdraw(int amount){
       System.out.println("going to withdraw...");
       if (this.amount<amount){
           System.out.println("Less balance; waiting for deposit...");
           try{
           wait();
           }catch (Exception e){
           
           }
       }
       this.amount -= amount;
       System.out.println("withdraw complete...");
   }
       synchronized void deposit(int amount){
           System.out.println("going tp deposit...");
           this.amount += amount;
           System.out.println("deposit complete..");
           notify();
       }
}
