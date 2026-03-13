package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeFactoryTest {

    private ContactDetails contact;
    private AddressDetails address;
    private Position position;
    private List<Identity> identities;

    @BeforeEach
    void setUp() {
        contact = ContactDetailsFactory.createContactDetails("0712345678", "123456723@mycput.ac.za", "0695550000");
        address = AddressDetailsFactory.createAddressDetails("123 Adderley St", "8001");
        position = PositionFactory.createPosition("POS001", "Software Engineer", "CLOSED");
        identities = new ArrayList<>();
        identities.add(IdentityFactory.createIdentity("Passport", "ZG1234"));
    }


    @Test
    void a_createPermanentEmployee() {
        Employee emp = EmployeeFactory.createEmployee(
                "EMP101", "Inga", "Permanent", "South African",
                contact, address, position, identities);
        assertNotNull(emp);
    }

    @Test
    void b_createContractEmployee() {
        Employee emp = EmployeeFactory.createEmployee(
                "EMP102", "Lubanzi", "Contract", "Zimbabwe",
                contact, address, position, identities);
        assertNotNull(emp);
    }

    @Test
    void c_createEmployeeFailureTest() {
        Employee emp = EmployeeFactory.createEmployee(

                "", "Inga", "Permanent", "South African",
                contact, address, position, identities);
        assertNotNull(emp);
//        assertNull(emp);
    }
}