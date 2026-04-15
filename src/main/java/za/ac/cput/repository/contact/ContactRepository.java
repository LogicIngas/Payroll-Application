package za.ac.cput.repository.contact;

import za.ac.cput.entity.contact.Contact;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface ContactRepository extends IRepository<Contact, String> {
    List<Contact> getAllContacts();
    List<Contact> getContactByEmail(String email);
}
