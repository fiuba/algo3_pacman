package ar.edu.uba.fi;

import java.util.Arrays;
import java.util.List;

public class Pellet implements Comestible {
    private List<Fantasma> fantasmas;

    public Pellet(Fantasma p) {
        this.fantasmas = Arrays.asList(p);
    }

    @Override
    public void golpea(Pacman pacman) {
        for (Fantasma p : this.fantasmas) {
            p.debilitar();
        }
    }
}
