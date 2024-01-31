package lekcja13.zwierzaki;

public class SzkolonyPies extends Pies {
    String skill;

    public SzkolonyPies(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello() {
        System.out.println("Siema jestem " + name + " mój skill to: " + skill);
    }

    public void robSztuczki() {
        System.out.println("To ja bede " + skill);
    }
}
