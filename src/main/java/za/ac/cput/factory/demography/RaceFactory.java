package za.ac.cput.factory.demography;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.util.Helper;

public class RaceFactory {
    public static Race createRace(String description){

        String raceId = Helper.generatedUUI();

        return new Race.Builder()
                .setRaceId(raceId)
                .setDescription(description)
                .build();
    }
}
