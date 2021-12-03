package ar.edu.uba.fi;

public class Pinky implements Comestible {

    private EstadoFantasma estado;

    public Pinky() {
        this.estado = new Normal();
    }
    public Pinky(EstadoFantasma estado) {
        this.estado = estado;
    }

    @Override
    public void golpea(Pacman pacman) {

        this.estado.golpear(pacman);
    }

    public void debilitar() {
        this.estado = new Debilitado();
    }
}
