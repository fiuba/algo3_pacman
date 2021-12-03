package ar.edu.uba.fi;

public class Pacman {
    private boolean vivo;

    public Pacman() {
        this.vivo = true;
    }

    public void come(Comida c) {
        if (!this.vivo) {
            throw new PacmanEstaMuerto();
        }
    }

    public void come(Pellet p) {
        if (!this.vivo) {
            throw new PacmanEstaMuerto();
        }

        p.fueComido();
    }

    public void come(Pinky pinky) {

        if (!this.vivo) {
            throw new PacmanEstaMuerto();
        }

        pinky.golpea(this);

    }

    public void muere() {
        this.vivo = false;
    }
}
