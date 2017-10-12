package pkgsynchronized;

public class SynchronizedEx1 {
    synchronized void printTable(int n){
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
