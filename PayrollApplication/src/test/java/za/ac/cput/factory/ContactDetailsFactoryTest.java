package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.ContactDetails;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ContactDetailsFactoryTest {

    @Test
    @Order(1)
    void a_createContactDetailsTest() {
        ContactDetails contact = ContactDetailsFactory.createContactDetails("0712345678", "12345623@mycput.ac.za", "0695550000");
        assertNotNull(contact);
    }

    @Test
    @Order(2)
    void b_createContactDetailsInvalidEmail() {
        ContactDetails contact = ContactDetailsFactory.createContactDetails("0712345678", "12345623mycput.ac.za", "0215550000");
        assertNotNull(contact);
        //fix the email so that it will pass the test
    }

    @Test
    @Order(3)
    void b_createContactDetailsFail() {
        ContactDetails contact = ContactDetailsFactory.createContactDetails("0712345678", "", "0215550000");
        assertNotNull(contact);
        //        assertNull(contact);
        //put assertNull() so that it will pass the test
    }
}