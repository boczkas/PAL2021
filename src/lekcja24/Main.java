package lekcja24;


import lekcja14.Pracownik;
import lekcja14.obywatel.Manager;
import lekcja14.obywatel.Obywatel;
import lekcja23.Pair;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
//    Metody generyczne
    String[] strings = {"a", "b", "c"};
    System.out.println(getMiddle(strings));
    Integer[] integers = {1,3,4};
    System.out.println(getMax(integers));
    System.out.println(getMax(strings));

    Pracownik[] pracowniks = {new Pracownik("a", 1), new Pracownik("b", 2), new Pracownik("c", 3)};
//    System.out.println(getMax(pracowniks));

//      Informacyjnie:
//      W maszynie wirtualnej nie ma typów generycznym (erasing).
//      Są one zastępowane najbardziej granicznym typem dla generyka
//      Dla czystego T -> Object, dla T extends Comparable -> Comparable
//      - nie da się używać typów prostych jako parametru typowego List<int> - nie działa
//      - nie da się sprawdzać czy coś jest instancją typu sparametryzowanego
//          if (a instanceof Pair<String>) tak na prawdę sprawdzi nam tylko czy
//          jest instancja Pair - JVM wymazuje typ generyczny


      Pair<String> stringPair = new Pair<>("a", "b");
      Pair<Integer> integerPair = new Pair<>(1, 2);

      Class<? extends Pair> stringPairClass = stringPair.getClass();
      Class<? extends Pair> integerPairClass = integerPair.getClass();
      System.out.println(stringPairClass.equals(integerPairClass));

//      - nie można tworzyć tablic typów generycznych
//      Pair<String>[] pairs = {new Pair<>("a", "b"), new Pair<>("a", "b")};

//      Tych reguł jest dużo więcej. Wynikają w większości z wymazywania typów przez JVM



//      Dziedziczenie typów generycznych

//      Manager dziedziczy po Obywatel
      Pair<Manager> managerPair = new Pair<>(new Manager(), new Manager());
      Pair<Obywatel> obywatelPair = new Pair<>(new Obywatel(), new Obywatel());

//      obywatelPair = managerPair;

//      czyli Pair<Manager> nie dziedziczy po Pair<Obywatel>

//      WILDCARD <?>
//      Czasami mamy wyrąbane na to jaki typ przychodzi. Nie mamy potrzeby korzystania z niczego związanego
//      z typem
      List<String> stringList = new ArrayList<>();
      stringList.add("a");
      stringList.add("b");
      stringList.add("c");

    System.out.println(checkLength(stringList));

//    extends - ? extends T - coś ma rozszerzać T (lub być T)
//    super - ? super T - coś ma być nadtypem T (lub być T)

//    PECS - producer extends, consumer super

  }

    public static <T> T getMiddle(T[] elements) {
        return elements[elements.length / 2];
    }

//    public static <T> T getMax(T[] elements) {
//        if (elements == null || elements.length == 0) {
//            throw new IllegalArgumentException();
//        }
//        T max = elements[0];
//
//        for(var element: elements) {
//            if (element.compareTo(max) > 0) {
//                max = element;
//            }
//        }
//        return max;
//    }

    public static <T extends Comparable<T>> T getMax(T[] elements) {
      if (elements == null || elements.length == 0) {
          throw new IllegalArgumentException();
      }
      T max = elements[0];

      for(var element: elements) {
          if (element.compareTo(max) > 0) {
              max = element;
          }
      }
      return max;
    }

    public static boolean checkLength(List<?> list) {
      return list.size() > 5;
    }
}
