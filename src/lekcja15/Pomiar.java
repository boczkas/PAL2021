package lekcja15;

import java.util.Objects;

public class Pomiar {
    int wartosc;
    String data;

    public Pomiar(int wartosc, String data) {
        this.wartosc = wartosc;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pomiar pomiar = (Pomiar) o;
        return wartosc == pomiar.wartosc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wartosc);
    }
}
