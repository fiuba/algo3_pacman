package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class JuegoPacmanTest {
    @Test
    public void pacmanComeFantasmaNoDebilitadoEntoncesMuere() {
        Pacman pacman = new Pacman();
        Fantasma pinky = new Fantasma();

        pacman.come(pinky);

        assertThrows(PacmanEstaMuerto.class, () -> {
            pacman.come(pinky);
        });

        // Tell don't ask
        // assertEquals(false, pacman.estaVivo());
        // assertEquals(new Muerto(), pacman.estado());
    }

    @Test
    public void pacmanComeFantasmaDebilitadoEntoncesPuedeSeguirComiendoYElFantasmaVaGuarida() {
        Pacman pacman = new Pacman();

        Fantasma pinky = new Fantasma(new Debilitado());

        pacman.come(pinky);

        assertDoesNotThrow(() -> {
            pacman.come(new Comida());
        });
    }

    @Test
    public void pacmanComePelletLosFantasmasSeDebilitan() {
        Pacman pacman = new Pacman();
        Fantasma pinky = new Fantasma();

        Comestible pellet = new Pellet(pinky);

        pacman.come(pellet);
        pacman.come(pinky);

        assertDoesNotThrow(() -> {
            pacman.come(new Comida());
        });
    }

    @Test
    public void pacmanChocaDosVecesConPinkyMuereSinoNo() {
        Pacman pacman = new Pacman();
        Fantasma fantasma = new Pink();

        pacman.come(fantasma);
        assertDoesNotThrow(() -> {
            pacman.come(fantasma);
        });

        assertThrows(PacmanEstaMuerto.class, () -> {
            pacman.come(fantasma);
        });


    }
}
