package ar.edu.uba.fi;

import javax.swing.*;

public class Pinky {

    private final Debilitado estado;

    // Problema 2: Utilizamos una bandera, en lugar de una clase polimorfa.
    public Pinky(boolean debilitado) {

        if ( debilitado ) {
            this.estado = new Debilitado();
        } else {
            this.estado = new Normal();
        }

    }

    public void golpea(Pacman pacman) {
        this.estado.golpear(pacman);
    }
}
