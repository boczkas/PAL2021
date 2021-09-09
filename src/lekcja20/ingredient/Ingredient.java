package lekcja20.ingredient;

public class Ingredient {
    private final String name;
    private final int maxAmount;

    public Ingredient(String name, int maxAmount) {
        this.name = name;
        this.maxAmount = maxAmount;
    }

    public String getName() {
        return name;
    }

    public int getMaxAmount() {
        return maxAmount;
    }
}
