package ar.edu.uba.fi;

public class Pellet {
    private Pinky fantasma;

    public Pellet(Pinky fantasma) {

        this.fantasma = fantasma;
    }

    public void debilitarFantasmas() {
        fantasma.debilitar();
    }
}
