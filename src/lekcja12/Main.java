package lekcja12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        1. Dostęp do wartości elementów
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());

//        2. NazwaKlasy - schemat klasy

//        3. Obywatel - przykładowa klasa - omówić
        Obywatel dominika = new Obywatel("Dominika", 1988, 12, 12, 0);
        Obywatel tosia = new Obywatel("Tosia", 2016, 5, 27, 200);
        Obywatel marysia = new Obywatel("Marysia", 2018, 10, 5, 200);

        ArrayList<Obywatel> rodzinka = new ArrayList<>();
        rodzinka.add(dominika);
        rodzinka.add(tosia);
        rodzinka.add(marysia);

//        Pokazujemy wszystkim ile maja kieszonkowego
        for (Obywatel czlonekRodziny : rodzinka) {
            System.out.println("dupa2");
            czlonekRodziny.showPocketMoney();
        }
//
//        Podnosimy wszystkim kieszonkowe o 5zl
        for (Obywatel czlonekRodziny : rodzinka) {
            System.out.println("dupa1");
            czlonekRodziny.increasePocketMoney(15);
        }
//
//        Pokazujemy wszystkim ile maja kieszonkowego
        for (Obywatel czlonekRodziny : rodzinka) {
            czlonekRodziny.showPocketMoney();
        }

    }
}
