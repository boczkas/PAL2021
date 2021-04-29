package lekcja9.silnik;

import lekcja9.stacyjka.Stacyjka;

public class SilnikZaplonowy {
    Silnik silnik;

    public SilnikZaplonowy() {
        this.silnik = new Silnik();
    }

    public void odpalSilnikGlowny(Stacyjka stacyjka) throws InterruptedException {
        if (stacyjka.isPrzekrecona()) {
            System.out.println("SilnikZaplonowy: Stacyjka przekręcona, mój obwód zamknięty");
            System.out.println("SilnikZaplonowy: Odpalam silnik główny");
            silnik.odpal();
            System.out.println("SilnikZaplonowy: Silnik główny odpalony.");
        }
    }
}
