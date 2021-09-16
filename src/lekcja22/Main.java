package lekcja22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {

//      Obsługa wielu wyjątków
    try {
      rzucamWyjatek1();
      throw new Wyjatek2();
    } catch (Wyjatek1 wyjatek1) {
      System.out.println("Polecial wyjatek 1");
    } catch (Wyjatek2 wyjatek2) {
      System.out.println("Polecial wyjatek 2");
    }

      try {
          rzucamWyjatek1();
          throw new Wyjatek2();
      } catch (Wyjatek1 | Wyjatek2 wyjatek) {
          System.out.println("Polecial wyjatek");
      }

    //      finally
    try {
      rzucamWyjatek1();
      throw new Wyjatek2();
    } catch (Wyjatek1 | Wyjatek2 wyjatek) {
      System.out.println("Polecial wyjatek, czy to koniec?");
    } finally {
      System.out.println("A ja i tak sie wyswietle");
    }

//    try with resources
      BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/lekcja22/plik.txt"));
      try {
      System.out.println(br.readLine());
      } catch (IOException e) {
          e.printStackTrace();
      } finally {
          br.close();
      }

      try (br) {
          System.out.println(br.readLine());
      } catch (IOException e) {
          e.printStackTrace();
      }
  }

  static void rzucamWyjatek1() throws Wyjatek1 {
      throw new Wyjatek1();
  }
}
