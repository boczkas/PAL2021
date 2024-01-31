package lekcja7;

public class Main {

    public static void main(String[] args) {
//        1. Metody mogą zwracać wartości
//          - Przeróbmy z naszego poprzedniego zadania poleKwadratu(), tak aby zwracało wartość pola kwadratu
//          - Przeróbmy porownywaczka(), tak aby zwracało większą liczbę
//          - Napisz metodę liczącą i zwracającą pole trójkąta (przyjmuje a i h)
//          -* Dla ambitnych: napisz metodę sprawdzającą, czy dana liczba należy do ciągu Fibonacciego


//        System.out.println(poleKwadratu(5));
//        System.out.println(porownywaczka(10, 5));

//        2. Tablice
//          Potrzebujemy przechowywać sobie 5 liczb - 5 zmiennych, 100 liczb - 100 zmiennych. No trochę niewygodne.
//
        int[] liczby = {1, 2, 3 , 4, 5, 6, 7 , 8, 9, 10};
        String[] imiona = {"Antonia", "Maria", "Przemek", "Dominika"};

//        Jak dostać się do pojedynczego elementu?
        int liczba1 = liczby[0];
        int liczba2 = liczby[1];

        System.out.println(liczba1);
        System.out.println(liczba2);
        System.out.println(liczby[6]);

        String imie1 = imiona[0];
        String imie2 = imiona[1];

        System.out.println(imie1);
        System.out.println(imie2);
        System.out.println("-=============================-");
//        Jak wypisać wszystko co jest w danej tablicy?
        for (String s : imiona) {
            System.out.println(s);
        }

        System.out.println("================================");
        for (int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);
        }
//
//        for (int i = 0; i < liczby.length; i++) {
//            System.out.println(liczby[i]);
//        }
//
        System.out.println("================================");
        imiona[0] = "Staszek";

        for (int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);
        }
//
        System.out.println("-=============================-");
//
        wypisywaczka(imiona);
//        forEach


        int[] liczby2 = {5, 6, -1, 2, 90};
        int[] liczby3 = {90, 6, 5, 2, 1};
        int[] liczby4 = {1, 2, 5, 6, 90};
        System.out.println(znajdzNajmniejsza3(liczby2));
        System.out.println(znajdzNajmniejsza3(liczby3));
        System.out.println(znajdzNajmniejsza3(liczby4));
//        System.out.println(znajdzNajmniejsza2(liczby2));
    }

    public static int znajdzNajmniejsza3(int[] tablica) {
        int najmniejsza = tablica[0];
        for (int i : tablica) {
            if (najmniejsza > i) {
                najmniejsza = i;
            }
        }
        return najmniejsza;
    }

    private static int znajdzNajmniejsza2(int[] liczby) {
        int najmniejsza = liczby[0];
        for(int liczba : liczby) {
            if (liczba < najmniejsza) {
                najmniejsza = liczba;
            }
        }
        return najmniejsza;
    }


    private static int poleKwadratu(int bok) {
        return bok * bok;
    }

    public static int porownywaczka(int garnek, int patelnia) {
        if (garnek > patelnia) {
            return garnek;
        } else {
            return patelnia;
        }
    }



    public static void wypisywaczka(String[] tablica) {
        for (String slowo : tablica) {
            System.out.println(slowo);
        }
    }



    public static int znajdzNajmniejsza(int[] tablica) {
        int najmniejsza = tablica[0];

        for (int liczba : tablica) {
            if (liczba < najmniejsza) {
                najmniejsza = liczba;
            }
        }
        return najmniejsza;
    }
}
