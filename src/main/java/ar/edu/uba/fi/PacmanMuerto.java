package ar.edu.uba.fi;

public class PacmanMuerto implements EstadoPacman {

    @Override
    public EstadoPacman comer(Pinky f) {
        throw new PacmanSinVidaException();
    }
}
