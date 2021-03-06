package lekcja15;

import lekcja14.Pracownik;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        1. Wstawianie do tablicy
//          Deklaracja tablicy
        Zwierze[] tablica = new Zwierze[10];
        tablica[0] = new Pies("Burek");
        tablica[1] = new Kot("Staszek");
        tablica[2] = new Kot("Miauczek");

//        2. Wstawianie do listy
//          Deklaracja listy
//        ArrayList - generyczna klasa z parametrem typu - co to oznacza? Możemy podać tutaj dowolny typ referencyjny
        ArrayList<Zwierze> lista = new ArrayList<>();
        lista.add(new Pies("Dexter"));
        lista.add(new Kot("Mruczek"));
        lista.add(new Kot("Miauczek"));

        //        Java 11
        var zwierzetaArrayList = new ArrayList<Zwierze>();

//        3. Dostęp do elementów tablicy
//        System.out.println("tablica element 0 " + tablica[0]);
//        System.out.println("tablica element 1 " + tablica[1]);
//        System.out.println("tablica element 2 " + tablica[2]);
//        System.out.println("tablica element 11 " + tablica[11]);

//        4. Dostęp do elementów listy
//        System.out.println("lista element 0 " + lista.get(0));
//        System.out.println("lista element 1 " + lista.get(1));
//        System.out.println("lista element 2 " + lista.get(2));
//        System.out.println("lista element 2 " + lista.get(11));


//        5. Iterowanie po wszystkich elementach

        ArrayList<Kot> kociaki = new ArrayList<>();
        kociaki.add(new Kot("Staszek"));
        kociaki.add(new Kot("Jozek"));
        kociaki.add(new Kot("Mruczek"));
        kociaki.add(new Kot("Wariot"));

        for (Kot kociak : kociaki) {
            System.out.println(kociak);
        }

        System.out.println("=======================");

        for (int i = 0; i < kociaki.size(); i++) {
            System.out.println(kociaki.get(i));
        }

        System.out.println("======================");

// //        6. Usuwanie elementów z listy
        kociaki.remove(1);

        for (Kot kociak : kociaki) {
            System.out.println(kociak);
        }

        System.out.println("======================");
        kociaki.remove(new Kot("Mruczek"));

        for (Kot kociak : kociaki) {
            System.out.println(kociak);
        }

//        7. Lista liczb całkowitych
//        ArrayList<int> liczbyCalkowite = new ArrayList<int>();
        ArrayList<Integer> liczbyCalkowite = new ArrayList<>();
        Integer liczba = 10;

//        Integer - typ opakowywujący. Występują dla każdego typu prymitywnego
//        int - Integer
//        long - Long
//        boolean - Boolean
//        void - Void
//        ...

//  //      8. Metody ze zmienną liczbą parametrów
//  //      Metoda printf
        System.out.println();
        System.out.print("Ala");
        System.out.printf("Ala");
        System.out.printf("%s", "Ala", 7, 19, "Kot");
        System.out.printf("%d\n", 7);
        System.out.printf("%s = %d", "ilośc dni w roku", 365);
        System.out.println();

        wyswietlKoty(new Kot("Staszek"), new Kot("Jozek"), new Kot("Mruczek"));
//        W obu przypadkach wywołana jest ta sama metoda mimo, że w pierwszym przypadku przekazujemy 2 parametry,
//        a w drugim 3. Co tu się tak na prawdę dzieje?
//        Co gdy przekazujemy parametr jako prymitywa? Przecież nie dziedziczą po Object

//        9. Można tworzyć własne metody ze zmienną liczbą parametrów (również prymitywnymi)
//          Napisz metodę wyświetlKoty(), przyjmującą dowolna ilość kotów po czym ją wyświetlającą

        ArrayList<Pomiar> krytyczneWartosci = new ArrayList<>();
        krytyczneWartosci.add(new Pomiar(100, "01.01.2021"));
        krytyczneWartosci.add(new Pomiar(0, "01.02.2021"));

        Pomiar pomiarZCzujnika = new Pomiar(20, "17.06.2021");

    }

    public static void wyswietlKoty(Kot... koty) {
        System.out.println("=======***********");
        for (Kot kot : koty) {
            System.out.println(kot);
        }
    }
}
