package cz.czechitas.lekce11.grafika;

import java.io.PrintStream;

public class Trojuhelnik extends Tvar {
    private final int delkaStrany;

    public Trojuhelnik(int delkaStrany) {
        if (delkaStrany < 3) {
            throw new IllegalArgumentException(String.format("Délka strany musí být 3 nebo více. Zadaná hodnota: %d.", delkaStrany));
        }
        if (delkaStrany % 2 != 1) {
            throw new IllegalArgumentException(String.format("Délka strany trojúhelníku musí být liché číslo. Zadaná hodnota: %d.", delkaStrany));
        }
        this.delkaStrany = delkaStrany;
    }

    public Trojuhelnik() {
        this(5);
    }


    @Override
    public void nakreslit(PrintStream out) {
        out.print(" ".repeat((delkaStrany - 1) / 2));
        out.print("*");
        out.print(" ".repeat((delkaStrany - 1) / 2));
        out.println();
        for (int radek = 0; radek < (delkaStrany - 3) / 2; radek++) {
            nakreslitRadek(out, radek);
        }
        out.print("*".repeat(delkaStrany));
        out.println();
    }

    private void nakreslitRadek(PrintStream out, int radek) {
        int prostredek = radek * 2 + 1;
        int vnejsek = ((delkaStrany - 1) / 2) - radek - 1;
        out.print(" ".repeat(vnejsek));
        out.print('*');
        out.print(" ".repeat(prostredek));
        out.print('*');
        out.print(" ".repeat(vnejsek));
        out.println();
    }

}
