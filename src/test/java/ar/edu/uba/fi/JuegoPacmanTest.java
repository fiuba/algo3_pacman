package ar.edu.uba.fi;

import jdk.internal.org.objectweb.asm.commons.RemappingClassAdapter;
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

//    @Test
//    public void pacmanComePelletLosFantasmasSeDebilitan() {
//        Pacman pacman = new Pacman();
//        Pinky pinky = new Pinky();
//        Pellet pellet = new Pellet(pinky);
//
//        pacman.comer(pellet);
//
//        assertTrue(pinky.estaDebilitado());
//    }

    @Test
    public void pacmanComeElPeleteLosFantasmasSeDebilitanElPacmanLoscomeEstosVanGuarida() {
        Pinky pinky = new Pinky();
        Pellet pellet = new Pellet(pinky);

        Pacman pacman = new Pacman();

        pacman.comer(pellet);
        pacman.comer(pinky);

        assertDoesNotThrow(() -> {
            pacman.comer(pinky);
        });

        // shoudnt: raise:

        // Opcion 1
        //        assertTrue( pinky.enGuarida())

        // Opcion 2
        //  pacman.comer(pinky);
        //
        //  assertTrue(pacman.estaMuerto());

        //  assertFalse(pacman.estaMuerto());

    }
}
