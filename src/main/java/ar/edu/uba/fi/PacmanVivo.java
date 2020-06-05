package ar.edu.uba.fi;

public class PacmanVivo implements EstadoPacman {

    private Pacman pacman;

    public PacmanVivo(Pacman pacman) {

        this.pacman = pacman;
    }

    @Override
    public EstadoPacman comer(Pinky f) {
        return f.chocar(pacman);
    }
}
