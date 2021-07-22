package lekcja16;

import jdk.jshell.spi.ExecutionControl;

import java.io.FileNotFoundException;
import java.util.Objects;

public class Kot extends Zwierze {
    String imie;
    int wiek;

    public Kot(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public int getWiek() {
        return wiek;
    }

    public void powiedzMiau() {
        System.out.println("Miauuuuuuu!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kot kot = (Kot) o;
        return wiek == kot.wiek && Objects.equals(imie, kot.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek);
    }

    @Override
    protected void wydajDzwiek() {
        System.out.println("Miau");
    }
}
