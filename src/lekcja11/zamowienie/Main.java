package lekcja11.zamowienie;

import lekcja10.Kino;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kino kino = new Kino();
        kino.rezerwujMiejsce(1);
        kino.rezerwujMiejsce(1);
//        kino.zwolnijMiejsce(1);
//        kino.zwolnijMiejsce(2);
        kino.rezerwujMiejsce(3);
        kino.rezerwujMiejsce(4);
//        kino.pokazStatusMiejsc();
//        kino.zwolnijWszystkie();
//        kino.pokazStatusMiejsc();

//        Zadanie:
//    kino.rezerwujMiejsce(1); - powinno zarezerwować pierwsze miejsce o ile jest dostępne.
//    kino.zwolnijMiejsce(1); - powinno zwolnić pierwsze miejsce o ile było zajęte.
//    kino.pokazStatusMiejsc() - powinno wypisać status wszystkich miejsc.
//    kino.zwolnijWszystkie() - powinno zwolnić wszystkie miejsca


//        1. Kino ma mieć 3 sale z 5 miejscami
//              - kino.rezerwujMiejsce(1); - powinno zarezerwować pierwsze miejsce na dowolnej sali, o ile jest dostępne.
//              - kino.zwolnijMiejsce(1, 2); - powinno zwolnić drugie miejsce na pierwszej sali, o ile było zajęte.
//              - kino.pokazStatusMiejsc() - powinno wypisać status wszystkich miejsc ze wszystkich sal uwzględniając numer sali.
//              - kino.zwolnijWszystkie(1) - powinno zwolnić wszystkie miejsca na pierwszej sali
//        2. Na każdej z sal ma być wyświetlany inny Film (też klasa)
//        3. kino.rezerwujMiejsceNaFilm("Matrix") - na dowolnej sali
//        4. kino.rezerwujMiejscaNaFilm("Matrix", 2) - rezerwowanie 2 miejsc na film Matrix
//        5. kino.rezerwujMiejscaNaFilm("Matrix", 2, true) - rezerwowanie 2 miejsc na film Matrix, miejsca muszą być obok siebie
//        6. kino.sprawdzIloscWolnychMiejsc("Tytul") - wyświetla ile sumarycznie jest wolnych miejsc na film o danym tytule
//        7. kino.sprawdzIloscWolnychMiejsc(1) - wyświetla ile jest wolnych miejsc na pierwszej sali


//        Zaprojektuj system do przyjmowania zamówień w restauracji

//        1. Zamówienie ma w sobie dania.
//        2. Każde danie ma swoją cenę i nazwę
//        3. Zamówienie ma cenę całkowitą, na którą składają się ceny
//          poszczególnych zamówień
//        4. Powinna istnieć możliwość dodania napiwku do zamówienia
//        5. Powinna istnieć możliwość usunięcia dania z zamówienia



//          Może się przydać przy OX zamiast tablic.
        List<String> pola = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            pola.add("| |");
        }

        pola.set(2, "|X|");
        pola.set(5, "|O|");
        pola.set(7, "|X|");

        for (String pole : pola) {
            System.out.print(pole);
        }


        List<Integer> integerList;
//      =============== JAK ZDĄŻYMY PO OX ================
//        6. Używanie klas wbudowanych
//        Przejdziemy przez pakiet Time
        LocalTime localTime = LocalTime.of(1,1,1);
        System.out.println(localTime);

        LocalTime localTimePlusTwo = localTime.plusHours(2);
        System.out.println(localTimePlusTwo);

//        7. Spróbuj stworzyć datę swoich urodzin eksplorując pakiet Time
//        https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
    }
}
