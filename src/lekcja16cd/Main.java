package lekcja16cd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Wyjątki
//        Są to nieoczekiwane zachowania programu

//        W Javie mamy Erorry i Exception'y
//        Errory są związane z zasobami i się już z nich nie wykaraskamy

//        Wyjątki dzielą się na takie, które trzeba obsłużyć i takie, których nie trzeba

//        Stworzyć metodę rzucającą DoSprawdzeniaException
//        Stworzyć metodę wołającą w sobie poprzednią metodę, co można tutaj zrobić?

//        Co się tam dzieje?

//        Teraz zróbmy metodę, która rzuca wyjątek NieTrzebaSprawdzacException


//        A teraz realne przypadki

//        --- checked exception

        File file = new File("lalala");
        try {
            FileInputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("nie znaleziono pliku \n" + e);
        }

//        --- unchecked exception
        Scanner scanner = new Scanner(System.in);

        int liczba = scanner.nextInt();
        System.out.println(liczba);

        bedeRzucalaWyjtkiem();

    }

    public static void bedeRzucalaWyjtkiem() {
        throw new NieTrzebaSprawdzacException();
    }
}
