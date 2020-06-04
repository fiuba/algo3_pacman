package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class JuegoPacmanTest {
    @Test
    public void testDummy() {
        assertEquals(1, 1);
    }

    @Test
    public void pacmanIntentaComerseUnFantasmaMuere() {
        Pinky f = new Pinky();
        Pacman pacman = new Pacman();

        pacman.comer(f);

        assertThrows(PacmanSinVidaException.class, () -> {
            pacman.comer(f);
        });
    }

    @Test
    public void pacmanComeElPeleteLosFantasmasSeDebilitanElPacanLoscomeEstosVanGuarida() {
        Pinky f = new Pinky();
        Pellet pellet = new Pellet(f);

        Pacman pacman = new Pacman();

        pacman.comer(pellet);
        pacman.comer(f);
        pacman.comer(f);

    }
}
