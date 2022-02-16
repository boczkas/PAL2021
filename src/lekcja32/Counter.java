package lekcja32;

import java.util.concurrent.Semaphore;

public class Counter {
  int counter;
//  Semaphore semaphore = new Semaphore(1);

  public Counter() {
    this.counter = 0;
  }

  public void increaseCounter() {
    this.counter++;
  }

//    public void increaseCounter() {
//        try {
//            semaphore.acquire();
//            this.counter++;
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        finally{
//            semaphore.release();
//        }
//    }

  public int getCounter() {
        return counter;
    }
}
