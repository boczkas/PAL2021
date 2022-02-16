package lekcja32;

import java.util.concurrent.CountDownLatch;

public class Printer implements Runnable {
    CountDownLatch countDownLatch;

    public Printer(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

  @Override
  public void run() {
    try {
      System.out.println("Waitting...");
      Thread.sleep(3000);
      System.out.println("Printtiiiinnnngggg...");
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    countDownLatch.countDown();
  }
}
