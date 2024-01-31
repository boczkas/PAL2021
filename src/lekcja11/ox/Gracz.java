package lekcja11.ox;

public class Gracz {
    String imie;
    String symbol;
    public Gracz(String imie, String symbol) {
        this.imie = imie;
        this.symbol = symbol;
    }

    public void ruch(Plansza plansza, int x, int y) {
//        Tu bedzie obsluga ruchu
        System.out.println("Tu postawie " + symbol + " na pozycji " + x + y);
    }
}
