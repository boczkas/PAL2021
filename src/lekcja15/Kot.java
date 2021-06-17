package lekcja15;

import java.util.Objects;

public class Kot extends Zwierze {
    String imie;

    public Kot(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Kot{" +
                "imie='" + imie + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kot kot = (Kot) o;
        return Objects.equals(imie, kot.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie);
    }
}
