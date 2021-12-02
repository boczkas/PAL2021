package lekcja27;

public class Sleeper implements Runnable {
    private final String name;

    public Sleeper(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (double i = 0; i < 4; i++) {
            System.out.println("Działam w " + name + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
