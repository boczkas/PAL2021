package lekcja10;
import java.util.Arrays;

public class Kino {
    Sala[] sale;

    public Kino() {
        System.out.println("Tworze kino");
        sale = new Sala[3];
        for(int i = 0; i < sale.length; i++) {
            sale[i] = new Sala();
        }
    }

    public void rezerwujMiejsce(int numerMiejsca) {
        for(int i = 0; i < sale.length; i++) {
            Sala sala = sale[i];
            boolean[] wolneMiejsca = sala.wolneMiejsca;

            if(wolneMiejsca[numerMiejsca - 1]) {
                wolneMiejsca[numerMiejsca - 1] = false;
                System.out.println("Zarezerwowano miejsce " + numerMiejsca + " na sali " + (i+1));
                break;
            } else {
                System.out.println("Miejsce " + numerMiejsca + " juz zajete na sali " + (i+1));
            }
        }
    }
//
//    public void zwolnijMiejsce(int numerMiejsca) {
//        if(!wolneMiejsca[numerMiejsca - 1]) {
//            wolneMiejsca[numerMiejsca - 1] = true;
//            System.out.println("Zwolniono miejsce " + numerMiejsca);
//        } else {
//            System.out.println("Miejsce było wolne");
//        }
//    }
//
//    public void pokazStatusMiejsc() {
//        for(int i = 0; i < wolneMiejsca.length; i++) {
//            if(wolneMiejsca[i]) {
//                System.out.println("Miejsce " + (i + 1) + " wolne.");
//            } else {
//                System.out.println("Mijesce " + (i + 1) + " zajęte.");
//            }
//        }
//    }
//
//    public void zwolnijWszystkie() {
//        Arrays.fill(wolneMiejsca, true);
//    }
}
