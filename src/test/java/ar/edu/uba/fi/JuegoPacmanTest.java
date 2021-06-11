package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class JuegoPacmanTest
{
    @Test
    public void testDummy() {

        assertEquals(1,1);
    }

    @Test
    public void PacmanComePelletYFantasmasSonDebiles() {
        Pacman pacman = new Pacman();
        Fantasma pinky = new Fantasma();
        Fantasma inky = new Fantasma();

        Pellet pellet = new Pellet(pinky, inky);

//        pacman.comerPellet();
        pacman.comer(pellet);

        pacman.comer(pinky);
        pacman.comer(inky);
    }
}
