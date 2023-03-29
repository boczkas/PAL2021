package lekcja16;

import lekcja19.Pies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Wracamy do enuma
//          - Stworzyć sobie enuma do dni, na zasanie PN, WT, SR.
//              Enum to tak na prawdę klasa. To co sobie tam tworzymy to instancje tej klasy.

        DzienTygodnia dzienTygodnia = DzienTygodnia.PN;

        if (dzienTygodnia.equals(DzienTygodnia.PN)) {
            System.out.println("Dzis jest niedziela");
        }

        Zwierze zwierze = new Kot("a", 2);

        Miesiac miesiac = Miesiac.LUTY;

        if (miesiac == Miesiac.LUTY) {
            System.out.println("Prawda");
        }
        System.out.println(miesiac);

//        DzienTygodnia dzienTygodnia = DzienTygodnia.PT;

//        2. Refleksja - dwa słowa
//        Java ma bibliotekę pozwalającą na analizowanie klas
        Kot dachowiec = new Kot("Dachowiec", 2);
        Class aClass = dachowiec.getClass();

        System.out.println(aClass.getName());

        for(Field pole : aClass.getDeclaredFields()) {
            System.out.println(pole);
        }

//
//
//      PRZEROBIĆ WYJĄTKI TAK, ŻEBY ZACZĄĆ OD TWORZENIA WŁASNYCH
//
//

//        3. Podstawy przechwytywanie wyjątków
//          Co to jest wyjątek? Nieoczekiwane zachowanie programu. Możemy go obsłużyć, tak, aby program nie zdechł.
//          Mamy dwa rodzaje wyjątków checked i unchecked - sprawdzane i nie sprawdzane.
//
//              - checked

        File file = new File("lalala");
        try {
            FileInputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("nie ma takiego pliku");
        }


//        try {
//            FileInputStream inputStream = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        File file = new File("lala");
//        try {
//            FileInputStream inputStream = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("Nie ma takiego pliku");
//        }

//              - unchecked
//        Kompilator nie wymusza na nas ich obsługi, ale wiedząc, że taki może wystąpić możemy go obsłużyć

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        String next = scanner.next();

        try {
            int liczba = Integer.parseInt(next);
            System.out.println(liczba);
        } catch (NumberFormatException e) {
            System.out.println("To nie liczba!");
        }


//        System.out.println("Podaj liczbe");
        next = scanner.next();

        if (next.matches("[0-9]+")) {
            System.out.println("To liczba");
        } else {
            System.out.println("To nie liczba");
        }

//        Pokazać przykłady
//        Napisać do okoła tego ładnego try/catcha

//        4. Porady projektowe dotyczące dziedziczenia
//          - nie używaj
//          - wspólne metody i pola umieszczaj w nadklasach
//          - dziedziczenia używaj do określania relacji typu JEST
//          - nie używaj dziedziczenia jeśli któraś z metod nie działa poprawnie (Kot dziedziczący po Psie)
//          - nadpisując metodę nie zmieniaj jej oczekiwanego zachowania
//          - wykorzystuj polimorfizm zamiast wykorzystywania informacji o typach
    }

    static void rzucacz() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    static void elo() throws FileNotFoundException {
        rzucacz();
    }
}
