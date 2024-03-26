package cz.czechitas.lekce11.grafika;

import java.io.PrintStream;

public abstract class Tvar {
    public void nakreslit() {
        nakreslit(System.out);
    }

    public abstract void nakreslit(PrintStream out);
}
