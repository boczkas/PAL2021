package lekcja14;

import lekcja13.zwierzaki.Pies;
import lekcja14.obywatel.Obywatel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //    1. Klasy abstrakcyjne - Zwierze
        //      Nie chcemy żeby dało się stworzyć obiekt typu Zwierze, bo coś takiego nie istnieje


        Zwierze slon = new Slon();
        Zwierze kot = new Kot();
        Kot nowyKot = new Kot();

//        nowyKot.lapMysz();
        ArrayList<Zwierze> zwierzeta = new ArrayList<>();
        zwierzeta.add(slon);
        zwierzeta.add(kot);
        zwierzeta.add(nowyKot);
//
        //        Możemy mieć też metody abstrakcyjne, bo co to znaczy zwierze.dajGlos()? Skoro nie ma czegos takiego
//        jak Zwierze

        for(Zwierze zwierze : zwierzeta) {
            zwierze.dajGlos();
        }

//      Możemy po niej dziedziczyć



//        2. Klasy finalne - nie chcemy dawać możliwości dziedziczenia po niej
        ChorySlon chorySlon = new ChorySlon();

//        3. Ograniczenia dostępu
//        public - widoczność wszędzie
//        protected - widoczność w pakiecie i wszystkich podklasach
//        <default> - widoczność w obrębie pakietu
//        private - widoczność w obrębie klasy

//        int a = 5;
//        Integer b = 5;
//        Pies pies = new Pies("Staszek", 4);
//
        Pracownik pracownik = new Pracownik("Tomek", 100);
        pracownik.powiekszWyplateo100();
        System.out.println(pracownik.wyplata);
        pracownik.powiekszWyplateo200();
        System.out.println(pracownik.wyplata);


//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        System.out.println(s);

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
        Pracownik tomek = new Pracownik("Tomek", 100);
        Pracownik staszek = new Pracownik("Staszek", 5);
        boolean equals = tomek.equals(staszek);
        System.out.println(equals);


        Pracownik marek = new Pracownik("Marek", 100);
        Pracownik tenSamMarek = new Pracownik("Marek", 100);
        System.out.println(marek.equals(tenSamMarek));
//        System.out.println(tenSamMarek.equals(marek));


//        Domyślne zachowanie to sprawdzanie równości referencji
//        Często nie jest to wystarczające, w szczególności w przypadku obiektów, które przechowywują jakiś stan
//        Wygenerować i omówić equals. Wspomnieć o hashCode

//        Stworzyć dwóch pracowników. Pokazać co zwraca equals przed i po nadpisaniu equals w Pracownik'u
//        Możecie sobie poczytać w książce o zasadach tworzenia dobrego equalsa - matematyczne. Tu nam wystarczy wygenerowane
//        Pracownik innyMarek = new Pracownik("Marek", 100);

//        Przed i po nadpisaniu equals
//        System.out.println(marek.equals(innyMarek));


//        5. hashCode() - powinna wyliczyć w miarę unikatową wartość dla obiektu. Pokazać jak nam wygenerowało
//        6. toString() - nadpisać automatycznie, nadpisać z
//        Pracownik tomek = new Pracownik("Tomek", 100);
//        System.out.println(tomek.toString());

        System.out.println(tomek.toString());

    }
}
