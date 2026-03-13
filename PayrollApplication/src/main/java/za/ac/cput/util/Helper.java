package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

public class Helper {

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty() || str.equalsIgnoreCase("null");
    }

    public static boolean isValidNumber(int number) {
        return number >= 0;
    }

    public static boolean isValidEmail(String email) {
        return EmailValidator.getInstance().isValid(email);
    }
}