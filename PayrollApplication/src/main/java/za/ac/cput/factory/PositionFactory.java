package za.ac.cput.factory;

import za.ac.cput.domain.Position;
import za.ac.cput.util.Helper;

public class PositionFactory {

    public static Position createPosition(String positionCode, String jobTitle, String status) {
        if (Helper.isNullOrEmpty(positionCode) || Helper.isNullOrEmpty(jobTitle) || Helper.isNullOrEmpty(status)) {
            return null;
        }
        return new Position.Builder()
                .setPositionCode(positionCode)
                .setJobTitle(jobTitle)
                .setStatus(status)
                .build();
    }
}