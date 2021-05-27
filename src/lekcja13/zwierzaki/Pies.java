package lekcja13.zwierzaki;

public class Pies {
    String name;
    int age;


    public Pies(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Siema jestem " + name + " i mam " + age + " lat.");
    }
}
