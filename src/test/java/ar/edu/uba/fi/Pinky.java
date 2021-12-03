package ar.edu.uba.fi;

import javax.swing.*;

public class Pinky {

    private EstadoFantasma estado;

    // Problema 2: Utilizamos una bandera, en lugar de una clase polimorfa.
    public Pinky(boolean debilitado) {
        this.estado = new Normal();

        if ( debilitado ) {
            this.estado = new Debilitado();
        }
    }

    public void golpea(Pacman pacman) {
        this.estado.golpear(pacman);
    }
}
