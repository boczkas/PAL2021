package lekcja28;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter4 {
    AtomicInteger counter;

    public Counter4() {
        this.counter = new AtomicInteger(0);
    }

    public void increaseCounter() {
        this.counter.addAndGet(1);
    }

    public int getCounter() {
        return counter.get();
    }
}
