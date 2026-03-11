package za.ac.cput.factory;

import za.ac.cput.domain.Job;
import za.ac.cput.domain.Position;
import za.ac.cput.util.Helper;

import java.util.List;

public class JobFactory {

    public static Job createJob(String jobTitle, List<Position> positions) {
        if (Helper.isNullOrEmpty(jobTitle)) {
            return null;
        }
        return new Job.Builder()
                .setJobTitle(jobTitle)
                .setPositions(positions)
                .build();
    }
}