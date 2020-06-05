package ar.edu.uba.fi;

public class Pacman {
    private EstadoPacman estado;

    public Pacman() {
        
        estado = new PacmanVivo(this);
    }

    public void comer(Pinky f) {


        this.estado = this.estado.comer(f);
    }

    public void comer(Pellet pellet) {


        pellet.debilitarFantasmas();
    }

    public EstadoPacman matar() {
        estado = new PacmanMuerto();

        return estado;
    }
}
