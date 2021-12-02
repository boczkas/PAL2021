package lekcja19;

import lekcja17.Krzykacz;
import lekcja17.Wulgarnik;

import java.util.Objects;

public class Pracownik implements Comparable<Pracownik>, Krzykacz, Wulgarnik {
    String imie;
    double wyplata;

    public Pracownik(String imie, double wyplata) {
        this.imie = imie;
        this.wyplata = wyplata;
    }

//    @Override
//    public int compareTo(Pracownik o) {
//        return Double.compare(this.wyplata, o.wyplata);
//    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", wyplata=" + wyplata +
                '}';
    }

//    @Override
//    public int compareTo(Pracownik o) {
//        return Double.compare(this.wyplata, o.wyplata);
//    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Daj wincy piniendzy");
    }

    @Override
    public int compareTo(Pracownik o) {
        return Double.compare(this.wyplata, o.wyplata);
    }

    @Override
    public void nakrzycz(Wulgarnik wulgarnik) {
        System.out.println("Krzycze na " + wulgarnik);
    }

    @Override
    public void krzycz() {

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
}
