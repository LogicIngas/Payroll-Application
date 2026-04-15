package za.ac.cput.services.contact;

import za.ac.cput.entity.contact.Contact;
import za.ac.cput.services.IService;

import java.util.List;

public interface ContactService extends IService<Contact,String> {
    List<Contact> getAllContacts();
    List<Contact> getContactByEmail(String email);
}
