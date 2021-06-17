package lekcja15;

import java.util.Objects;

public class Pies extends Zwierze {

    String imie;

    public Pies(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Pies{" +
                "imie='" + imie + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pies pies = (Pies) o;
        return Objects.equals(imie, pies.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie);
    }
}
