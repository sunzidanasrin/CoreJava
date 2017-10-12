package pkgsynchronized;

class MyThread2 extends Thread {
    SynchronizedEx1 t;
    MyThread2(SynchronizedEx1 t) {
        this.t = t;
    }
    
    public void run() {
        t.printTable(100);
    }
}
