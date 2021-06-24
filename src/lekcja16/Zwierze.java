package lekcja16;

import jdk.jshell.spi.ExecutionControl;

public class Zwierze {
    protected void wydajDzwiek() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Nie dziala");
    }
}
