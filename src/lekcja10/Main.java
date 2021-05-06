package lekcja10;

import lekcja9.Kino;

public class Main {
    public static void main(String[] args) {
        Kino kino = new Kino();
        kino.rezerwujMiejsce(1);

//        Zadanie:
//    kino.rezerwujMiejsce(1); - powinno zarezerwować pierwsze miejsce o ile jest dostępne.
//    kino.zwolnijMiejsce(1); - powinno zwolnić pierwsze miejsce o ile było zajęte.
//    kino.pokazStatusMiejsc() - powinno wypisać status wszystkich miejsc.
//    kino.zwolnijWszystkie() - powinno zwolnić wszystkie miejsca


//        1. Kino ma mieć 3 sale z 5 miejscami
//              - kino.rezerwujMiejsce(1); - powinno zarezerwować pierwsze miejsce na dowolnej sali, o ile jest dostępne.
//              - kino.zwolnijMiejsce(1, 2); - powinno zwolnić drugie miejsce na pierwszej sali, o ile było zajęte.
//              - kino.pokazStatusMiejsc() - powinno wypisać status wszystkich miejsc ze wszystkich sal uwzględniając numer sali.
//              - kino.zwolnijWszystkie(1) - powinno zwolnić wszystkie miejsca na pierwszej sali
//        2. Na każdej z sal ma być wyświetlany inny Film (też klasa)
//        3. kino.rezerwujMiejsceNaFilm("Matrix") - na dowolnej sali
//        4. kino.rezerwujMiejscaNaFilm("Matrix", 2) - rezerwowanie 2 miejsc na film Matrix
//        5. kino.rezerwujMiejscaNaFilm("Matrix", 2, true) - rezerwowanie 2 miejsc na film Matrix, miejsca muszą być obok siebie
//        6. kino.sprawdzIloscWolnychMiejsc("Tytul") - wyświetla ile sumarycznie jest wolnych miejsc na film o danym tytule
//        7. kino.sprawdzIloscWolnychMiejsc(1) - wyświetla ile jest wolnych miejsc na pierwszej sali
    }
}
