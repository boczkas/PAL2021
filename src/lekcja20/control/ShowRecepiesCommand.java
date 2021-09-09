package lekcja20.control;

public class ShowRecepiesCommand implements Command {
    @Override
    public void execute() {
        System.out.println("ShowRecepiesCommand execution");
    }
}
