package za.ac.cput.services.contact.impl;

import za.ac.cput.entity.contact.Contact;
import za.ac.cput.repository.contact.ContactRepository;
import za.ac.cput.repository.contact.impl.ContactRepositoryImpl;
import za.ac.cput.services.contact.ContactService;

import java.util.List;

public class ContactServiceImpl implements ContactService {

    private static ContactRepository contactRepository = null;
    private static ContactServiceImpl contactService;

    public static ContactRepository getContactRepository() {
        if(contactRepository == null){
            contactRepository = new ContactRepositoryImpl();
        }
        return contactRepository;
    }

    @Override
    public Contact create(Contact contact) {
        return this.contactRepository.create(contact);
    }

    @Override
    public Contact read(String s) {
        return this.contactRepository.read(s);
    }

    @Override
    public Contact update(Contact contact) {
        return this.contactRepository.update(contact);
    }

    @Override
    public boolean delete(String s) {
        return this.contactRepository.delete(s);
    }

    @Override
    public List<Contact> getAllContacts() {
        return this.contactRepository.getAllContacts();
    }

    @Override
    public List<Contact> getContactByEmail(String email) {
        return this.contactRepository.getContactByEmail(email);
    }
}
