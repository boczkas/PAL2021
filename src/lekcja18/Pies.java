package lekcja18;

import java.util.Objects;

public class Pies {
    String name;

    public Pies(String name) {
        this.name = name;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pies pies = (Pies) o;
//        return Objects.equals(name, pies.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
//
    @Override
    public String toString() {
        return "Pies{" +
                "name='" + name + '\'' +
                '}';
    }
}
