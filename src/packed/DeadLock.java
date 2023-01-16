package packed;

public class DeadLock {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();

    }

    static class Thread10 extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println(" монитор захвачен ");
                synchronized (lock2) {
                    System.out.println("lock2 хахвачен ");
                }
            }
        }
    }

    static class Thread20 extends Thread {
        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println(" монитор захвачен ");
                synchronized (lock1) {
                    System.out.println("lock2 хахвачен ");
                }
            }
        }
    }
}
