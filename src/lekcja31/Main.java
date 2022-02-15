package lekcja31;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.concurrent.*;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    // 1. ExecutorsService - threadPools
//      Tworzenie wątków z palca jest dość uciążliwe i jeśli chcemy za ich pomocą wykonać
//      jakąś krótką akcję, to powinno się skorzystać z gotowych rozwiązać

//      Jest sporo różnych thread pooli
//      - fixed - tworzy konkretną liczbę wątków, które żyją nonstop
      ExecutorService executorService = Executors.newFixedThreadPool(8);

    //      - schedule - wykonuje popewnym czasie coś
//    System.out.println("Siema");
//      ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
//      scheduledExecutorService.schedule(() -> System.out.println("aaa"), 3, TimeUnit.SECONDS);

//    - cachable - dość dziwna threadPoola. Startuje bez żadnego wątku i tworzy nowy dla każdego
//          przychodzącego zadania. Wywala thready, które są Idle przez 1min
//      ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//      cachedThreadPool.submit(() -> System.out.println("aaa"));

//      - workStealingPool - jej działanie wytłumaczę później w czasie forkJoinPool
//      ExecutorService workStealingPool = Executors.newWorkStealingPool();

//      Mamy tu sporo różnych metod fabrycznych - objaśnić ten design pattern

    //       Stary przykład, ze zmienioną wartością:
    SharedMap sharedMap = new SharedMap();
    Map<String, Integer> map = sharedMap.getSharedMap();
//    map.put("key", 0);
//    Instant start = Instant.now();
//    for (int i = 0; i < 10_000_000; i++) {
//      Runnable r = () -> map.compute("key", (k, value) -> value + 1);
//      executorService.execute(r);
//    }
//    Instant end = Instant.now();
//    System.out.println(Duration.between(start, end));
//    executorService.shutdown();
//    executorService.awaitTermination(10, TimeUnit.MINUTES);
//    System.out.println(map.get("key"));

//    2. ForkJoinPool
      map.put("key", 0);
      ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
      Instant start = Instant.now();
      for (int i = 0; i < 10_000_000; i++) {
          Runnable r = () -> map.compute("key", (k, value) -> value + 1);
          forkJoinPool.execute(r);
      }
      Instant end = Instant.now();
      System.out.println(Duration.between(start, end));
      System.out.println(map.get("key"));

//      Generalnie ExecutorService i ForkJoinPool robią to samo - to jako jest różnica?
//      Paint
  }
}
