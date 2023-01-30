package lekcja24;


import lekcja14.Pracownik;
import lekcja14.obywatel.Manager;
import lekcja14.obywatel.Obywatel;
import lekcja22.Pair;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
//    Metody generyczne
    String[] strings = {"a", "b", "c"};
    System.out.println(getMiddle(strings));
    Integer[] integers = {1,3,4};
    System.out.println(getMax(integers));
    System.out.println(getMax(strings));

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
