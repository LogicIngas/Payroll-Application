package za.ac.cput.factory.contact;

import za.ac.cput.entity.contact.Address;
import za.ac.cput.util.Helper;

public class AddressFactory {
    public static Address createAddress(String streetAddress,String postalAddress,String email){
        if(Helper.isNullOrEmpty(streetAddress)|| Helper.isNullOrEmpty(postalAddress) || Helper.isNullOrEmpty(email)){
            return null;
        }

        return new Address.Builder()
                .setStreetAddress(streetAddress)
                .setPostalAddress(postalAddress)
                .setEmail(email)
                .build();
    }
}
