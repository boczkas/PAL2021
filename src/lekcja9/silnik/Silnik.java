package lekcja9.silnik;

public class Silnik {
    public void odpal() throws InterruptedException {
        System.out.println("Silnik: odpalam się");
        Thread.sleep(4000);
        System.out.println("Silnik: Odpaliłem się");
    }
}
