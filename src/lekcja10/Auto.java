package lekcja10;

public class Auto {
    String marka;
    int poziomPaliwa;

    public Auto() {
    }

    public Auto(String marka, int poziomPaliwa) {
        this.marka = marka;
        this.poziomPaliwa = poziomPaliwa;
    }

    public Auto(String marka) {
        this(marka, 0);
    }

    void zatankuj(int iloscPaliwa) {
        System.out.println("Tankujemy!");
        poziomPaliwa += iloscPaliwa;
    }
}
