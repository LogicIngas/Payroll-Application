package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.AddressDetails;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AddressDetailsFactoryTest {

    @Test
    void a_createAddressDetailsTest() {
        AddressDetails address = AddressDetailsFactory.createAddressDetails("123 Adderley St", "8001");
        assertNotNull(address);
    }

    @Test
    void b_createAddressDetailsFail() {
        AddressDetails address = AddressDetailsFactory.createAddressDetails("", "8001");
        assertNotNull(address);
//        assertNull(address);
        //Here I must put assertNull() so that it will pass the test
    }


}