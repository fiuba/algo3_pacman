package ar.edu.uba.fi;

public class Pinky {

    private EstadoNormal estado;

    public Pinky() {
        this.estado = new EstadoNormal();
    }

    public void debilitar() {
        this.estado = new EstadoDebilitado();
    }

    public void chocar(Pacman pacman) {

        this.estado.chocar(pacman);
    }
}
