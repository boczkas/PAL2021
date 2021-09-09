package lekcja20.control;

public class MakeDrinkCommand implements Command {
    @Override
    public void execute() {
        System.out.println("MakeDrinkCommand execution");
    }
}
