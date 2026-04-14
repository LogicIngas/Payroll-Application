package za.ac.cput.factory.contact;

import za.ac.cput.entity.contact.Contact;
import za.ac.cput.util.Helper;

public class ContactFactory {
    public static Contact createContact(String cellNumber, String homeNumber,String email){
        if(Helper.isNullOrEmpty(cellNumber) || Helper.isNullOrEmpty(homeNumber) || Helper.isNullOrEmpty(email)){
            return null;
        }

        return new Contact.Builder()
                .setCellNumber(cellNumber)
                .setHomeNumber(homeNumber)
                .setEmail(email)
                .build();
    }
}
