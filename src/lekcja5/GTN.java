package lekcja5;

import java.util.Scanner;

public class GTN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int wpisana = scanner.nextInt();
            System.out.println("Wpisales " + wpisana);

            if (wpisana == 13) {
                System.out.println("Koncze");
                break;
            }
        }
    }
}
