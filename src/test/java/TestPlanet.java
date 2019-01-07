import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlanet {
    Planet planet;

    @Before
    public void before() {
        planet = new Planet("Jupiter", 500000);
    }

    @Test
    public void hasName() {
        assertEquals("Jupiter", planet.getName() );
    };

    @Test
    public void hasSize() {
        assertEquals(500000, planet.getSize() );
    }

    @Test
    public void planetCanExplode() {
        assertEquals("Boom! Jupiter has exploded.", planet.explode() );
    }
}
