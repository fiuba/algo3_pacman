package ar.edu.uba.fi;

import java.util.Arrays;
import java.util.List;

public class Pellet implements Comestible {
    private List<Pinky> fantasmas;

    public Pellet(Pinky p) {
        this.fantasmas = Arrays.asList(p);
    }

    @Override
    public void golpea(Pacman pacman) {
        for (Pinky p : this.fantasmas) {
            p.debilitar();
        }
    }
}
