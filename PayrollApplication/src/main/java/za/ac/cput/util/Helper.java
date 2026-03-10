package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty() || str.equalsIgnoreCase("null")) {
            return true;
        }
        return false;
    }


    public static boolean isValidEmail(String email) {
        return EmailValidator.getInstance().isValid(email);
    }
}