package lekcja30;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    protected BlockingQueue<String> queue = null;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
            Thread.sleep(2000);
            queue.put("4");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}