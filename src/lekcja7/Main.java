package lekcja7;

public class Main {

    public static void main(String[] args) {
//        1. Metody mogą zwracać wartości
//          - Przeróbmy z naszego poprzedniego zadania poleKwadratu(), tak aby zwracało wartość pola kwadratu
//          - Przeróbmy porownywaczka(), tak aby zwracało większą liczbę
//          - Napisz metodę liczącą i zwracającą pole trójkąta (przyjmuje a i h)
//          -* Dla ambitnych: napisz metodę sprawdzającą, czy dana liczba należy do ciągu Fibonacciego

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

        String imie1 = imiona[0];
        String imie2 = imiona[1];

        System.out.println(imie1);
        System.out.println(imie2);

//        Jak wypisać wszystko co jest w danej tablicy?
        for (int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);
        }

//        forEach

//        Napisać metodę przyjmującą tablicę liczb naturalnych i zwracającą ich sumę.
    }


    private static void poleKwadratu(int bok) {
        System.out.println(bok * bok);
    }

    public static void porownywaczka(int garnek, int patelnia) {
        if (garnek > patelnia) {
            System.out.println(garnek);
        } else {
            System.out.println(patelnia);
        }
    }
}
