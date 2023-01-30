package lekcja24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generyki {
//  Nie idę w to narazie

  public static void main(String[] args) {
    Koszyk koszyk = new Koszyk();
    List<Owoc> owoce = new ArrayList<>();
    owoce.add(new Japko()); // można - japko jest owocem
    owoce.add(new Banan()); // można - banan jest owocem
    koszyk.dodajJapkaIWyzej(owoce); // można - Owoc jest nadtypem w stosunku do japka
    koszyk.zjedzWszystko(owoce); // można - lista Owoców

    Collection<Banan> banans = new ArrayList<>();
    banans.add(new Banan());
//     koszyk.dodajJapkaIWyzej(banans); // - nie można. Nie ma relacji między bananem a japkiem
    koszyk.zjedzWszystko(banans); // można - banan rozszerza owoc

    Collection<Japko> japkos = new ArrayList<>();
    koszyk.dodajJapkaIWyzej(japkos); // można - Japko jest typu Japko
    japkos.add(new Zgnilek()); // można - Zgnilek rozszerza Japko
    koszyk.zjedzWszystko(japkos); //  można - wszystkie Japka są Owocami

    Collection<Zgnilek> zgnileks = new ArrayList<>();
//    koszyk.dodajJapkaIWyzej(zgnileks);  // - nie można, Zgnilek nie jest nadtypem Japka
    koszyk.zjedzWszystko(zgnileks); // można, Zgnilki są Japkami, przez co implementuja Owoc

    Collection<Object> objects = new ArrayList<>();
    koszyk.dodajJapkaIWyzej(objects); // mozna - Object jest nadtypem Japka
    objects.add(new But());
    objects.add(new Telefon());
//    koszyk.zjedzWszystko(objects); // - nie można, przecież tam mogą być buty i telefony!

  }
}
