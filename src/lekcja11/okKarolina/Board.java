package lekcja11.okKarolina;

public class Board {

    int rozmiar;
    public Board(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public void show() {
        System.out.println("Tu wyswietli sie plansza");
    }

    public boolean hasWinner() {
        System.out.println("Tu bedziemy sprawdzac czy jest zwyciezca");
        return false;
    }
}
