package lekcja11.zamowienie;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
