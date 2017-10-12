package pkgsynchronized;

public class SynchronizationTestThread {

    public static void main(String args[]) {
        SynchronizedEx1 obj = new SynchronizedEx1();//only one object  
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }

}
