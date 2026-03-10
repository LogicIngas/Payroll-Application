package za.ac.cput.factory;

import za.ac.cput.domain.AddressDetails;
import za.ac.cput.util.Helper;

public class AddressDetailsFactory {

    public static AddressDetails createAddressDetails(String streetAddress, String postalAddress) {
        if (Helper.isNullOrEmpty(streetAddress) || Helper.isNullOrEmpty(postalAddress)) {
            return null;
        }

        return new AddressDetails.Builder()
                .setStreetAddress(streetAddress)
                .setPostalAddress(postalAddress)
                .build();
    }
}