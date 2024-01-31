package lekcja9;

import java.util.List;

public class Kot {
    String imie;
    int wiek;
    List<Robak> robaki;

    public void miaucz(String imie) {
        System.out.println("Miaucze na " + imie);
    }

    public void jedz(Robak robak) {
        System.out.println("O kurde, zjadlem robaka " + robak.imie);
    }
}
