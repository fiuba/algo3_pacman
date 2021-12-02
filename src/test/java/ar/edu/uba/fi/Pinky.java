package ar.edu.uba.fi;

public class Pinky {

    // Promblema 1: Atributo público. Violas Ocultamiento de la información.
    public boolean debilitado;

    // Problema 2: Utilizamos una bandera, en lugar de una clase polimorfa.
    public Pinky(boolean debilitado) {

        this.debilitado = debilitado;
    }

}
