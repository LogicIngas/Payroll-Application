package za.ac.cput.factory.demography;

import za.ac.cput.entity.demography.Gender;
import za.ac.cput.util.Helper;

public class GenderFactory {
    public static Gender createGender(String description){

        if(Helper.isNullOrEmpty(description)){
            return null;
        }

        String generatedId = Helper.generatedUUI();

        return new Gender.Builder()
                .setGeneratedId(generatedId)
                .setDescription(description)
                .build();
    }
}
