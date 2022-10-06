package lekcja2;

import lekcja14.Kot;

public class Main {
    public static void main(String[] args) {
//        1. char - pojedynczy znak - z tego składają się Stringi
        char znak = 'a';
        System.out.println(znak);
//        2. boolean - prawda/fałsz
        boolean logika = true;
        logika = false;

        System.out.println(logika);
//        3. Co to są te // ?
//        Komentarze w kodzie - nie są w żaden sposób interpretowane.

// komentarz pojedynczej linijki Ctrl + /
//        komentarz wielolinijkowy


        /*
        lalalal
                lalala
                lalala
                        lalala
                        lalala
                                lalala
         */

//        3. Nazewnictwo zmiennych
//          nazwa zmiennej musi zaczynać się literą i składać z liter i cyfr

        double wyplata123;
        int liczbaDniWolnychOdPracyW2021RokuPoOdliczeniuSwiatNarodowych;
        long populacjaLudnosciNaZiemi;
        boolean zrobione;

//        4. zmienne trzeba zainicjalizować
        int wiek = 5;
        System.out.println(wiek);

//        deklarację zmiennych można przeplatać z regularnym kodem
//        dobry styl programowania, to deklarowanie zmiennych jak najbliżej ich użycia
        boolean prawdaCzyFalsz = true;
        System.out.println("Coś tam coś tam" + prawdaCzyFalsz);

        String jakisTekst = "jakis tam tekst";
        System.out.println(jakisTekst);

//        5. Stałe
//          stałe oznaczamy słówkiem final i piszemy dużymi literami

        final String IMIE = "Przemek";
        System.out.println("Twoje imie to " + IMIE);

//        IMIE = "Staszek";
//        System.out.println(IMIE);

//        6. Operatory: +, -, *, / , %
        System.out.println("1 + 2 = " + (1 + 2));
        System.out.println("1 - 2 = " + (1 - 2));
        System.out.println("2 * 2 = " + (2 * 2));
        System.out.println("9 / 3 = " + (9 / 3));
        System.out.println("5 % 2 = " + (5 % 2));

//        7. Napiszmy program liczący pole prostokąta.
//        Zadeklaruj zmienne a,b, rezultat

        int a = 2;
        int b = 7;

        int pole = a * b;

        System.out.println("Pole prostokąta o boku " + a + " i " + b + " to: " + pole);
//
        double bokA = 1.5;
        double wysokosc = 3.5;

        double poleTrojkata = 0.5 * bokA * wysokosc;

        System.out.println(poleTrojkata);
//
//        double promien = 5;
//double poleKola = Math.PI * promien * promien;
    }
}
