package lekcja19_nowy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

//    Podejście klasyczne

//    filter w streamie


//    2. Mamy liste psow, chcemy na jej podstawie stworzyc liste, w której sa tylko nie powtarzajace sie psy

//    Podejście klasyczne

//    distinct w streamie

    //    3. Mamy liste psow, chcemy policzyc ile mamy niepowtarzalnych psow

//        Klasyczne podejście
//        count w streamie

    //    4. Mamy liste psow, chcemy znalezc najstarszego
//        Podejscie klasyczne
//        max w stream

//    5. Mamy liste psow, chcemy z niej zrobić liste kotow o tym samym imieniu, ale tylko tych ktore
//    sa starsze niz 2 lata

//        Podejscie klasyczne
//        map w streamie

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
