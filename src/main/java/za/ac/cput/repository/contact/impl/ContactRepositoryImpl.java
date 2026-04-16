package za.ac.cput.repository.contact.impl;

import za.ac.cput.entity.contact.Contact;
import za.ac.cput.repository.contact.ContactRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository {

    List<Contact> contactList;

    public ContactRepositoryImpl() {
        contactList = new ArrayList<>();
    }

    //Singleton
    private static ContactRepositoryImpl contactRepository = null;

    private static ContactRepositoryImpl getContactRepository() {
        if(contactRepository == null){
            contactRepository = new ContactRepositoryImpl();
        }
        return contactRepository;
    }

    @Override
    public Contact create(Contact contact) {
        boolean success = contactList.add(contact);
        if(success){
            return contact;
        }
        return null;
    }

    @Override
    public Contact read(String s) {
        for (Contact contact: contactList){
            if (contact.getEmail().equalsIgnoreCase(s)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact update(Contact contact) {
        Contact oldContact = read(contact.getEmail());
        if(oldContact == null){
            return null;
        }
        contactList.remove(oldContact);
        contactList.add(contact);

        return contact;
    }

    @Override
    public boolean delete(String s) {
        Contact contact = read(s);
        if(contact == null){
            return false;
        }
        return contactList.remove(s);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactList;
    }

    @Override
    public List<Contact> getContactByEmail(String email) {
        return contactList;
    }
}
