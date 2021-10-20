package lekcja23;

import lekcja17.Pracownik;
import lekcja22.Wyjatek1;
import lekcja22.Wyjatek2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
  public static void main(String[] args) throws Wyjatek1 {
    //    1. Rethrow exception

    //      try {
    //          throw new Wyjatek2();
    //      } catch (Wyjatek2 wyjatek2) {
    //          throw new Wyjatek1();
    //      }

    //  2. Logger - w książce jest dużo niuansów, my się skupimy na podstawach

    System.out.println("Siema");
    Logger logger = Logger.getLogger("nazwaLoggera");
    logger.log(Level.INFO, "Siema");
//      Logger logger = Logger.getLogger(Main.class.getName());
//  Dane z loggera można przekierować do pliku, jeśli chce się robić jakąś analizę logów,
//      są narzędzia które analizują logi


//      3. Programowanie generyczne
      PairString pairString = new PairString("Pierwszy", "Drugi");
      PairInteger pairInteger = new PairInteger(1, 2);
      PairPracownik pairPracownik = new PairPracownik(new Pracownik("Pierwszy", 1), new Pracownik("Drugi", 2));

//       Jak to rozwiązać żeby nie trzeba było tworzyć tylu osobnych klas na każdy typ?
//      - Object
      PairObject pairObjectString = new PairObject("Pierwszy", "Drugi");
      PairObject pairObjectInteger = new PairObject(1, 2);
      PairObject pairObjectPracownik = new PairObject(new Pracownik("Pierwszy", 1),
              new Pracownik("Drugi", 2));

      pairObjectString.first = "first";
      pairObjectString.second = 2;

//      Tu nadal wszystko działa, a przecież chcieliśmy przechowywać sobie parę dwóch Stringów. Jak żyć?
//     - Generyczna klasa
      Pair<String> stringPair = new Pair<>("Pierwszy", "Drugi");
      stringPair.first = "first";
//      stringPair.second = 2;

//      To już nam nie zadziała - uzyskaliśmy kontrolę typów i możliwość używania dowolnego typu parametrów

//     - Klasa z dwoma różnymi typami, coś jak mapa
      DoubleTypesPair<String, Integer> doubleTypesPair = new DoubleTypesPair<>("Imie", 2);
      doubleTypesPair.first = "Siema";
      doubleTypesPair.second = 8;

//     - Metoda generyczna
//      String[] strings = {"a", "b", "c"};
//      String middleString = getMiddle(strings);
//      System.out.println(middleString);
//
//      Integer[] integers = {1, 2, 3};
//      Integer middleInteger = getMiddle(integers);
//
//    System.out.println(middleInteger);
  }

    //      - Metoda generyczna

    public static <T> T getMiddle(T[] elements) {
      return elements[elements.length / 2];
    }

}
