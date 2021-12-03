package ar.edu.uba.fi;

public class Pinky {

    private EstadoFantasma estado;

    public Pinky() {
        this.estado = new Normal();
    }
    public Pinky(EstadoFantasma estado) {
        this.estado = estado;
    }
    // Problema 2: Utilizamos una bandera, en lugar de una clase polimorfa.

    public void golpea(Pacman pacman) {
        this.estado.golpear(pacman);
    }

    public void debilitar() {
        this.estado = new Debilitado();
    }
}
