package lekcja13.zwierzaki;

public class SpiacyPies extends Pies {
    public SpiacyPies(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Nie chce mi sie z toba gadac.");
    }
}
