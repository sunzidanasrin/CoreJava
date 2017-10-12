package pkgsynchronized;

public class MyThread1 extends Thread{
    SynchronizedEx1 t;

    public MyThread1(SynchronizedEx1 t) {
        this.t = t;
    }
    
    public void run(){
        t.printTable(5);
    }
    
}
