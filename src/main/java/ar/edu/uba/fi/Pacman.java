package ar.edu.uba.fi;

public class Pacman {
    private boolean vivo;

    public Pacman() {

        this.vivo = true;
    }

    public void come(Comestible cosa) {

        verificarEstado();

        cosa.golpea(this);
    }

    private void verificarEstado() {

        if (!this.vivo) {
            throw new PacmanEstaMuerto();
        }
    }

    public void muere() {

        this.vivo = false;
    }
}
