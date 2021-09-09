package lekcja20.control;

public class AddRecepieCommand implements Command {
    @Override
    public void execute() {
        System.out.println("AddRecepieCommand execution");
    }
}
