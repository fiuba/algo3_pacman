package ar.edu.uba.fi;

public class Pink extends Fantasma {

    private int contador;

    public Pink() {
        super();
        this.contador = 1;
    }

    @Override
    public void golpea(Pacman pacman) {
        this.contador = this.contador + 1;

        if (this.contador > 2) {
            super.golpea(pacman);
        }
    }

}
