package lekcja13.zwierzaki;

public class Pies {
    public String name;
    public int age;

    public Pies(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Siema jestem " + name + " i mam " + age + " lat.");
    }
}
