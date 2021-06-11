package ar.edu.uba.fi;

public class FantasmaDebilitado implements Estado {
    @Override
    public Estado colisionar(Pacman p) {
        return new FantasmaZombie();
    }
}
