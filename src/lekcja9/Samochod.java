package lekcja9;

import lekcja9.silnik.SilnikZaplonowy;
import lekcja9.stacyjka.Stacyjka;

public class Samochod {
    // składowe obiektu, inaczej pola klasy
    SilnikZaplonowy silnikZaplonowy;
    Stacyjka stacyjka;

    public Samochod() {
        this.silnikZaplonowy = new SilnikZaplonowy();
        this.stacyjka = new Stacyjka();
    }

    // metoda
    public void odpal() throws InterruptedException {
        if (!stacyjka.isPrzekrecona()) {
            stacyjka.przekrec();
        }
        silnikZaplonowy.odpalSilnikGlowny(stacyjka);
    }
}
