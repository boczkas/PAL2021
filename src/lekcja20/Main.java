package lekcja20;

import lekcja20.control.*;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Command> commandMap = Map.of(
            "addRecepie", new AddRecepieCommand(),
            "help", new HelpCommand(),
            "makeDrink", new MakeDrinkCommand(),
            "showIngredientsStatus", new ShowIngredientsStatusCommand(),
            "showRecepies", new ShowRecepiesCommand()
        );

        System.out.println("Hello, put some command!");
        while (true) {
            Command command = commandMap.get(scanner.next());
            if (command != null) {
                command.execute();
            } else {
                System.out.println("Unrecognized command");
            }
        }
    }
}
