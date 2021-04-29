package lekcja8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Zadanie {
    public static void main(String[] args) throws IOException {
//        Pobierz książkę w formacie txt:
//        https://czytac.com/java-book/book/pilipiuk-andrzej_czarownik-iwanow

//        Policz ile ma linii.
//        Policz ile razy występuje słowo "jak"

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
