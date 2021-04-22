package lekcja8;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //        1. Operatory bitowe

        // 1    - 0000 0001
        // 4    - 0000 0100
        // 15   - 0000 1111

        // & bitowy and

//        int liczba = 4;
//        liczba = 0b100;
//
//        System.out.println("liczba = " + liczba);
//        int wynik = liczba & 1;
//
//        System.out.println("liczba & 1 = " + wynik);
//
//        wynik = liczba & 15;
//        System.out.println("liczba & 15 = " + wynik);
//
//        // | bitowy or
//        wynik = liczba | 1;
//        System.out.println("liczba | 1 = " + wynik);
//
//        wynik = liczba | 15;
//        System.out.println("liczba | 15 = " + wynik);
//
//        // >> przesunięcie bitowe w prawo
//        wynik = 4 >> 1;
//        System.out.println("4 >> 1 = " + wynik);
//
//        // << przesunięcie bitowe w lewo
//        wynik = 4 << 1;
//        System.out.println("4 << 1 = " + wynik);

//        2. Priorytety operatorów
//        Jest cała tabelka:
//        https://introcs.cs.princeton.edu/java/11precedence/


//        3. Łańcuchy - String
        String powitanie = "Cześć";
        System.out.println(powitanie);

//        wyciąganie kawałka
        String kawalek = powitanie.substring(0, 3);
        System.out.println(kawalek);

//        składanie wielu stringów
        String nieLadne = "brzydkie";
        String wyrazenie = "slowo";

        String wiadomosc = nieLadne + wyrazenie;
        System.out.println(wiadomosc);

//        składanie stringa z nieStringiem
        int wiek = 18;
        String ania = "Ania";

        System.out.println(ania + " ma " + wiek + " lat ");

//        Znaki specjalne
        System.out.println("Jej mąż nazywany był \"Baryłem\"");
        System.out.println("\tLubił platformy \nale bardziej grać w gry");

//          Pusty łańcuch


//        String pusty = "";
//
//        System.out.println(pusty.length() == 0);
//        System.out.println(pusty.isEmpty());

//        2. charAt
//        String witaj = "elo";
//        System.out.println(witaj);
//
//        char znak = witaj.charAt(1);
//        System.out.println(znak);

//        4. Wejście/wyjście I/O

//      Wyjście
//        System.out.println("No elo");

//      Wejście
//        Scanner in = new Scanner(System.in);
//        in.nextInt();
//        in.nextDouble();

//      5. Zapis i odczyt plików

//        Odczyt

//        Path fileName = Path.of(System.getProperty("user.dir") + "/src/lekcja8/test.txt");
//        System.out.println(System.getProperty("user.dir"));
//        String text = Files.readString(fileName);
//        System.out.println(text);

//         Zapis
//        FileWriter fileWriter = new FileWriter("src/lekcja8/test2.txt");
//        fileWriter.append("Cześć Nikoletta!");
//        fileWriter.close();
//
//        String milo = "Bardzo miło z Panią pracować!";
//        Files.write(Path.of("src/lekcja5/test.txt"), milo.getBytes(), StandardOpenOption.APPEND);
    }
}
