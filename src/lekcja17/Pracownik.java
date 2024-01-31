package lekcja17;
//Comparable<Pracownik>,
//Wulgarnik
public class Pracownik implements Comparable<Pracownik>, Krzykacz, Wulgarnik {
    String imie;
    double wyplata;

    public Pracownik(String imie, double wyplata) {
        this.imie = imie;
        this.wyplata = wyplata;
    }

//    @Override
//    public int compareTo(Pracownik o) {
//        return Double.compare(this.wyplata, o.wyplata);
//    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", wyplata=" + wyplata +
                '}';
    }

//    @Override
//    public int compareTo(Pracownik o) {
//        return Double.compare(this.wyplata, o.wyplata);
//    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Daj wincy piniendzy");
    }

    @Override
    public void siema() {
        System.out.println("Siema pracownika");
    }

//    @Override
//    public void krzycz() {
//        System.out.println("Krzycze po pracowniczemu");
//    }

    @Override
    public void mowGlosno() {
        System.out.println("mowie glosno po pracowniczemu");
    }

    @Override
    public void krzycz() {
        System.out.println("Krzycze po pracowniczemu");
    }

    @Override
    public int compareTo(Pracownik o) {
        return Double.compare(this.wyplata, o.wyplata);
    }

    @Override
    public void nakrzycz(Wulgarnik wulgarnik) {
        System.out.println("Krzycze na " + wulgarnik);
    }

//    @Override
//    public int compareTo(Pracownik o) {
//        return this.imie.length() - o.imie.length();
//    }
}
