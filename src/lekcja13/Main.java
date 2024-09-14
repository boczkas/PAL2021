package lekcja13;


import lekcja13.dom.Osoba;
//import lekcja13.firma.Obywatel;
import lekcja13.zwierzaki.SpiacyPies;
import lekcja13.zwierzaki.SzkolonyPies;
import lekcja13.zwierzaki.Pies;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
//        1. Pakiety - utworzyć zmienna typu LocalDate. Co oznacza ten import?
        LocalDate placek;
//        2. Tworzenie pakietów.
//        Pakiety tworzy się w celu organizacji pracy oraz uniknięcia konfliktów nazw. Jak u nas z Obywatelem.
//        Popatrz na pierwszą linike w naszych klasach w poprzednich lekcjach. W szczególności na lekcję 9.

        Osoba domowaOsoba = new Osoba();
        String tekst = "cos";

//        Obywatel obywatel = new Obywatel("Staszek");
//        obywatel.siema();

//        lekcja13.firma.Osoba firmowaOsoba = new lekcja13.firma.Osoba();



//        Zadanie:
//              - utwórz pakiet dom
//              - utwórz pakiet firma
//              - w obu pakietach utwórz klasę Obywatel
//              - stwórz obiekty obu klas w Main
//

//        3. Importowanie statyczne
//        double pow = Math.pow(2, 2);
        double pow = pow(2, 2);

//        4. Modyfikatory dostępu.
//        Utworzyć klasę Obywatel w pakiecie dom. Usunac jej modyfikator dostepu.
//        Czy da się jej użyć w pakiecie lekcja13?
//        public vs package-private
//        dołóżmy metodę i zróbmy private

        Osoba osoba = new Osoba();
        osoba.sayHello();

//        5. Dziedziczenie

//        Klasy mogą po sobie dziedziczyć. W Javie można dziedziczyć tylko po jednej klasie
//        Stwórz klasę Pies posiadającą imie i wiek. Utwórz odpowiedni konstruktor.
//        Stwórz klasę SzkolonyPies dziedziczącą po Pies, z dodatkowym polem umiejętność.
//        Utwórz konstruktor, który będzie przyjmował dodatkowy argument

        Pies pies = new Pies("Staszek", 45);
        pies.sayHello();
//        SpiacyPies spiacyPies = new SpiacyPies("Edek", 5);
//        spiacyPies.sayHello();
//
        SzkolonyPies szkolonyPies = new SzkolonyPies("Niezwkly", 100, "maluje");
//
//        pies.sayHello();
        szkolonyPies.sayHello();
        szkolonyPies.robSztuczki();

        Pies psiak = new SzkolonyPies("Aniol", 0, "latam");
        psiak.sayHello();
//        Klasa Pies ma dysponować metodą sayHello(), w której pies wita się swoim imieniem i wiekiem.
//        Klasa SzkolonyPies ma nadpisywać metodę sayHello(), tak aby witał się imieniem, wiekiem oraz umiejętnością.

//        Pies bardzoSpiacyPies = new SzkolonyPies("burek", 10, "szuka");
//        bardzoSpiacyPies.sayHello();

//        Dodać klasę SpiacyPies, który w hello() odpowiada, że nie ma siły gadać.
//
        SpiacyPies spiacyPies = new SpiacyPies("Spiacy", 30);
        spiacyPies.sayHello();
//        System.out.println(spiacyPies);
        List<Pies> mieszkancyWioski = new ArrayList<>();
        mieszkancyWioski.add(pies);
        mieszkancyWioski.add(szkolonyPies);
        mieszkancyWioski.add(spiacyPies);
        mieszkancyWioski.add(psiak);

        System.out.println("------------------------");
        for (Pies mieszkaniec : mieszkancyWioski) {
            mieszkaniec.sayHello();
        }


//        CO TO POLIMORFIZM?
//        Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//        Polimofizm oznacza, że możemy w miejsce klasy bazowej podstawić dowolny element z klasy dziedziczącej.

        SzkolonyPies szkolonyPies1 = new SzkolonyPies("imie", 1, "skill");
        szkolonyPies1.skacz();
    }
}
