package lekcja10;

public class Auto {
    String marka;
    int poziomPaliwa;

    static int iloscAut;

    public Auto() {
        iloscAut++;
    }

    public Auto(String marka, int poziomPaliwa) {
        this.marka = marka;
        this.poziomPaliwa = poziomPaliwa;
        iloscAut++;
    }

    public Auto(String marka) {
        this.marka = marka;
        this.poziomPaliwa = 0;
        iloscAut++;
    }

    void zatankuj(int iloscPaliwa) {
        System.out.println("Tankujemy!");
        this.poziomPaliwa += iloscPaliwa;
    }
}
