package lekcja19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

//    DO ROZBICIA NA 2 - Interfejsy z lambdami i streamy

    public static void main(String[] args) {

//        Interfejsy funkcyjne i lambdy

//        Przypisujemy klasę, która implementuje interfejs do interfejsu
        Krzykacz polski = new PolskiKrzykacz();
        polski.krzycz();

//        Najpierw przez new Krzykacz()
        Krzykacz krzykacz3 = () -> System.out.println("Krzycze");

        krzykacz3.krzycz();

//        Implementacja za pomocą lambdy
        Krzykacz krzykacz = () -> {
            System.out.println("AAAAAAAAAAAAA!!!!");
            System.out.println("BBBBBBB!!!!");
        };

        krzykacz.krzycz();

        Krzykacz angielski = () -> System.out.println("You son of a b...");
        Krzykacz niemiecki = () -> System.out.println("Krzycze po niemiecku");
        Krzykacz hiszpanski = () -> System.out.println("Krzycze po hiszpansku");

        List<Krzykacz> krzykacze = new ArrayList<>();
        krzykacze.add(polski);
        krzykacze.add(angielski);
        krzykacze.add(niemiecki);
        krzykacze.add(hiszpanski);

        for (Krzykacz krzykacz1 : krzykacze) {
            krzykacz1.krzycz();
        }

//        Interfejs funkcyjny może przyjmować parametry i zwracać wartości
//        Stworz interfejs Dzialacz, ktory przyjmie dwa argumenty i zwróci wynik
//
        Dzialacz dzialacz = l -> l * 2;
        int wynik = dzialacz.dzialaj(6);
        System.out.println(wynik);

        Dzialacz potegowy = l -> l * l;
        System.out.println(potegowy.dzialaj(6));


//
//        Dzialacz razyDwa = (l) -> {return l * 2; };
//        Dzialacz razyDwa1 = l -> l * 2;
//        int piecRazyDwa = razyDwa.dzialaj(5);
//        System.out.println(piecRazyDwa);


//        Stworz implementacje interfejsu Dzialacz, ktora bedzie podnosila liczbe do potegi 2

//        Stworz Interfejs TrzyLiczbowiec, ktory przyjmie 3 parametry int i zwróci int  - ja mam to zrobić

//        Najpierw implementacja zwracajaca sume klasycznie

        TrzyLiczbowiec trzyLiczbowiec = (pierwsza, druga, trzecia) -> pierwsza + druga + trzecia;
        System.out.println(trzyLiczbowiec.licz(1,2,3));

        TrzyLiczbowiec max = (a, b, c) -> {
          int najwieksza = a;
          if (b > najwieksza) {
              najwieksza = b;
          }
          if (c > najwieksza) {
              najwieksza = c;
          }

          return najwieksza;
        };

        System.out.println(max.licz(1,2,3));
        System.out.println(max.licz(9,3,111));

//        TrzyLiczbowiec sumator = (a,b,c) -> a+b+c;
//        int suma = sumator.licz(1, 2, 3);
//        System.out.println(suma);
//        Stworz impelemntacje, ktora zsumuje te liczby i zwroci sume - ja
//        Stworz implementacje, ktora zwróci największą z liczb



//        Tu możliwe, że kolejna lekcja

        List<Pies> psiaki = new ArrayList<>();
        psiaki.add(new Pies("Burek", 3));
        psiaki.add(new Pies("Azor", 1));
        psiaki.add(new Pies("Azor", 1));
        psiaki.add(new Pies("Azor", 1));
        psiaki.add(new Pies("Azor", 1));
        psiaki.add(new Pies("Reks", 5));
        psiaki.add(new Pies("Staszek", 2));
        psiaki.add(new Pies("Dexter", 10));

//    1. Mamy liste psow, chcemy na jej podstawie stworzyc liste, w której sa psy tylko starsze niz 2 lata
        List<Pies> starePsy = new ArrayList<>();
        for (Pies pies : psiaki) {
            if (pies.getWiek() > 2) {
                starePsy.add(pies);
            }
        }
//
//        psiWyswietlacz(starePsy);
//
//        List<Pies> starePsiaki2 = psiaki.stream()
//                .filter(p -> p.getWiek() > 2)
//                .collect(Collectors.toList());
//
//        psiWyswietlacz(starePsiaki2);

//        Tu mamy streama. Stream ma na sobie do wykonania operacje pośrednie i terminalne.
//        Pokazać co wychodzi po samym filtrze
//        Pokazać inne operacje pośrednie

//    Podejście klasyczne

//    filter w streamie


//    2. Mamy liste psow, chcemy na jej podstawie stworzyc liste, w której sa tylko nie powtarzajace sie psy

        List<Pies> unikatowe = new ArrayList<>();

        for (Pies pies : psiaki) {
            if (!unikatowe.contains(pies)) {
                if (pies.getWiek() < 5) {
                    unikatowe.add(pies);
                }
            }
        }
//
//        psiWyswietlacz(unikatowe);
//
        List<Pies> unikatowyPiesStream = psiaki.stream()
                .filter(pies -> pies.getWiek() < 5)
                .distinct()
                .collect(Collectors.toList());
//
//        List<Pies> unikatowe2 = unikatowyPiesStream
//                .collect(Collectors.toList());
//        psiWyswietlacz(unikatowe2);
//    Podejście klasyczne

//    distinct w streamie

    //    3. Mamy liste psow, chcemy policzyc ile mamy niepowtarzalnych psow

//        List<Pies> unikatowe3 = new ArrayList<>();
//
//        for (Pies pies : psiaki) {
//            if (!unikatowe3.contains(pies)) {
//                if (pies.getWiek() < 5) {
//                    unikatowe3.add(pies);
//                }
//            }
//        }
//
//        System.out.println(unikatowe3.size());
//
//        long count = unikatowyPiesStream
//                .count();
//        System.out.println(count);
//        Klasyczne podejście
//        count w streamie

    //    4. Mamy liste psow, chcemy znalezc najstarszego
//        Podejscie klasyczne
//        max w stream

//        To ja musze pokazac


        Pies najstarszy = new Pies("a", 0);

        for (Pies pies : psiaki) {
            if (pies.getWiek() > najstarszy.getWiek()) {
                najstarszy = pies;
            }
        }

        Pies pies = psiaki.stream()
                .max(Comparator.comparingInt(Pies::getWiek))
                .get();

        System.out.println(pies);

//        Mamy liste psow, chcemy z niej zrobic liste kotow o tym samym imieniu

//    5. Mamy liste psow, chcemy z niej zrobić liste kotow o tym samym imieniu, ale tylko tych ktore
//    sa starsze niz 2 lata

//        Podejscie klasyczne
//        map w streamie

//        List<Kot> koty = new ArrayList<>();
//        for (Pies pies : psiaki) {
//            koty.add(new Kot(pies.getImie()));
//        }

//        List<Kot> kot = psiaki.stream()
//                .map(pies1 -> new Kot(pies1.getImie()))
//                .collect(Collectors.toList());

//        kociWyswietlacz(koty);
//
        List<Kot> koty2 = psiaki.stream()
                .map(element -> new Kot(element.getImie()))
                .collect(Collectors.toList());

            kociWyswietlacz(koty2);
    }

    private static void psiWyswietlacz(List<Pies> psy) {
        System.out.println("======================");
        for (Pies pies : psy) {
            System.out.println(pies);
        }
        System.out.println("======================");
    }

    private static void kociWyswietlacz(List<Kot> koty) {
        System.out.println("======================");
        for (Kot kot : koty) {
            System.out.println(kot);
        }
        System.out.println("======================");
    }

}
