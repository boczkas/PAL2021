package lekcja20.control;

public class ShowIngredientsStatusCommand implements Command {
    @Override
    public void execute() {
        System.out.println("ShowIngredientsStatusCommand execution");
    }
}
