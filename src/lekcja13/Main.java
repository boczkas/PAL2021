package lekcja13;


import lekcja13.zwierzaki.SpiacyPies;
import lekcja13.zwierzaki.SzkolonyPies;
import lekcja13.zwierzaki.Pies;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        1. Pakiety - utworzyć zmienna typu LocalDate. Co oznacza ten import?
//        2. Tworzenie pakietów.
//        Pakiety tworzy się w celu organizacji pracy oraz uniknięcia konfliktów nazw. Jak u nas z Obywatelem.
//        Popatrz na pierwszą linike w naszych klasach w poprzednich lekcjach. W szczególności na lekcję 9.
//        Każda klasa może używać wszystkich klas (kiedyś o prywatnych) ze swojego pakietu oraz PUBLICZNYCH klas z pozostałych pakietów.

//        Obywatel obywatel = new Obywatel();

//        Zadanie:
//              - utwórz pakiet dom
//              - utwórz pakiet firma
//              - w obu pakietach utwórz klasę Obywatel
//              - stwórz obiekty obu klas w Main
//

//        3. Importowanie statyczne
//        double pow = Math.pow(2, 2);
//        double pow = pow(2, 2);

//        4. Modyfikatory dostępu.
//        Utworzyć klasę Obywatel w pakiecie dom. Usunac jej modyfikator dostepu.
//        Czy da się jej użyć w pakiecie lekcja13?
//        public vs package-private
//        dołóżmy metodę i zróbmy private

//        5. Dziedziczenie

//        Klasy mogą po sobie dziedziczyć. W Javie można dziedziczyć tylko po jednej klasie
//        Stwórz klasę Pies posiadającą imie i wiek. Utwórz odpowiedni kontruktor.
//        Stwórz klasę SzkolonyPies dziedziczącą po Villager, z dodatkowym polem umiejętność.
//        Utwórz konstruktor, który będzie przyjmował dodatkowy argument

        Pies pies = new Pies("Staszek", 45);
        SzkolonyPies szkolonyPies = new SzkolonyPies("Niezwkly", 100, "maluje");

        pies.sayHello();
        szkolonyPies.sayHello();
//        Klasa Pies ma dysponować metodą sayHello(), w której mieszkaniec wioski wita się swoim imieniem i wiekiem.
//        Klasa SzkolonyPies ma nadpisywać metodę sayHello(), tak aby witał się imieniem, wiekiem oraz umiejętnością.

//        Pies mieszkaniec = new SzkolonyPies();
//
//        Dodać klasę SpiacyPies, który w hello() odpowiada, że nie ma siły gadać.
//
        SpiacyPies spiacyPies = new SpiacyPies("Spiacy", 30);

        List<Pies> mieszkancyWioski = new ArrayList<>();
        mieszkancyWioski.add(pies);
        mieszkancyWioski.add(szkolonyPies);
        mieszkancyWioski.add(spiacyPies);

        for (Pies mieszkaniec : mieszkancyWioski) {
            mieszkaniec.sayHello();
        }


//        Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//        Polimofizm oznacza, że możemy w miejsce klasy bazowej podstawić dowolny element z klasy dziedziczącej.

//        Każda klasa dziedziczy po klasie Object
//        SpiacyPies spiacyPies = new SpiacyPies()
//        Object ukrytyMieszkaniec = mieszkaniec;
//        Sprawdzić jakie ma metody.
//        SpiacyPies odkrytyMieszkaniec = (SpiacyPies) ukrytyMieszkaniec;

        Object object = new Pies("Staszek", 50);
        Pies odkrytyPies = (Pies) object;
        odkrytyPies.sayHello();
    }
}
