package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Job;
import za.ac.cput.domain.Position;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class JobFactoryTest {

    @Test
    void a_createJob() {
        List<Position> positions = new ArrayList<>();
        positions.add(PositionFactory.createPosition("POS001", "Software Engineer", "OPEN"));
        Job job = JobFactory.createJob("Software Engineer", positions);
        assertNotNull(job);
    }

    @Test
    void b_createJobTestFailure() {
        Job job = JobFactory.createJob("", new ArrayList<>());
        assertNotNull(job);
//        assertNull(job);
    }
}