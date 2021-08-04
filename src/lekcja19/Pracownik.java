package lekcja19;

import lekcja17.Krzykacz;
import lekcja17.Wulgarnik;

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
}
