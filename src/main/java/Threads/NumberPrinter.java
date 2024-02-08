package Threads;

public class NumberPrinter implements Runnable {
    private int a;
    private int b;

    public NumberPrinter(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = a; i <= b; i =i+ 2) {
            System.out.println(threadName + ": " + i);
        }
    }
}
