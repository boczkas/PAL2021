package lekcja10;

import java.util.Arrays;

public class Sala {
    boolean[] wolneMiejsca;

    public Sala() {
        wolneMiejsca = new boolean[5];
        Arrays.fill(wolneMiejsca, true);
    }
}
