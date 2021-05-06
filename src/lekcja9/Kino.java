package lekcja9;

import java.util.Arrays;

public class Kino {
    boolean[] wolneMiejsca;

    public Kino() {
        System.out.println("Tworze kino");
        wolneMiejsca = new boolean[5];
        Arrays.fill(wolneMiejsca, true);
    }

    public void rezerwujMiejsce(int numerMiejsca) {
        if(wolneMiejsca[numerMiejsca - 1]) {
            wolneMiejsca[numerMiejsca - 1] = false;
            System.out.println("Zarezerwowano miejsce " + numerMiejsca);
        } else {
            System.out.println("Miejsce " + numerMiejsca + " juz zajete.");
        }
    }

    public void zwolnijMiejsce(int numerMiejsca) {
        if(!wolneMiejsca[numerMiejsca - 1]) {
            wolneMiejsca[numerMiejsca - 1] = true;
            System.out.println("Zwolniono miejsce " + numerMiejsca);
        } else {
            System.out.println("Miejsce było wolne");
        }
    }

    public void pokazStatusMiejsc() {
        for(int i = 0; i < wolneMiejsca.length; i++) {
            if(wolneMiejsca[i]) {
                System.out.println("Miejsce " + (i + 1) + " wolne.");
            } else {
                System.out.println("Mijesce " + (i + 1) + " zajęte.");
            }
        }
    }

    public void zwolnijWszystkie() {
        Arrays.fill(wolneMiejsca, true);
    }
}
