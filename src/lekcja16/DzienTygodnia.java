package lekcja16;

public enum DzienTygodnia {
    PN("Poniedzialek"),
    WT("Wtorek"),
    SR("Sroda"),
    CZ("Czwartek"),
    PT("Piatek"),
    SB("Sobota"),
    ND("Niedziela"),
    ;

    private final String opis;

    DzienTygodnia(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }
}
