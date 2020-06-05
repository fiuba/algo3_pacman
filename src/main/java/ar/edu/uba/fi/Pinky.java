package ar.edu.uba.fi;

public class Pinky {

    private EstadoFantasma estadoFantasma;

    public Pinky() {

        estadoFantasma = new EstadoFantasmaNormal();
    }

    public void debilitar() {

        estadoFantasma = new EstadoFantasmaDebilitado();
    }

    public EstadoPacman chocar(Pacman pacman) {

        return estadoFantasma.chocar(pacman);
    }
}
