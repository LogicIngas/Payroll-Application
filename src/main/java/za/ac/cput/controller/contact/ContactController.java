package za.ac.cput.controller.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.contact.Address;
import za.ac.cput.entity.contact.Contact;
import za.ac.cput.services.contact.AddressService;
import za.ac.cput.services.contact.ContactService;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PutMapping("/create")
    public Contact createContact(Contact contact){
        return contactService.create(contact);
    }

    @GetMapping("/read")
    public List<Contact> readContact(){
        return contactService.getAllContacts();
    }

    @GetMapping("/getAll/{email}")
    public List<Contact> readContactByEmail(String email){ //method not implemented in the repository package
        return contactService.getContactByEmail(email);
    }

    @PutMapping("/update")
    public Contact updateContact(Contact contact){
        return contactService.update(contact);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteContact(String employeeNumber){
        return contactService.delete(employeeNumber);
    }




    //    @Autowired
//    public ContactController(AddressService addressService) {
//        this.addressService = addressService;
//    }
//
//    @PostMapping("create")
//    public Address createaddress(Address address){
//        return addressService.create(address);
//    }
//
//
//    @GetMapping("/read")
//    public Address getAll(Contact contactId){
//        return addressService.read(contactId.get);
//    }

//    @GetMapping("/contact/id")
//    public String hello(){
//        return "Hello to all contacts in this class section";
//    }


}
