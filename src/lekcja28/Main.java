package lekcja28;

import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    // 1. Race condition read-modify-write
//      Counter counter = new Counter();
//      for (int i = 0; i < 1000; i++) {
//      Runnable r =
//          new Runnable() {
//            @Override
//            public void run() {
//              counter.increaseCounter();
//              System.out.println(Thread.currentThread().getName() + ": " + counter.getCounter());
//              if (counter.getCounter() == 1000) {
//                System.out.println(Thread.currentThread().getName() + " Mamy 1000!");
//              }
//            }
//          };
//          Thread thread = new Thread(r);
//          thread.start();
//      }

//      System.out.println(Thread.currentThread().getName() + ": " + counter.getCounter());
//      2. Race condition check-and-act
//          http://tutorials.jenkov.com/java-concurrency/race-conditions-and-critical-sections.html
//      SharedMap sharedMap = new SharedMap();
//
//      for (int i = 0; i < 100; i++) {
//      Runnable r =
//          new Runnable() {
//            @Override
//            public void run() {
//              Map<String, String> map = sharedMap.getSharedMap();
//              if (map.containsKey("key")) {
////                System.out.println("Some delay");
//                  String value = map.remove("key");
//                if (value == null) {
//                  System.out.println("No mapping was present");
//                }
//              } else {
//                map.put("key", "value");
//              }
//            }
//          };
//          Thread thread = new Thread(r);
//          thread.start();
//      }

// Add it after increase
//      3. Fix counter by synchronized method, block
//      4. Fix counter by lock

    Counter2 counter2 = new Counter2();
//    for (int i = 0; i < 1000; i++) {
//      Runnable r =
//          new Runnable() {
//            @Override
//            public void run() {
//              counter2.increaseCounter();
//              System.out.println(Thread.currentThread().getName() + ": " + counter2.getCounter());
//              if (counter2.getCounter() == 1000) {
//                System.out.println(Thread.currentThread().getName() + " Mamy 1000!");
//              }
//            }
//          };
//      Thread thread = new Thread(r);
//      thread.start();
//    }


//      5. Fix counter by volatile on int
//      Counter3 counter3 = new Counter3();
//    for (int i = 0; i < 1000; i++) {
//      Runnable r =
//          new Runnable() {
//            @Override
//            public void run() {
//              counter3.increaseCounter();
//              System.out.println(Thread.currentThread().getName() + ": " + counter3.getCounter());
//              if (counter3.getCounter() == 1000) {
//                System.out.println(Thread.currentThread().getName() + " Mamy 1000!");
//              }
//            }
//          };
//      Thread thread = new Thread(r);
//      thread.start();
//    }

//      6. Fix counter by AtomicInteger
      Counter4 counter4 = new Counter4();
      for (int i = 0; i < 1000; i++) {
          Runnable r =
                  new Runnable() {
                      @Override
                      public void run() {
                          counter4.increaseCounter();
                          System.out.println(Thread.currentThread().getName() + ": " + counter4.getCounter());
                          if (counter4.getCounter() == 1000) {
                              System.out.println(Thread.currentThread().getName() + " Mamy 1000!");
                          }
                      }
                  };
          Thread thread = new Thread(r);
          thread.start();
      }
  }
}
