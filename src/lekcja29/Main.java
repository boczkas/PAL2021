package lekcja29;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // Stream składa się z operacji pośrednich i operacji terminalnej
    List<String> list = List.of("a", "b", "c");

    Stream<String> b =
        list.stream()
            .filter(
                element -> {
                  System.out.println("ELO!");
                  return element.contains("b");
                });

//    Ile razy wypisze nam się "ELO!" ?
//      A dlaczego? A no dlatego, że nie ma operacji terminalnej.


//      A teraz?

      long count = b.count();

//      Każdy stream może mieć wiele operacji pośrednich i jedną terminalną

//      Przejdziemy teraz przez najczęściej używane operacje pośrednie (i jedną terminalną).

//      1. filter

      List<String> filterList = list.stream()
              .filter(element -> element.contains("b"))
              .collect(Collectors.toList());
      printList(filterList);

//      2. map
      List<String> mapList = list.stream()
              .map(element -> element + "aaa")
              .collect(Collectors.toList());
      printList(mapList);

//      90% rzeczy się tak robi

//      Dlatego tutaj sobie zrobimy przerwę i parę zadań dla Was
      List<Kon> konie = List.of(new Kon("Staszek"), new Kon("Zbyszek"), new Kon("Baska"));

//      Stwórz listę koni, które posiadają literę "a" w nazwie

      List<String> imiona = List.of("Franek", "Andrzej", "Plotka");

    //      Stwórz listę koni na podstawie podanych imion

    //      Stwórz listę koni na podstawie podanych imion, użyj jedynie imion zawierających literę
    // "e"

    //      ======================= WRACAMY =====================
    //      3. flatMap

    List<List<String>> listOfLists =
        List.of(
            List.of("aaaa", "bbb", "cccc"),
            List.of("dddd", "eee", "ffff"),
            List.of("gggg", "hhh", "iiii"));

      List<String> strings = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
      printList(strings);

//    Teraz Wy!
//      Stwórz listę koni na podstawie listOfLists
//      Używając metody count (terminalnej) policz ile String'ów jest krótsza niż 4 w listOfLists
  }

  private static void printList(List<String> list) {
    System.out.println("============================");
    for (String element : list) {
      System.out.println(element);
    }
  }
}
