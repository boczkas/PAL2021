package lekcja11.zamowienie;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MainNowy {
    public static void main(String[] args) {
//      1.  Coś więcej niż array - lista
//        Array jest statyczny. Jak zrobimy tablice na 5 elementów to koniec
        int[] tablica = {1, 2, 3, 4, 5};
//        To spowoduje nam wyjątek, bo jest poza zakresem
//        tablica[6] = 7;

//        Tu nie ma problemu
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(20);
        integerList.add(3);
        integerList.add(4);
        integerList.add(10);
        integerList.add(6);
        integerList.add(7);


        for (Integer liczba : integerList) {
            System.out.println(liczba);
        }

        System.out.println("==============");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }


        ArrayList<String> pola = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            pola.add("| |");
        }

        for (int i = 0; i < 10; i++) {
            pola.add("| |");
        }

        pola.set(2, "|X|");
        pola.set(5, "|O|");
        pola.set(7, "|X|");
//
        for (int i = 0; i < 10; i++) {
            System.out.print(pola.get(i));
        }

//        for (String pole : pola) {
//            System.out.print(pole);
//        }

//
//        System.out.println();
        System.out.println();

        //        2. Używanie klas wbudowanych
//        Przejdziemy przez pakiet Time
        LocalTime localTime = LocalTime.of(1, 1, 1);
        System.out.println(localTime);

        LocalTime localTimePlusTwo = localTime.plusHours(2);
        System.out.println(localTimePlusTwo);

//        3. Spróbuj stworzyć datę swoich urodzin eksplorując pakiet Time
//        https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
    }
}
