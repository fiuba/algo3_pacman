package ar.edu.uba.fi;

public class Fantasma {
    private Estado estado;

    public Fantasma() {
        this.estado = new FantasmaNoDebilitado();
    }

    public void clolisionar(Pacman p) {
        this.estado = this.estado.colisionar(p);
    }

    public void debilitar() {
        this.estado = new FantasmaDebilitado();
    }
}
