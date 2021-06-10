package lekcja14;

import java.util.Objects;

public class Pracownik {
    private String imie;
    protected double wyplata;

    public Pracownik(String imie, double wyplata) {
        this.imie = imie;
        this.wyplata = wyplata;
    }

    public void powiekszWyplateo100() {
        powiekszWyplate(100);
    }

    public void powiekszWyplateo200() {
        powiekszWyplate(200);
    }

    private void powiekszWyplate(int wartosc) {
        this.wyplata += wartosc;
    }

    public String getImie() {
        return imie;
    }
}
