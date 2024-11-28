package telran.multithreading;

public class Main {
    static final Object threadLock1 = new Object();
    static final Object threadLock2 = new Object();

    public static void main(String[] args) {
        Worker worker1 = new Worker(threadLock2, threadLock1);
        Worker worker2 = new Worker(threadLock1, threadLock2);

        worker1.start();
        worker2.start();
    }
}