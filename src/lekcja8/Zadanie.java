package lekcja8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Zadanie {
    public static void main(String[] args) throws IOException {
//        0.
//        String tekst1 = "Ala ma kota\n, a kot ma ale\n a pies ma kota";
//
//        System.out.println(tekst1);
//      Policz ile linii ma ten String

//        1. Napisz metodę sprawdzającą czy słowo jest palindromem - od początku i od końca czyta się go tak samo
//          ala -> true
//          kajak -> true
//          kot -> false
//        2.
//        Policz ile linii ma książka.
//        Policz ile razy występuje słowo "dolor"

        Path fileName = Path.of(System.getProperty("user.dir") + "/src/lekcja8/ksiazka.txt");
        System.out.println(System.getProperty("user.dir"));
        String text = Files.readString(fileName);
        System.out.println(text);

        String[] split = text.split("\n");

        System.out.println("Ksiazka ma " + split.length + 1 + " linii");

        policzSlowo(split, "jak ");


    }

    private static void policzSlowo(String[] tablicaLinii, String slowo) {
        int licznikSlowa = 0;
        for(String linia : tablicaLinii) {
            while(linia.contains(slowo)) {
                licznikSlowa++;
                linia = linia.substring(linia.indexOf(slowo) + 1);
            }
        }
        System.out.println("Ksiazka ma " + licznikSlowa + " wystapien slowa " + slowo);
    }
}
