package lekcja4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//          1. Konwersja typów numerycznych

        int liczbaInt = 5;
        double liczbaDouble = liczbaInt;
//
        System.out.println(liczbaInt);
        System.out.println(liczbaDouble);


//          2. Rzutowanie (konwersja stratna)

//        liczbaDouble = 3.999;
//        liczbaInt = liczbaDouble;

//        liczbaInt = (int) liczbaDouble;
//        System.out.println(liczbaInt);

//        liczbaInt = 300;
//        byte liczbaByte = (byte) liczbaInt;
//
//        System.out.println(liczbaByte);
//
//
//          3. Operatory z przypisaniem

//        int x = 0;
//
//        x = x + 5;
//        System.out.println(x);
//
//        x += 1;
//        System.out.println(x);
//
//        x *= 2;
//        System.out.println(x);
//
//
//          4. Operatory inkrementacji i dekrementacji
//
//        int i = 0;
//
//         postinkrementacji
//        i++;
//        System.out.println(i);
//
//         postdekrementacji
//        i--;
//        System.out.println(i);
//
//         preinkrementacji
//        ++i;
//        System.out.println(i);
//
//         predekrementacji
//        --i;
//        System.out.println(i);
//
//        int m = 7;
//        int n = 7;

//        int a = 2 * ++m;
//        int b = 2 * n++;

//        System.out.println("m = " + m);
//        System.out.println("n = " + n);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//
//          5. Operatory relacyjne i logiczne
//
//        System.out.println( "3 == 7 " + (3 == 7));
//        System.out.println( "3 != 7 " + (3 != 7));
//        System.out.println( "3 > 7 " + (3 > 7));
//        System.out.println( "3 >= 7 " + (3 >= 7));
//        System.out.println( "3 <= 7 " + (3 <= 7));
//        System.out.println("!true " + (!true));

//        System.out.println("true || false " + (true || false));
//        System.out.println("true && false " + (true && false));
//
//          TROCHĘ SIĘ WCINAM Z PĘTLAMI - w książce inaczej, po to żeby robić zadanka
//        6. Pętla while()
//        while(<warunek_prawdziwy>) {
//            Rob cos
//        }
        int i = 5;
        while (i < 15) {
            System.out.println("i = " + i);
            i++;
        }
//        Wypisz liczby od 10 do 0;

//        7. Pętla for()
//        for(inicjalizacja; warunek_zakonczenia; co_robimy_co_obieg) {
//            Robimy coś
//        }
        for (int j = 5; j < 15; j++) {
            System.out.println("j = " + j);
        }

//        Wypisz liczby od 0 do 10;

//        8. Wejście/wyjście I/O

//      Wyjście
//        System.out.println("No elo");

//      Wejście

//        Zwrócić uwagę na to, że trzeba zrobić import


//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj zmienna1");
//        int zmienna1 = in.nextInt();
//        System.out.println("Podaj zmienna2");
//        double zmienna2 = in.nextDouble();
//
//        System.out.println(zmienna1);
//        System.out.println(zmienna2);

    }
}
