package lekcja9;

public class Kino {
    boolean[] wolneMiejsca = {true, true, true};

    public void rezerwujMiejsce(int numerMiejsca) {
        if(wolneMiejsca[numerMiejsca]) {
            wolneMiejsca[numerMiejsca] = false;
            System.out.println("Zarezerwowano miejsce " + numerMiejsca);
        } else {
            System.out.println("Miejsce " + numerMiejsca + " juz zajete.");
        }
    }
}
