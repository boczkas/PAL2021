package lekcja18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set - zbiór
        Set<String> imiona = new HashSet<>();
        imiona.add("Przemek");
        imiona.add("Dominika");
        imiona.add("Tosia");
        imiona.add("Marysia");

        for (String imie : imiona) {
            System.out.println(imie);
        }
        System.out.println("1 ===================");

        imiona.add("Dominika");

        for (String imie : imiona) {
            System.out.println(imie);
        }
        System.out.println("2 ===================");

//        A co z indeksem w Secie?

//        Stworz klase Pies (ma miec imie), albo użyj już istniejacej
//        Stworz Set psów i wypisz je wszystkie
//        "Burek", "Reks", "Azor"

//        Set<Pies> psy = new HashSet<>();
//
//        psy.add(new Pies("Burek"));
//        psy.add(new Pies("Reks"));
//        psy.add(new Pies("Azor"));
//
//        psy.add(new Pies("Azor"));
//
//        for (Pies pies : psy) {
//            System.out.println(pies);
//        }
//        Dodaj kolejnego psa i sprawdz czy sie nie powtorzy



//        Mapa - służy do przechowywania na zasadzie klucz -> wartość

        Map<String, Integer> imieIWiek = new HashMap<>();
        imieIWiek.put("Przemek", 22);
        imieIWiek.put("Jan", 26);
        imieIWiek.put("Jozek", 15);

        imieIWiek.put("Przemek", 32);

//        Iterowanie przez mape
//        1. Wyciagniecie wszystkich kluczy


        for(String klucz : imieIWiek.keySet()) {
            System.out.println(klucz);
        }

        for(Integer wiek : imieIWiek.values()) {
            System.out.println(wiek);
        }

        System.out.println(imieIWiek.get("Przemek"));
//
//        Map<Pies, Integer> piesIWiek = new HashMap<>();
//        piesIWiek.put(new Pies("Azor"), 2);
//        piesIWiek.put(new Pies("Burek"), 4);
//        piesIWiek.put(new Pies("Reks"), 6);
//
//        System.out.println(piesIWiek.get(new Pies("Azor")));
//
//        Map<Integer, Osoba> peseleIOsoby = new HashMap<>();
//        peseleIOsoby.put(123456789, new Osoba("Jan", "Kowalski"));
//        System.out.println("3 ===================");

//        Stworz mape gdzie kluczem jest Pies, a wartością Osoba (nowa klasa, lub użycie istniejącej)

//        Dodaj do niej 3 Psy o imionach: "Burek", "Reks", "Azor"
//        Wartościami sa Osoby o imionach: "Artur", "Karol", "Staszek"
//        Wyciągnij wszyskie klucze

//        2. Wyciąganie pojedynczej wartości
//        System.out.println(imieIWiek.get("Jan"));
//        System.out.println("4 ===================");

//

//        3. Wyciąganie wszystkich wartości
//        for(String klucz : imieIWiek.keySet()) {
//            System.out.println(imieIWiek.get(klucz));
//        }

//        System.out.println("5 ===================");

//        Wyciągnij wszystkie wartości ze swojej mapy
    }
}
