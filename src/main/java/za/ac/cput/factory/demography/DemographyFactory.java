package za.ac.cput.factory.demography;

import za.ac.cput.entity.demography.Demography;
import za.ac.cput.util.Helper;

public class DemographyFactory {
    public static Demography createDemography( String generatedId ,String raceId){//String employeeNumber,

        //Do the isNullOrEmpty, isValidNumber all in the Helper class in my free time

        String employeeNumber = Helper.generatedUUI();

        return new Demography.Builder()
                .setDeneratedId(generatedId)
                .setRaceId(raceId)
                .setEmployeeNumber(employeeNumber)
                .build();
    }
}
