package lekcja9.stacyjka;

public class Stacyjka {
    // składowa
    boolean przekrecona;

    public Stacyjka() {
        this.przekrecona = false;
    }

    public void przekrec() throws InterruptedException {
        System.out.println("Stacyjka: Przekrecam stacyjke");
        Thread.sleep(2000);
        przekrecona = !przekrecona;
    }

    public boolean isPrzekrecona() {
        return przekrecona;
    }
}
