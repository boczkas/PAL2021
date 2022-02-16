package lekcja32;

import java.util.concurrent.*;

import static java.util.concurrent.CompletableFuture.runAsync;

public class Main {

  private static final ExecutorService executor = Executors.newSingleThreadExecutor();

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    System.out.println("Eloszka!");

    // 1. Future - reprezentuje przyszły wynik
    //    Future<Integer> calculate = calculate(10);
    //    while (!calculate.isDone()) {
    //      System.out.println("Calculatting...");
    //      Thread.sleep(500);
    //    }
    //    System.out.println(calculate.get());

    //    2. CompletableFuture - Future na bogato
    //    System.out.println("CompletableFuture part");
    //    CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    //        try {
    //            Thread.sleep(2000);
    //        } catch (InterruptedException e) {
    //            e.printStackTrace();
    //        }
    //        return "Hello";})
    //
    //            .thenApply(s -> s + " World!");
    //
    //    System.out.println(future.get());
    //
    //    future = CompletableFuture.supplyAsync(() -> "Siema").thenApply(s -> s + " Świecie!");
    //    System.out.println(future.get());

    //    3. Semaphore - idea synchronizacji na podstawie dostępnych zezwoleń
    //    Semaphore semaphore = new Semaphore(5);
    //    semaphore.acquire();
    //    System.out.println(semaphore.availablePermits());
    //    semaphore.acquire();
    //    System.out.println(semaphore.availablePermits());
    //
    //    Counter counter = new Counter();
    //    for (int i = 0; i < 1000; i++) {
    //      Runnable r =
    //          () -> {
    //            counter.increaseCounter();
    //            System.out.println(Thread.currentThread().getName() + ": " +
    // counter.getCounter());
    //            if (counter.getCounter() == 1000) {
    //              System.out.println(Thread.currentThread().getName() + " Mamy 1000!");
    //            }
    //          };
    //      Thread thread = new Thread(r);
    //      thread.start();
    //    }

    //    4. CountDownLatch
//    CountDownLatch countDownLatch = new CountDownLatch(3);
//    Printer printer1 = new Printer(countDownLatch);
//    Printer printer2 = new Printer(countDownLatch);
//    Printer printer3 = new Printer(countDownLatch);
//
//    new Thread(printer1).start();
//    new Thread(printer2).start();
//    new Thread(printer3).start();
//
//    countDownLatch.await();
//
//    System.out.println(Thread.currentThread().getName() + " has finished");

    //    5. CyclicBarrier - to samo co CountDownLatch, tylko że można jej użyć wiele razy w
    // programie

    //      6. Exchanger
    Exchanger<String> exchanger = new Exchanger<>();

    Runnable taskA =
        () -> {
          try {
            String message = exchanger.exchange("from A");
            System.out.println("In task A " + message);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        };

    Runnable taskB =
        () -> {
          try {
            String message = exchanger.exchange("from B");
            System.out.println("In task B " + message);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        };

    CompletableFuture.allOf(runAsync(taskA), runAsync(taskB)).join();
  }

  public static Future<Integer> calculate(Integer input) {
    return executor.submit(
        //            Co to za interfejs? Czym się różni od Runnable?
        () -> {
          Thread.sleep(2000);
          return input * input;
        });
  }
}
