package lekcja9;

public class Kot {
    String imie;
    int wiek;

    void miaucz() {
        System.out.println("Miau!!!");
    }

    void przedstawSie() {
        System.out.println("Czesc, jestem " + imie + " i mam " + wiek + " lat");
    }

    void przywitajSie(String imie) {
        if(imie.equals("Przemek")) {
            System.out.println("Nie lubie cie, nie bede sie wital.");
        } else {

            System.out.println("Czesc! " + imie);
        }
    }

    private void skakaj() {
        System.out.println("Skacze i lamie noge");
    }
}
