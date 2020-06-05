package ar.edu.uba.fi;

public class Pellet {
    private final Pinky fantasma;

    public Pellet(Pinky pinky) {

        this.fantasma = pinky;
    }

    public void debilitarFantasmas() {
        this.fantasma.debilitar();
    }
}
