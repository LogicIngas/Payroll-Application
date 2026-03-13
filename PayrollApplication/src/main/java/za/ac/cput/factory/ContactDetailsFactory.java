package za.ac.cput.factory;

import za.ac.cput.domain.ContactDetails;
import za.ac.cput.util.Helper;

public class ContactDetailsFactory {

    public static ContactDetails createContactDetails(String cellPhone, String email, String homeNumber) {

        if(Helper.isNullOrEmpty(cellPhone) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(homeNumber)) {
            return null;
        }

        if (!Helper.isValidEmail(email)) {
            return null;
        }
        return new ContactDetails.Builder()
                .setCellPhone(cellPhone)
                .setEmail(email)
                .setHomeNumber(homeNumber)
                .build();
    }
}