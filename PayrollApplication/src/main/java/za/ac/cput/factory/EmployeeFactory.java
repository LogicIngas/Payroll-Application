package za.ac.cput.factory;

import za.ac.cput.domain.AddressDetails;
import za.ac.cput.domain.ContactDetails;
import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;

public class EmployeeFactory {

    public static Employee createEmployee(String employeeNumber, String name, String employmentType,
                                          String nationality, ContactDetails contact, AddressDetails address) {

        if (Helper.isNullOrEmpty(employeeNumber) || Helper.isNullOrEmpty(name)) {
            return null;
        }

        return new Employee.Builder()
                .setEmployeeNumber(employeeNumber)
                .setName(name)
                .setEmploymentType(employmentType)
                .setNationality(nationality)
                .setContact(contact)
                .setAddress(address)
                .build();
    }

}