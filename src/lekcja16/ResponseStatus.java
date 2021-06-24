package lekcja16;

public enum ResponseStatus {
    OK(200),
    NOT_OK(400),
    ;

    private int number;
    ResponseStatus(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
