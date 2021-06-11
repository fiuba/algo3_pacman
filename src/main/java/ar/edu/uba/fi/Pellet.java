package ar.edu.uba.fi;

import java.util.ArrayList;

public class Pellet {

    private final ArrayList<Fantasma> fantasmas;
    private int count;

    public Pellet(Fantasma f1, Fantasma f2) {
        this.fantasmas = new ArrayList<>();

        this.fantasmas.add(f1);
        this.fantasmas.add(f2);

    }

    public void colisionar(Pacman pacman) {

        if (count > 0 ) {
            return;
        }

        for (Fantasma f : this.fantasmas) {
            f.debilitar();
        }

        this.count = this.count + 1;
    }
}
