package za.ac.cput.factory;

import za.ac.cput.domain.Job;
import za.ac.cput.util.Helper;

public class JobFactory {
    public static Job createJob(String jobTitle) {
        if (Helper.isNullOrEmpty(jobTitle)) {
            return null;
        }
        return new Job.Builder().setJobTitle(jobTitle).build();
    }
}