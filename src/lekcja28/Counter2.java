package lekcja28;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter2 {
    Lock lock = new ReentrantLock();
    int counter;

    public Counter2() {
        this.counter = 0;
    }

    public void increaseCounter() {
        lock.lock();
        try {
            this.counter++;
        } finally {
            lock.unlock();
        }
    }

    public int getCounter() {
        return counter;
    }
}
