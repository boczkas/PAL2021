package lekcja24;

import java.util.Collection;

class But{}
class Telefon{}
interface Owoc{}
class Japko implements Owoc{}
class Banan implements Owoc{}
class Zgnilek extends Japko{}

public class Koszyk {

    public void zjedzWszystko(Collection<? extends Owoc> owocs) {}
    public void dodajJapkaIWyzej(Collection<? super Japko> japka) {}
}
