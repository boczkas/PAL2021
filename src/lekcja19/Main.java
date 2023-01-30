package lekcja19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
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

        psiWyswietlacz(starePsy);

        List<Pies> starePsiaki2 = psiaki.stream()
                .filter(p -> p.getWiek() > 2)
                .collect(Collectors.toList());

        psiWyswietlacz(starePsiaki2);



        Krzykacz krzykacz = () -> System.out.println("AAAAAAAAAAAAA!!!!");

        krzykacz.krzycz();

        Krzykacz polski = new PolskiKrzykacz();
        polski.krzycz();

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

        psiWyswietlacz(unikatowe);

        Stream<Pies> unikatowyPiesStream = psiaki.stream()
                .filter(pies -> pies.getWiek() < 5)
                .distinct();

//        List<Pies> unikatowe2 = unikatowyPiesStream
//                .collect(Collectors.toList());
//        psiWyswietlacz(unikatowe2);
//    Podejście klasyczne

//    distinct w streamie

    //    3. Mamy liste psow, chcemy policzyc ile mamy niepowtarzalnych psow

        List<Pies> unikatowe3 = new ArrayList<>();

        for (Pies pies : psiaki) {
            if (!unikatowe3.contains(pies)) {
                if (pies.getWiek() < 5) {
                    unikatowe3.add(pies);
                }
            }
        }

        System.out.println(unikatowe3.size());

        long count = unikatowyPiesStream
                .count();
        System.out.println(count);
//        Klasyczne podejście
//        count w streamie

    //    4. Mamy liste psow, chcemy znalezc najstarszego
//        Podejscie klasyczne
//        max w stream

        Pies najstarszy = new Pies("a", 0);

        for (Pies pies : psiaki) {
            if (pies.getWiek() > najstarszy.getWiek()) {
                najstarszy = pies;
            }
        }

        System.out.println(najstarszy);

//    5. Mamy liste psow, chcemy z niej zrobić liste kotow o tym samym imieniu, ale tylko tych ktore
//    sa starsze niz 2 lata

//        Podejscie klasyczne
//        map w streamie

        List<Kot> koty = new ArrayList<>();
        for (Pies pies : psiaki) {
            koty.add(new Kot(pies.getImie()));
        }

        kociWyswietlacz(koty);

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
