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
        Pinky pinky = new Pinky();

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

        Pinky pinky = new Pinky(new Debilitado());

        pacman.come(pinky);

        assertDoesNotThrow(() -> {
            pacman.come(new Comida());
        });
    }

    @Test
    public void pacmanComePelletLosFantasmasSeDebilitan() {
        Pacman pacman = new Pacman();
        Pinky pinky = new Pinky();

        Pellet p = new Pellet(pinky);

        pacman.come(p);
        pacman.come(pinky);

        assertDoesNotThrow(() -> {
            pacman.come(new Comida());
        });


    }
}
