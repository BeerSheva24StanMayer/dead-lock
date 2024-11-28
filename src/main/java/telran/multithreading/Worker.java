package telran.multithreading;

public class Worker extends Thread {
    private final Object threadLock1;
    private final Object threadLock2;

    public Worker(Object threadLock1, Object threadLock2) {
        this.threadLock1 = threadLock1;
        this.threadLock2 = threadLock2;
    }

    @Override
    public void run() {
        synchronized (threadLock1) {
            System.out.printf("%s is blocked on threadLock1\n", getName());
            synchronized (threadLock2) {
                System.out.printf("%s is blocked by threadLock2\n", getName());
            }
        }
    }   
}