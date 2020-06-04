package ar.edu.uba.fi;

public class Pacman {
    private boolean vivo;

    public Pacman() {
        this.vivo = true;
    }

    public Pinky comer(Pinky f) {

        if ( !vivo ) {
            throw new PacmanSinVidaException();
        }

        f.chocar(this);

        return f;
    }

    public void comer(Pellet pellet) {
        pellet.debilitarFantasmas();
    }

    public void matar() {
        this.vivo = false;
    }
}
