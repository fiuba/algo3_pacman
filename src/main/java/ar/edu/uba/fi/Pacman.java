package ar.edu.uba.fi;

public class Pacman {
    private int vidas;

    public void morir() {

        this.vidas = 0;
    }

    public void comer(Fantasma f) {

        f.clolisionar(this);
    }

    public void comer(Pellet pellet) {

        pellet.colisionar(this);
    }

}
