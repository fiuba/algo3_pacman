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
        Pinky pinky = new Pinky(false);

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

        Pinky pinky = new Pinky(true);

        pacman.come(pinky);

        assertDoesNotThrow(() -> {
            pacman.come(new Comida());
        });
    }
}
