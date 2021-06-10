package lekcja14;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //    1. Klasy abstrakcyjne - Zwierze
        //      Nie chcemy żeby dało się stworzyć obiekt typu Zwierze, bo coś takiego nie istnieje

//        Zwierze zwierze = new Zwierze();

//      Możemy po niej dziedziczyć

//        2. Klasy finalne - nie chcemy dawać możliwości dziedziczenia po niej

//        3. Ograniczenia dostępu
//        public - widoczność wszędzie
//        protected - widoczność w pakiecie i wszystkich podklasach
//        <default> - widoczność w obrębie pakietu
//        private - widoczność w obrębie klasy



        Pracownik tomek = new Pracownik("Tomek", 100);

//        Stworzyć metodę publiczną powiększWyplateO100
//        Stworzyć metodę publiczną powiększWyplateO200
//        Dołożyć prywatną powiekszWyplate

//        tomek.powiekszWyplateo100();
//        tomek.powiekszWyplateo200();
//        Spróbować użyć zmiennych z Pracownik w Main.
//        Zmienić dostęp jednej z nich na private
//        Zmienić na protected
//        Stworzyć klasę w podpakiecie dziedziczącą po Pracownik'u

//        4. equals()
        Pracownik staszek = new Pracownik("Staszek", 5);
        boolean equals = tomek.equals(staszek);
        System.out.println(equals);

        Pracownik marek = new Pracownik("Marek", 100);
        System.out.println(tomek.equals(marek));
//        Domyślne zachowanie to sprawdzanie równości referencji
//        Często nie jest to wystarczające, w szczególności w przypadku obiektów, które przechowywują jakiś stan
//        Wygenerować i omówić equals. Wspomnieć o hashCode
//        Stworzyć dwóch pracowników. Pokazać co zwraca equals przed i po nadpisaniu equals w Pracownik'u
//        Możecie sobie poczytać w książce o zasadach tworzenia dobrego equalsa - matematyczne. Tu nam wystarczy wygenerowane
        Pracownik innyMarek = new Pracownik("Marek", 100);

//        Przed i po nadpisaniu equals
        System.out.println(marek.equals(innyMarek));


//        5. hashCode() - powinna wyliczyć w miarę unikatową wartość dla obiektu. Pokazać jak nam wygenerowało
//        6. toString() - nadpisać automatycznie, nadpisać z palca
        System.out.println(tomek);





//        7. ArrayList - generyczna klasa z parametrem typu - co to oznacza? Możemy podać tutaj dowolny typ referencyjny
        ArrayList<Pracownik> pracownikLista = new ArrayList<>();
//        Jaką to ma zaletę w stosunku do zwykłych list Pracownik[] pracownicy?
        Pracownik[] pracownikTablica = new Pracownik[2];
        pracownikTablica[0] = tomek;
        pracownikTablica[1] = marek;
//        pracownikTablica[2] = tomek;
//        Samo się rozszerza jak jest potrzeba

        pracownikLista.add(tomek);
        pracownikLista.add(marek);
        pracownikLista.add(tomek);

//        Deklaracja
//        ArrayList<Pracownik> pracownicy = new ArrayList<Pracownik>();

//        Java 11
        var pracownikArrayList = new ArrayList<Pracownik>();

//        Dodawanie do array vs dodawanie do arrayList
    }
}
