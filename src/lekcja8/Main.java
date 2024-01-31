package lekcja8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //        1. Operatory bitowe

        // 1    - 0000 0001
        // 4    - 0000 0100
        // 15   - 0000 1111

        // & bitowy and

        int liczba = 4;
        liczba = 0b100;

        System.out.println("liczba = " + liczba);
        int wynik = liczba & 1;



        System.out.println("liczba & 1 = " + wynik);

        wynik = liczba & 15;
        System.out.println("liczba & 15 = " + wynik);

//         | bitowy or
        wynik = liczba | 1;
        System.out.println("liczba | 1 = " + wynik);
//
        wynik = liczba | 15;
        System.out.println("liczba | 15 = " + wynik);

        // >> przesunięcie bitowe w prawo
        wynik = 4 >> 1;
        System.out.println("4 >> 1 = " + wynik);
//
        // << przesunięcie bitowe w lewo
        wynik = 4 << 1;
        System.out.println("4 << 1 = " + wynik);

//        2. Priorytety operatorów
//        Jest cała tabelka:
//        https://introcs.cs.princeton.edu/java/11precedence/

        liczba = 300;
        byte bajcik = (byte) liczba;
        System.out.println(bajcik);


//        3. Łańcuchy - String
        String powitanie = "Czesc";
        System.out.println(powitanie);

//        wyciąganie kawałka
        String kawalek = powitanie.substring(0, 3);
        System.out.println(kawalek);
//
//        String lubiePlacki = "lubie placki";
//        String placki = lubiePlacki.substring(6);
//        System.out.println(placki);
//        utworz Stringa "lubie placki" i zostaw z niego tylko placki
//        składanie wielu stringów
//        String nieLadne = "brzydkie";
//        String wyrazenie = "slowo";
//
//        String wiadomosc = nieLadne + " " + wyrazenie;
//        System.out.println(wiadomosc);
//
//        składanie stringa z nieStringiem
//        int wiek = 18;
//        String ania = "Ala";
//
//
//        System.out.println(ania + " ma " + wiek + " lat ");

//        Znaki specjalne
        System.out.println("Ala ma kota \"Mruczka\"");
        System.out.println("Ala ma kota \\ \"Mruczka\" ");
        System.out.println("Ala ma kota \"Mruczka\"");
        System.out.println("\tLubi myszy \nale bardziej spac");

//        Ala ma kota
//          a kot ma "Ale"

//          Pusty łańcuch


//        String pusty = " ";
//
//        System.out.println(pusty.length() == 0);
//        System.out.println(pusty.isBlank());
//        System.out.println(pusty.isEmpty());

//        2. charAt
//        String witaj = "elo";
//        System.out.println(witaj);
//
//        char znak = witaj.charAt(1);
//        System.out.println(znak);
//
        String tekst = "Ala ma kota, a kot ma ale";
        System.out.println(tekst.contains("ma"));

        int maIndex = tekst.indexOf("ma");
        System.out.println(maIndex);
//
        int ilosc = 0;

        String ma = "ma";
        while (tekst.contains(ma)) {
            ilosc++;
            int maIndex2 = tekst.indexOf(ma);
            tekst = tekst.substring(maIndex2);
        }
        System.out.println("ilosc =" + ilosc);




//        while(tekst.contains("ma")) {
//            ilosc++;
//            int maIndex2 = tekst.indexOf("ma");
//            tekst = tekst.substring(maIndex2 + 2);
//        }

//        System.out.println(ilosc);



//        1. Czy posiada tego stringa?
//        int ilosc = 0;
//        while (tekst.contains("ma")) {
//            ilosc++;
//            int maIndex = tekst.indexOf("ma");
//            tekst = tekst.substring(maIndex + 2);
//        }

//        System.out.println(ilosc);
//        String[] podzielone = tekst.split("ma");
//
//        for(String element : podzielone) {
//            System.out.println(element);
//        }



//        String tekst1 = "Ala ma kota\n, a kot ma ale\n a pies ma kota";
//
//        System.out.println(tekst1);
//      Policz ile linii ma ten String
//      Policz ile razy występuje w tym String'u słowo "ma"
//        int licznikLinii = 0;
//
//
//        String linijka1 = tekst1.substring(tekst1.indexOf("\n") + 1);
//        String linijka2 = linijka1.substring(linijka1.indexOf("\n") + 1);
//        System.out.println("linijka1:" + linijka1);
//        System.out.println("linijka2:" + linijka2);
//
//
//        while(tekst1.contains("\n")) {
//            licznikLinii++;
//            tekst1 = tekst1.substring(tekst1.indexOf("\n") +1);
//        }
//
//        System.out.println("Ilosc linii to: " + licznikLinii);
//
//

//        String[] split = tekst1.split("\n");
//        System.out.println(split.length);
//        4. Wejście/wyjście I/O

//      Wyjście
//        System.out.println("No elo");

//      Wejście
//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj liczbe");
//        System.out.println(in.nextInt());
//        System.out.println("Podaj liczbe jeszcze raz");
//        System.out.println(in.nextDouble());

//      5. Zapis i odczyt plików

//        Odczyt

//        File file = new File(System.getProperty("user.dir") + "/src/lekcja8/test.txt");
//        Scanner scanner = new Scanner(file);
//
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
//
//        System.out.println("=================");
//        // A co to to getProperty?
//        Path fileName = Path.of(System.getProperty("user.dir") + "/src/lekcja8/test.txt");
//        System.out.println("System.getProperty");
//        System.out.println(System.getProperty("user.dir"));
//        String text = Files.readString(fileName);
//        System.out.println(text);

//         Zapis
        FileWriter fileWriter = new FileWriter("src/lekcja8/test2.txt");
        fileWriter.append("Witaj Swiecie!");
        fileWriter.close();

//        String milo = "Bardzo miło z Panstwem pracować!";
//        Files.write(Path.of("src/lekcja5/test.txt"), milo.getBytes(), StandardOpenOption.APPEND);
    }
}
