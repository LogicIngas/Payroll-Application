package za.ac.cput.util;

import java.util.UUID;

public class Helper {

    public static String generatedUUI() {
        return UUID.randomUUID().toString();
    }


    public static boolean isNullOrEmpty(String str){
        if(str.isEmpty() || str == null){
            return true;
        }
        return false;
    }

    public static boolean isValidNumber(int num){
        if(num < 0){
            return false;
        }
        return true;
    }
}
