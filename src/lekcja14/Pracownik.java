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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pracownik pracownik = (Pracownik) o;
        return Double.compare(pracownik.wyplata, wyplata) == 0 && Objects.equals(imie, pracownik.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wyplata);
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", wyplata=" + wyplata +
                '}';
    }
}
