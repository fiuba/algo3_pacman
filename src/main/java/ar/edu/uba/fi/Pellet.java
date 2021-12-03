package ar.edu.uba.fi;

import java.util.Arrays;
import java.util.List;

public class Pellet {
    private List<Pinky> fantasmas;

    public Pellet(Pinky p) {
        this.fantasmas = Arrays.asList(p);
    }
    public void fueComido() {
        for (Pinky p : this.fantasmas) {
            p.debilitar();
        }
    }
}
