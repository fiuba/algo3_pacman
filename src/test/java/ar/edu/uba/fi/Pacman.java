package ar.edu.uba.fi;

public class Pacman {
    private boolean vivo;

    public Pacman() {
        this.vivo = true;
    }

    public void come(Pinky pinky) {

        // Problema 3: Viola Open/Close principles.
        if ( pinky.debilitado ) {
            return;
        }

        if ( !this.vivo ) {
            throw new PacmanEstaMuerto();
        }
        this.vivo = false;
    }

//    public boolean estaVivo() {
//        return this.vivo;
//    }
}
