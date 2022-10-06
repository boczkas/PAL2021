package lekcja10;

public class Main {
    public static void main(String[] args) {
        //        1. Konstruktory
        Auto stilo = new Auto();
        stilo.marka = "Fiat";
        stilo.poziomPaliwa = 100;

//        Chcielibyśmy żeby te rzeczy nadawać przy tworzeniu obiektu

        Auto tt = new Auto("Audi", 100);
        System.out.println(tt.marka);
        System.out.println(tt.poziomPaliwa);
//        Stwórz klasę Pies z polami imie i wiek, zainicjalizuj je przez konstruktor

//        2. Kontruktory do części parametrów
//          Nasze auto ma się inicjalizować się z nadawaną marką i poziomem paliwa równym 0
        Auto auto = new Auto("reno");
        System.out.println(auto.marka);
        System.out.println(auto.poziomPaliwa);
//        Stwórz konstruktor w klasie Pies, który ma przyjmować imie i ustawiać wiek na 0

//        3. Zmienianie pól za pomocą metod
//          Nasze auto ma mieć metodę tankuj(iloscPaliwa), która będzie powiekszała poziomPaliwa

        System.out.println("Poziom paliwa przed:");
        System.out.println(auto.poziomPaliwa);
        auto.zatankuj(20);
        System.out.println("Poziom paliwa po:");
        System.out.println(auto.poziomPaliwa);
//        Stwórz metodę minalRok(), która będzie zwiększać wiek psa o 1

        System.out.println(Auto.iloscAut);
    }
}
