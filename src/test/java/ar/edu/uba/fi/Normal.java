package ar.edu.uba.fi;

public class Normal extends Debilitado {

    @Override
    public void golpear(Pacman pacman) {
        pacman.muere();
    }
}
