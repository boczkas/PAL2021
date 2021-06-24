package lekcja16;

public class Kot extends Zwierze {
    String imie;
    int wiek;

    public Kot(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void powiedzMiau() {
        System.out.println("Miauuuuuuu!");
    }
}
