package za.ac.cput.factory;

import za.ac.cput.domain.AddressDetails;
import za.ac.cput.domain.ContactDetails;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Identity;
import za.ac.cput.domain.Position;
import za.ac.cput.util.Helper;

import java.util.List;

public class EmployeeFactory {

    public static Employee createEmployee(String employeeNumber, String name, String employmentType,
                                          String nationality, ContactDetails contact, AddressDetails address,
                                          Position position, List<Identity> identities) {

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
                .setPosition(position)
                .setIdentities(identities)
                .build();
    }
}