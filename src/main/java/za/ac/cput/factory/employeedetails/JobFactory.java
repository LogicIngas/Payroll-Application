package za.ac.cput.factory.employeedetails;

import za.ac.cput.entity.employeedetails.Job;
import za.ac.cput.util.Helper;

public class JobFactory {
    public static Job createJob(String jobTitle, String description){
        if(Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(description)){
            return null;
        }

        return new Job.Builder()
                .setJobTitle(jobTitle)
                .setDescription(description)
                .build();
    }
}
