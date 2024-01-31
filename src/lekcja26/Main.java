package lekcja26;



import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Graph:
//      https://www.codejava.net/java-core/collections/overview-of-java-collections-framework-api-uml-diagram

//      Której kolekcji użyć?
//      https://i.stack.imgur.com/aSDsG.png

//      Nie chcę robić przejścia przez każdą kolekcję, bo się zanudzimy.
//      Przejdziemy sobie przez powyższy diagram i pooglądamy co się dzieje
      Set<String> strings = new Set<String>() {
          @Override
          public int size() {
              return 0;
          }

          @Override
          public boolean isEmpty() {
              return false;
          }

          @Override
          public boolean contains(Object o) {
              return false;
          }

          @Override
          public Iterator<String> iterator() {
              return null;
          }

          @Override
          public Object[] toArray() {
              return new Object[0];
          }

          @Override
          public <T> T[] toArray(T[] a) {
              return null;
          }

          @Override
          public boolean add(String s) {
              return false;
          }

          @Override
          public boolean remove(Object o) {
              return false;
          }

          @Override
          public boolean containsAll(Collection<?> c) {
              return false;
          }

          @Override
          public boolean addAll(Collection<? extends String> c) {
              return false;
          }

          @Override
          public boolean retainAll(Collection<?> c) {
              return false;
          }

          @Override
          public boolean removeAll(Collection<?> c) {
              return false;
          }

          @Override
          public void clear() {

          }
      };

      Map<String, String> stringStringMap = new TreeMap<>();

      stringStringMap.put("b", "b");
      stringStringMap.put("a1", "a1");
      stringStringMap.put("a2", "a2");
      stringStringMap.put("a3", "a3");
      stringStringMap.put("a4", "a4");

      for(String value : stringStringMap.values()) {
        System.out.println(value);
      }

//      Comparator<Pracownik> pracownikComparator = Comparator.comparingInt(pracownik -> pracownik.getImie().length());
//      Map<Pracownik, String> pracownikStringMap = new TreeMap<>(pracownikComparator);
//      pracownikStringMap.put(new Pracownik("aaaaa", 2), "a");
//      pracownikStringMap.put(new Pracownik("bb", 3), "b");
//      pracownikStringMap.put(new Pracownik("ccc", 4), "c");
//
//      for(String value : pracownikStringMap.values()) {
//          System.out.println(value);
//      }

      Set<String> set = new HashSet<>();

      Map<String, Integer> stringIntegerMap = new TreeMap<>();
    System.out.println("===============================");
    stringIntegerMap.put("1", 1);
    stringIntegerMap.put("21", 21);
    stringIntegerMap.put("10", 10);
    stringIntegerMap.put("11", 11);
    stringIntegerMap.put("2", 2);
    stringIntegerMap.put("3", 3);

    for (Integer liczba : stringIntegerMap.values()) {
      System.out.println(liczba);
    }

    Set<String> stringSet = new LinkedHashSet<>();
  }
}
