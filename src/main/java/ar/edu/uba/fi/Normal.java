package ar.edu.uba.fi;

public class Normal implements EstadoFantasma {

    @Override
    public void golpear(Pacman pacman) {
        pacman.muere();
    }
}
