package lekcja28;

public class Counter {
    int counter;

    public Counter() {
        this.counter = 0;
    }

    public void increaseCounter() {
        synchronized (this) {
            this.counter++;
        }
    }

    public int getCounter() {
        return counter;
    }
}
