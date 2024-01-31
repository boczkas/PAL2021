package lekcja22;

import lekcja17.Pracownik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
//      TEGO NIE ROB IDZ DO SPRINGA


//      1. Programowanie generyczne
//    Chcielibyśmy zrobić pary różnych typów
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
      List<String> lista = new ArrayList<>();
      Set<String> set = new HashSet<>();
//      stringPair.second = 2;

//      To już nam nie zadziała - uzyskaliśmy kontrolę typów i możliwość używania dowolnego typu parametrów

//     - Klasa z dwoma różnymi typami, coś jak mapa
      DoubleTypesPair<String, Integer> doubleTypesPair = new DoubleTypesPair<>("Imie", 2);
      doubleTypesPair.first = "Siema";
      doubleTypesPair.second = 8;

//     - Metoda generyczna
      String[] strings = {"a", "b", "c"};
      String middleString = getMiddle(strings);
      System.out.println(middleString);

      Integer[] integers = {1, 2, 3};
      Integer middleInteger = getMiddle(integers);

    System.out.println(middleInteger);
  }

    //      - Metoda generyczna

    public static <T> T getMiddle(T[] elements) {
      return elements[elements.length / 2];
    }

}
