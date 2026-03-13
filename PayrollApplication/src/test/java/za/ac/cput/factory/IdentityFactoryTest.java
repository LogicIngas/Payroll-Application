package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Identity;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class IdentityFactoryTest {

    @Test
    void a_createIdentityPassportTest() {
        Identity identity = IdentityFactory.createIdentity("Passport", "ZG1234");
        assertNotNull(identity);
    }

    @Test
    void a_createIdentityIdBookTest() {
        Identity identity = IdentityFactory.createIdentity("ID Book", "8901155012082");
        assertNotNull(identity);
    }

    @Test
    void c_createIdentityFailTest() {
        Identity identity = IdentityFactory.createIdentity("","");
        assertNotNull(identity);
//        assertNull(identity);
    }

}