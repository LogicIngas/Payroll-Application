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

    //do is valid number then after that do the testing
public static boolean isValidNumber(int number){
    if (number < 0){
        return false;
    }
    return true;
}


    public static boolean isValidEmail(String email) {
        return EmailValidator.getInstance().isValid(email);
    }
}