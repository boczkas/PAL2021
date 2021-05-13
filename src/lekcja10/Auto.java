package lekcja10;

public class Auto {
    String marka;
    double poziomPaliwa;

    public Auto() {
    }

    void zatankuj(double iloscPaliwa) {
        System.out.println("Tankujemy!");
        poziomPaliwa += iloscPaliwa;
    }
}
