package za.ac.cput.factory.employeedetails;

import za.ac.cput.entity.employeedetails.Employment;
import za.ac.cput.entity.employeedetails.EmploymentType;
import za.ac.cput.util.Helper;

public class EmploymentFactory {
    public static Employment createEmployment(String employmentId, EmploymentType employmentType){
        if(Helper.isNullOrEmpty(employmentId)){
            return null;
        }
        return new Employment.Builder()
                .setEmploymentId(employmentId)
                .setEmploymentType(employmentType)
                .build();
    }
}
