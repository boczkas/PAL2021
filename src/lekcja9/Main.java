package lekcja9;

import java.util.Scanner;

public class Main {
//    1. Programowanie proceduralne vs strukturalne
//      To co robiliśmy do tej pory było strukturalne.
//      Mieliśmy dane na wejściu -> wymyślaliśmy algorytm -> dane na wyjściu
//    Tak się programowało jakieś 30 lat temu ;)

//    Pomyślmy jak zbudować program proceduralny obsługujący taką stronkę:
//    https://www.onet.pl/
//    Trochę linii do obsługi każdej ikonki, przycisku, wyświetlenia by było

//    Teraz podchodzi się do sprawy inaczej, a mianowicie stara się opisać dziedzinę problemu za pomocą obiektów i klas

//    2. Co to jest klasa?
//    Jest to szablon - pokazówka
//    Konstruując obiekt tworzymy egzemplarz (instancję) danej klasy
//    Biblioteka Javy ma mnóstwo swoich klas wbudowanych do obsługi dat, tekstu, kolekcji danych, ale nadal
//    konieczna jest konstrukcja własnych klas dostosowanych do dziedziny problemu, który rozwiązujemy

//    Zróbmy klasę Kot. Ma imię i wiek.
//    Jak dostać się do pól kota?
//    Jak zrobić żeby kod zamiałczał?

//    Zadanie zróbcie klasę Robak. Ma mieć imię i ilość nóg.

//    3. Hermetyzacja
//    Ukrywanie zbędnych dla użytkownika klasy szczegółów przez twórcę klasy.
//    Czy wiesz jak działa telewizor?

//    Czy wiesz jak działa odpalenie samochodu?

    public static void main(String[] args) throws InterruptedException {

//        Kot mruczek = new Kot();
//        mruczek.imie = "Mruczek";
//        mruczek.wiek = 4;
//
//        System.out.println(mruczek.imie);
//        System.out.println(mruczek.wiek);
//
//        mruczek.miaucz("Przemek");
//        Robak staszek = new Robak();
//        staszek.imie = "Staszka";
//        mruczek.jedz(staszek);


//        Kot miauczek = new Kot();
//        miauczek.imie = "Miauczek";
//        miauczek.wiek = 4;
//        miauczek.miaucz("Eryk");


//        Arbuz fioletowyArbuz = new Arbuz();
//        fioletowyArbuz.kolor = "fioletowy";
//
//        Kot mruczek = new Kot();
//        mruczek.imie = "Mruczek";
//        mruczek.wiek = 4;
//
//        mruczek.miaucz();
//        mruczek.przedstawSie();
//        mruczek.przywitajSie("Przemek");
//        mruczek.skakaj();

//        Nasz Kot łapie Robaka,
//        napisz metodę przywitajRobaka() w Kot, która wypisze "O kurde, złapałem robaka, o imieniu " ...

        Samochod stilo = new Samochod();
        stilo.odpal();

//        Kino kino = new Kino();
//        kino.rezerwujMiejsce(1);

//        1. Kino ma mieć 3 sale z miejscami
//        2.
    }

//    Hermetyzacja sprawia, że obiekty są dla nas czarną skrzynką

}
