package lekcja20.control;

public class HelpCommand implements Command {
    @Override
    public void execute() {
        System.out.println("HelpCommand execution");
    }
}
