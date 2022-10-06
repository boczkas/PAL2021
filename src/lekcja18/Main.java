package lekcja18;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

//        Strategia

        Kaczka kaczka = new PrawdziwaKaczka();
        String zKlawiatury = "na polowanie";

        System.out.println("Idziesz posluchac spiewu, czy postrezlac?");
        if(zKlawiatury.equals("na polowanie")) {
            kaczka = new PrzynetaNaPolowaniaKaczka();
        }
        kaczka.kwacz();


//        Mamy to co ostatnio
        Pracownik nikoletta = new Pracownik("Nikoletta", 0);
        Pracownik ania = new Pracownik("Ania", 1000000);
        Pracownik przemek = new Pracownik("Przemek", 5000);
        Pracownik barylek = new Pracownik("Baryłek", 20000);

        Pracownik[] pracownicy = {nikoletta, ania, przemek, barylek};

//        Chcemy posortować sobie pracowników.
//        Najpierw po wypłacie, a potem po długości imienia.
//
//        Jak to zrobić? Nie da się przecież zaimplementować dwa razy Comparabla

//        To nam rzuca wyjątek:
//        Arrays.sort(pracownicy);

//        To co możemy zrobić to użyć Arrays.sort() z podawanym sposobem sortowania

        Comparator<Pracownik> comparatorWyplaty = new Comparator<Pracownik>() {
            @Override
            public int compare(Pracownik o1, Pracownik o2) {
                return (int) (o1.wyplata - o2.wyplata);
            }
        };

        Arrays.sort(pracownicy, comparatorWyplaty);

        for (Pracownik pracownik : pracownicy) {
            System.out.println(pracownik);
        }

//        To teraz po imionach
        Comparator<Pracownik> comparatorImienia = new Comparator<Pracownik>() {
            @Override
            public int compare(Pracownik o1, Pracownik o2) {
                return  o1.imie.length() - o2.imie.length();
            }
        };

        System.out.println("========================");
        Arrays.sort(pracownicy, comparatorImienia);

        for (Pracownik pracownik : pracownicy) {
            System.out.println(pracownik);
        }

//        Popatrzmy sobie, że w obu przypadkach coś nam się świeci na szaro. Skopiowany Comparator imienia:
//        Przerobić na lambde
        Comparator<Pracownik> comparatorImienia2 = new Comparator<Pracownik>() {
            @Override
            public int compare(Pracownik o1, Pracownik o2) {
                return  o1.imie.length() - o2.imie.length();
            }
        };

//
        System.out.println("========================");
        Arrays.sort(pracownicy, comparatorImienia2);

        for (Pracownik pracownik : pracownicy) {
            System.out.println(pracownik);
        }
//
//        To co nam się tu pojawiło to lambda
//        Lambdy umożliwiają przekazywanie sobie między obiektami kawałków kodu
//        Lambdy należy traktować jak funkcje, które możemy sobie przekazywać

//        Wróćmy do naszego krzykacza.
//        Dodałem tam adnotację markerową (czyli taką, która nic nie robi a jedynie daje informację)
//        @FunctionalInterface
//        oznacza się taką adnotacją interfejsy, które mają tylko jedną metodę abstrakcyją.

//        Spróbujmy zaimplementować wielojęzykowych Krzykaczy za pomocą lambdy

        Krzykacz polskiKrzykacz = () -> System.out.println("O Ty małpo!");
        Krzykacz angielskiKrzykacz = () -> System.out.println("You son of a donkey!");

        polskiKrzykacz.wydajDzwiek();
        angielskiKrzykacz.wydajDzwiek();
//
//        Wielokrotny krzykacz

        Krzykacz wielokrotnyKrzykacz = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Krzyczę po raz " + (i + 1) + "!");
            }
        };

        wielokrotnyKrzykacz.wydajDzwiek();

//        Możemy przekazać teraz tą konkretną implementację do metody

        nakrzykiwacz(polskiKrzykacz);
        nakrzykiwacz(angielskiKrzykacz);
        nakrzykiwacz(wielokrotnyKrzykacz);
//
//        Dorób krzykacza opierdzialającego za nie umyte gary


//        Mamy nowy interfejs Manager do krzyczenia na Pracownika
//        Stwórzmy sobie kilka jego implementacji za pomocą lambd

        Manager milyManager = pracownik -> System.out.println("Prosiłbym o oddalenie się Panie/Pani " + pracownik.imie);
        Manager niemilyManager = pracownik -> System.out.println("Wydupcaj Panie/Pani " + pracownik.imie);
//
        milyManager.przekazInformacje(przemek);
        niemilyManager.przekazInformacje(barylek);
//     Pousuwajmy typy, bo nie potrzebne z tego względu, że kompilator jest je sobie w stanie wydedukować

//        Dorób Managera informującego o podwyżce
        PracownikMiesiaca pracownikMiesiaca = new PracownikMiesiaca("aa", 400000);
        milyManager.przekazInformacje(pracownikMiesiaca);

    }

    public static void nakrzykiwacz(Krzykacz krzykacz) {
        krzykacz.wydajDzwiek();
    }
}
