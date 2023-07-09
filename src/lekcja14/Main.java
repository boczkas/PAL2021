package lekcja14;

public class Main {

    public static void main(String[] args) {
        //    1. Klasy abstrakcyjne - Zwierze
        //      Nie chcemy żeby dało się stworzyć obiekt typu Zwierze, bo coś takiego nie istnieje

//  Stwórz klasę abstrakcyjna zwierze
//  Stwórz Slon i Kot dziedziczace po Zwierze
//  Stwórz obiekty i przypisz do typu Zwierze
//  Stwórz metodę lapMysz() w klasie Kot i zobacz czy możesz ją wywołać
//  Stwórz innyKot na zasadzie Kot innyKot = new Kot(), czy to może wywołać innyKot.lapMysz()?


//        Stwórz listę Zwierzat, wrzuc do niej obiekty

//        Co to znaczy zwierze.dajGlos() skoro Zwierze jest klasa abstrakcyjna - metoda abstrakcyjna
//          Możemy zmieniać jej implementację w klasach dziedziczących



//        2. Klasy finalne - nie chcemy dawać możliwości dziedziczenia po niej
//          Stwórz klasę finalna ChorySlon
//          Stwórz klasę BardzoChorySlon i sprobuj podziedziczyć po ChorySlon

//        3. Ograniczenia dostępu
//        public - widoczność wszędzie
//        protected - widoczność w pakiecie i wszystkich podklasach
//        <default> - widoczność w obrębie pakietu
//        private - widoczność w obrębie klasy

//        Mamy naszą klasę Kot.
//        W Kot stwórzmy metode publiczna powitaj(String imie), która ładnie kogoś powita.
//        Stwórzmy obiekt klasy Kot w lekcji 13 Main i zawołajmy powitaj("Przemek")
//        Stwórz obiekt klasy Kot w tym pliku i zawołaj powitaj("Przemek")
//        Zmieńmy jej widoczność na protected
//
//        Czy da się ją nadal zawołać w lekcja13, i tutaj?
//
//        Zróbmy pakiet wredne a w nim klasę WrednyKot dziedziczącą po Kot
//        WrednyKot niech ma metode wredniePowitaj(String imie), która w środku zawoła powitaj()
//        Czy da się zawołać metodę powitaj() we wredniePowitaj()?

//        Usuń słowo protected przy powitaj()
//        Czy da się zawołać powitaj() we wredniePowitaj()?
//        A tutaj?

//        Dodaj słowo private przy powitaj()
//        Czy da się zawołać powitaj() tutaj?
//        To tutaj jak się nie da, to gdzie się da?

//        4. equals()
//        Stwórz klasę Pracownik. Ma mieć imie i wyplate
//        Do czego służy equals?

//        Stwórz pracownika tomek i pracownika staszek
//        Porównaj ich za pomocą equals()

//        Stwórz pracownika marek i tenSamMarek, którzy powinni być interpretowani, że to ten sam pracownik

//        Domyślne zachowanie to sprawdzanie równości referencji, czyli tego że jest to ten sam obiekt w pamięci

//        5. hashCode() - powinna wyliczyć w miarę unikatową wartość dla obiektu. Pokazać jak nam wygenerowało
//        6. toString() - nadpisać automatycznie, nadpisać z palca i wypisac marka

    }
}
