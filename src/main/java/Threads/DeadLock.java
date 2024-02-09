package Threads;

public class DeadLock {
    private static final String s1 = "prudhvi";
    private static final String s2 = "teja";

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
           synchronized (s1) {
                System.out.println("Thread 1: Locked s1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (s2) {
                    System.out.println("Thread 1: Locked s2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (s2) {
                System.out.println("Thread 2: Locked s2");
                synchronized (s1) {
                    System.out.println("Thread 2: Locked s1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}