package lekcja27;

import java.time.Duration;
import java.time.Instant;

public class Main {
  //    1. Wątek a proces?
  //      Proces może iec wiele wątków. Wątki współdzielą zestaw zmiennych. Wada - mogą sobie
  // wchodzić w paradę.
  //      Zaleta - mogą się szybciej między sobą komunikować.

  public static void main(String[] args) throws InterruptedException {
//    Wykonywanie czegoś po kolei w main
    for (double i = 0; i < 4; i++) {
      System.out.println("Działam w main");
      Thread.sleep(500);
    }

//    Tworzenie Runnable
//    NAJPIERW JEDEN


//    Sleeper spioch1 = new Sleeper("1");
//    Sleeper spioch2 = new Sleeper("2");
//    Sleeper spioch3 = new Sleeper("3");
//    Sleeper spioch4 = new Sleeper("4");

//    Uruchomienie przez run()
//    spioch1.run();
//    spioch2.run();
//    spioch3.run();
//    spioch4.run();

//    Uruchomienie przez
//    Thread th1 = new Thread(spioch1);
//    Thread th2 = new Thread(spioch2);
//    Thread th3 = new Thread(spioch3);
//    Thread th4 = new Thread(spioch4);
//
//    th1.start();
//    th2.start();
//    th3.start();
//    th4.start();
  }
}
