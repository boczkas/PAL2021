package lekcja11.ox;

public class Plansza {
    private final int rozmiar;
    public Plansza(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public boolean sprawdzZwyciezce(Gracz gracz) {
        System.out.println("Sprawdzam zwyciestwo gracza " + gracz.imie);
        return false;
    }

    public void wypisz() {
        System.out.println("Tu bedzie wypisana plansza");
    }
}
