package ar.edu.uba.fi;

public class FantasmaNoDebilitado implements Estado {
    @Override
    public Estado colisionar(Pacman p) {
        p.morir();
        return this;
    }
}
