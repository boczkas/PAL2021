package lekcja23;

import lekcja17.Pracownik;

public class PairPracownik {
    Pracownik pracownik1;
    Pracownik pracownik2;

    public PairPracownik(Pracownik pracownik1, Pracownik pracownik2) {
        this.pracownik1 = pracownik1;
        this.pracownik2 = pracownik2;
    }

    public Pracownik getPracownik1() {
        return pracownik1;
    }

    public void setPracownik1(Pracownik pracownik1) {
        this.pracownik1 = pracownik1;
    }

    public Pracownik getPracownik2() {
        return pracownik2;
    }

    public void setPracownik2(Pracownik pracownik2) {
        this.pracownik2 = pracownik2;
    }
}
