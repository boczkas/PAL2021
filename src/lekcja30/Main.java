package lekcja30;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
  public static void main(String[] args) {
//      ZAKLESZCZENIA
//      1. Deadlock
    //
      String monitor1 = "monitor1";
      String monitor2 = "monitor2";

    //      Najpierw blokujemy monitor1, potem monitor2
    Thread thread1 =
        new Thread() {
          public void run() {
            synchronized (monitor1) {
              System.out.println("Thread1: zablokowano zasób " + monitor1);
              try {
                Thread.sleep(100);
              } catch (Exception e) {
              }

              synchronized (monitor2) {
                System.out.println("Thread1: zablokowano zasób " + monitor2);
              }
            }
          }
        };

      //      Najpierw blokujemy monitor2, potem monitor1
      Thread thread2 =
              new Thread() {
                  public void run() {
                      synchronized (monitor2) {
                          System.out.println("Thread2: zablokowano zasób " + monitor2);
                          try {
                              Thread.sleep(100);
                          } catch (Exception e) {
                          }

                          synchronized (monitor1) {
                              System.out.println("Thread2: zablokowano zasób " + monitor1);
                          }
                      }
                  }
              };

//      thread1.start();
//      thread2.start();



      //  Fix
      Lock lock1 = new ReentrantLock();
      Lock lock2 = new ReentrantLock();

    Thread thread3 =
        new Thread() {
          public void run() {
            while (!lock1.tryLock()) {}
              try {
                System.out.println("Thread3: zablokowano zasób lock1");
              } finally {
                lock1.unlock();
              }


              while (!lock2.tryLock()) {}
              try {
                System.out.println("Thread3: zablokowano zasób lock2");
              } finally {
                lock2.unlock();
              }

            System.out.println("Thread3 done");
          }
        };

      Thread thread4 =
              new Thread() {
                  public void run() {
                      while (!lock2.tryLock()) {}
                          try {
                              System.out.println("Thread4: zablokowano zasób lock2");
                          } finally {
                              lock2.unlock();
                          }

                      while (!lock1.tryLock()) {}
                          try {
                              System.out.println("Thread4: zablokowano zasób lock1");
                          } finally {
                              lock1.unlock();
                          }

                      System.out.println("Thread4 done");
                  }
              };
//      thread3.start();
//      thread4.start();


//     2. Live lock - nie mogłeś zgarnąć jakiegoś locka, uwolnij te które miałeś wcześniej i spróbuj ponownie
      Lock lock3 = new ReentrantLock(true);
      Lock lock4 = new ReentrantLock(true);

          Thread thread5 = new Thread() {
              public void run() {
                  while (true) {
                      try {
                          lock3.tryLock(50, TimeUnit.MILLISECONDS);
                          System.out.println("Thread5: lock3 acquired, trying to acquire lock4.");
                          Thread.sleep(50);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }

                      if (lock4.tryLock()) {
                          System.out.println("Thread5: lock4 acquired.");
                      } else {
                          System.out.println("Thread5: cannot acquire lock4, releasing lock3.");
                          lock3.unlock();
                          continue;
                      }

                      System.out.println("Thread5: executing first operation.");
                      break;
                  }
                  lock4.unlock();
                  lock3.unlock();
              }
          };

      Thread thread6 = new Thread() {
          public void run() {
              while (true) {
                  try {
                      lock4.tryLock(50, TimeUnit.MILLISECONDS);
                      System.out.println("Thread6: lock4 acquired, trying to acquire lock3.");
                      Thread.sleep(50);

                      if(lock3.tryLock()) {
                          System.out.println("Thread6: lock3 acquired.");
                      } else {
                          System.out.println("Thread6: cannot acquire lock3, releasing lock4.");
                          lock4.unlock();
                          continue;
                          }
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println();
                  System.out.println("Thread6: executing second operation.");
                  break;
              }
              lock3.unlock();
              lock4.unlock();
          }
      };

//      thread5.start();
//      thread6.start();


//  Rozwiązanie to zgarnienie locków w takiej kolejności jak są deklarowane (mają numerki)

//    3. Java Queue
//    Jest ich sporo, w zależności czego potrzebujemy od naszego kodu
//    https://www.baeldung.com/java-concurrent-queues
//
//    Generalnie chodzi o to, że możemy nie martwić się o wszelkie zabiegi związane z synchronizacją,
//    jeżeli jeden wątek będzie produkował rzeczy do kolejki, a drugi zgarniał
//      Przykład z: http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html

      BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);

      Producer producer = new Producer(queue);
      Consumer consumer = new Consumer(queue);

      new Thread(producer).start();
      new Thread(consumer).start();

//      Pokazać dorzucenie nowego elementu
  }



}
