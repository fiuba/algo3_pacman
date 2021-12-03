package ar.edu.uba.fi;

public class Fantasma implements Comestible {

    private EstadoFantasma estado;

    public Fantasma() {
        this.estado = new Normal();
    }
    public Fantasma(EstadoFantasma estado) {
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
