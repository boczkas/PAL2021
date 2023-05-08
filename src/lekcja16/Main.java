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
    }
}
