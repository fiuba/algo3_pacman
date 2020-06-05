package ar.edu.uba.fi;

public class EstadoFantasmaNormal implements EstadoFantasma {

    @Override
    public EstadoPacman chocar(Pacman pacman) {


        return pacman.matar();
    }
}
