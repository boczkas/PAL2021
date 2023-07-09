package lekcja1;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//  =========================== ZMIENNE ==================================
//        Co to są zmienne? Są to pojemniki na dane.
//        W Javie jest wiele różnych pojemników. Tak jak w normalnym życiu.
//        Pokazówka........... z dwoma pojemnikami
//
//        Tworząc zmienną:
//              <typ> <nazwa> = <wartość>;
//              int liczba = 5;
//              String tekst = "Imie";
//        Stwórzmy zmienną typu całkowitego i nadajmy jej wartość 10.
//        Wypiszmy ją na ekran.
//        Stwórzmy zmienną do przechowywania tekstu. Wpisz do niej swoje imię.
//        Wypiszmy ją na ekran.
//        System.out.println(liczba + tekst);


// ============================ TYPY DANYCH DLA LICZB =======================


//        Pokazówka ze szklanymi pojemnikami....
// CALKOWITE
// byte 1 byte  -128 to 127
// short 2 bytes  -32,768 to 32,767
// int 4 bytes -2,147,483,648 to 2,147,483,647
// long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//
// ZMIENNOPRZECINKOWE
// float 4 bytes 7 decimal digits
// double 8 bytes 16 decimal digits

        int liczba = 4;
        System.out.println(liczba);
        byte bajcik = 1;
        int intigerek = 1;

        System.out.println(bajcik);
        System.out.println(intigerek);

//        bajcik = 129;
//        intigerek = 129;

        float floacik = 0.123F;
        double dablik = 0.123;

        System.out.println(floacik);
        System.out.println(dablik);

        floacik = 0.123456789F;
        dablik = 0.123456789;

        System.out.println("lubie placki: " + floacik);
        System.out.println("i czeresnie: " + dablik);

        System.out.println(2 - 1.1);

        int dzien = 31;
        String miesiac = "maja";
        int rok = 2022;

        System.out.println("Dzisiaj jest " + dzien + " " + miesiac + " " + rok);




//  Jak starczy czasu: wypisywanie zmiennych w ramach jednego sout'a
    }
}
