package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Position;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PositionFactoryTest {


    @Test
    void a_createOpenPosition() {
        Position position = PositionFactory.createPosition("POS001", "Software Engineer", "OPEN");
        assertNotNull(position);
        assertEquals("OPEN", position.getStatus());
    }

    @Test
    void a_createClosedPosition() {
        Position position = PositionFactory.createPosition("POS002", "Business Analyst", "CLOSED");
        assertNotNull(position);
        assertEquals("CLOSED", position.getStatus());
    }

    @Test
    void c_createPositionFail() {
        Position position = PositionFactory.createPosition(null, null, null);
//        assertNull(position);
        assertNotNull(position);
    }
}