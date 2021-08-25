package lekcja19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        1. Mamy krzykacza, spróbujmy sobie go jeszcze raz zaimplementować

        Krzykacz krzykacz = () -> System.out.println("lalala");
        krzyczacaMetoda(krzykacz);

//        2. Możemy sobie "w miejscu" stworzyć implementację interfejsu

        krzyczacaMetoda(() -> System.out.println("lalalala"));

//        3. Referencja do metody

        krzyczacaMetoda(System.out::println);

//        Z managerem
        Manager manager = pracownik -> System.out.println(pracownik);
//        Manager manager = System.out::println;

        managerowaMetoda(manager, new Pracownik("Dominik", 10000));

//        4. Zakres zmiennych
        stworzKrzykacza("Czesc");
//        stworzWielokrotnegoKrzykacza("Czesc", 5);
//        effecively final - faktycznie finalna



//        WYJĄTKI
//        Do tej pory pisaliśmy tak jakby wszystko było wprowadzane zgodnie z zaleceniami
//        Jakie są dwie ścieżki, gdy pojawi się błąd?
//          1. Powrócić do bezpiecznego stanu systemu i pozwolić wydać inne polecenie
//          2. Grzecznie poskładać całą aplikację ZAPISUJĄC co się podziało, że się przekręciła

//        Hierarcha wyjątków w Javie:
//        https://kobietydokodu.pl/wp-content/uploads/2016/05/wyjatki-w-javie.001.jpeg

//        Jak stworzyć własny wyjątek? Checked? Unchecked?
//        throw new Wyjatek();

//        =================================
//        =================================
//        =================================

//        SZYBKI KURS BRAKUJACYCH RZECZY

//        Kolekcje
//          1. Listy
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        System.out.println("stringList size: " + stringList.size());
        stringList.get(0);
        stringList.remove(0);

        stringList = new LinkedList<>();


//        2. Set
        Set<String> stringSet = new HashSet<>();
        stringSet.add("a");
        stringSet.add("a");
        System.out.println(stringSet.size());
        stringSet.contains("a"); // nie ma 'get', bo nie ma indeksów

        stringSet = new TreeSet<>();

//        3. Map
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("a", 2);
        stringIntegerMap.put("b", 3);
        stringIntegerMap.put("a", 5);
        System.out.println(stringIntegerMap.size());
        stringIntegerMap.get("a");

        stringIntegerMap = new TreeMap<>();



//        SOLID
//        S - Single Responsibility Principle
//        O - Open/Closed Principle
//        L - Liskov Principle
//        I - Interface Segregation Principle
//        D - Dependency Inversion Principle

    }


//    private static void stworzWielokrotnegoKrzykacza(String czesc, int ileRazy) {
//        for (int i = 0; i < ileRazy; i++) {
//            Krzykacz krzykacz = () -> System.out.println(czesc + " po raz " + i);
//        }
//    }

    private static void stworzKrzykacza(String tekst) {
        Krzykacz krzykacz = () -> System.out.println(tekst);
    }

    public static void krzyczacaMetoda(Krzykacz krzykacz) {
        krzykacz.wydajDzwiek();
    }

    public static void managerowaMetoda(Manager manager, Pracownik pracownik) {
        manager.przekazInformacje(pracownik);
    }
}

