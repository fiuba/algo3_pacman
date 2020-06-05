package ar.edu.uba.fi;

public class EstadoFantasmaDebilitado implements EstadoFantasma {

    @Override
    public EstadoPacman chocar(Pacman pacman) {
        return new PacmanVivo(pacman);
    }
}
