package lekcja17;

public interface Krzykacz {
    int a = 5;
    static void zwiekszGlosnosc(int glosnosc) {
        System.out.println(glosnosc + 10);
    }
    void wydajDzwiek();
    default void krzycz() {
        throw new UnsupportedOperationException();
    }

    private void lala(){
        System.out.println("Lalal");
    }

    default void nakrzycz() {
        System.out.println("Nie zaimplementowana");
    }

    default void mowGlosno() {
        System.out.println("Mowie glosno!");
    }
}
