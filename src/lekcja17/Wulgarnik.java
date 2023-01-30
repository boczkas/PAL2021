package lekcja17;

public interface Wulgarnik {
    void nakrzycz(Wulgarnik inny);
    default void krzycz() {
        System.out.println("Krzycze");
    }

    default void mowGlosno() {
        System.out.println("Mowie glosno!");
    }
}
