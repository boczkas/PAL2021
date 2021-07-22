package lekcja17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        1. Interfejsy
//          Określają one co klasa powinna robić, ale nie mówią jak
//          Implementowanie interfejsu tworzy relację typu POTRAFI (przypomnij sobie, że
//          dziedziczenie tworzy relację typu JEST)
//          W interfejsie wszystkie metody są domyślnie publiczne

//          Interfejs Krzykacz.
//              -   stworzyć interfejs
//              -   metoda wydajDzwiek()
//              -   klasa Kot implementująca Krzykacz
//              -   klasa Pies implementująca Krzykacz
//              -   klasa Trabka implementujaca Krzykacz
//
//        List<Krzykacz> krzykaczs = List.of(new Pies(), new Kot(), new Trabka(), new Pracownik("Ania", 100000));

//        for(Krzykacz krzykacz : krzykaczs) {
//            krzykacz.wydajDzwiek();
//        }
//
//        Krzykacz krzykacz = new Krzykacz() {
//            @Override
//            public void wydajDzwiek() {
//                System.out.println("Krzycz!");
//            }
//        };
//        W interfejsach możemy mieć pola, ale są to tak naprawdę stałe, bo są one public static final
//        Nie możemy tworzyć instancji interfejsu.

//        Klasa Pracownik i sortowanie obiektów tego typu po wypłacie
//        Chcielibyśmy skorzystać z metody Arrays.sort() (Niekoniecznie tak się to teraz robi, ale to
//        tylko przykład)
        Pracownik nikoletta = new Pracownik("Nikoletta", 0);
        Pracownik ania = new Pracownik("Ania", 1000000);
        Pracownik przemek = new Pracownik("Przemek", 5000);
        Pracownik barylek = new Pracownik("Baryłek", 20000);
//
        Pracownik[] pracownicy = {nikoletta, ania, przemek, barylek};
//
//        for(var pracownik : pracownicy) {
//            System.out.println(pracownik);
//        }
//
        Arrays.sort(pracownicy);
//        System.out.println("============================");
//        for(var pracownik : pracownicy) {
//            System.out.println(pracownik);
//        }

//        Można implementować kilka interfejsów. Niech Pracownik implementuje Krzykacza

//        Czemu wprowadzać w ogóle interfejsy skoro mamy już klasy abstrakcyjne, które też dają nam
//        podobną funkcjonalność - jesteśmy zmuszeni zaimplementować metodę jeśli jest abstrakcyjna?

//        W interfejsach można można tworzyć metody statyczne.
//        Dołóżmy zwiększGlosnosc(aktualnaGlosnosc) do naszego Krzykacza

        Krzykacz.zwiekszGlosnosc(10);
        ania.nakrzycz(barylek);


//        Co gdybyśmy chcieli do naszego interfejsu dołożyć metodę?
//        Pojawia się problem, że musimy ją zaimplementować we wszystkich klasach implementujących
//        interfejs. Wydaje się, że może to być dużo roboty jeśli tych klas jest sporo
//
//        Metody domyślne interfejsów.

//        2. Co się stanie gdy dwa interfejsy mają tą samą metodę domyślną?
    }
}
