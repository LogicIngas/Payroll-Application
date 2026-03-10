package za.ac.cput.factory;

import za.ac.cput.domain.Position;
import za.ac.cput.util.Helper;

public class PositionFactory {
    public static Position createPosition(String jobTitle, String status) {
        if (Helper.isNullOrEmpty(jobTitle) || Helper.isNullOrEmpty(status)) {
            return null;
        }
        return new Position.Builder()
                .setJobTitle(jobTitle)
                .setStatus(status)
                .build();
    }
}