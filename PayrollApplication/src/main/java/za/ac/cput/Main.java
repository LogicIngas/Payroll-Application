package za.ac.cput;

import za.ac.cput.domain.AddressDetails;
import za.ac.cput.domain.ContactDetails;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Identity;
import za.ac.cput.domain.Position;
import za.ac.cput.factory.AddressDetailsFactory;
import za.ac.cput.factory.ContactDetailsFactory;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.factory.IdentityFactory;
import za.ac.cput.factory.PositionFactory;
import za.ac.cput.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository repositoryDb = EmployeeRepository.getRepository();

        //Create ContactDetails and Address
        ContactDetails contact = ContactDetailsFactory.createContactDetails("0712345678", "inga@startup.com", "0215550000");
        AddressDetails address = AddressDetailsFactory.createAddressDetails("123 Adderley St", "8001");

        // Create a position and identities for employee1
        Position position1 = PositionFactory.createPosition("POS001", "Software Engineer", "CLOSED");
        List<Identity> identities = new ArrayList<>();
        identities.add(IdentityFactory.createIdentity("Passport", "ZG1234"));
        Employee emp1 = EmployeeFactory.createEmployee("EMP101", "Inga", "Permanent", "South African", contact, address, position1, identities);
        repositoryDb.create(emp1); //Execute our SQL statement in second year lol

        // Create a position and identities for employee2
        Position position2 = PositionFactory.createPosition("POS002", "Business Analyst", "CLOSED");
        List<Identity> identities2 = new ArrayList<>();
        identities2.add(IdentityFactory.createIdentity("ID Book", "8901155012082"));
        Employee emp2 = EmployeeFactory.createEmployee(
                "EMP102", "Lubanzi", "Contract", "Zimbabwe", contact, address, position2, identities2);
        repositoryDb.create(emp2);

        System.out.println("\u001B[1mSTARTUP PAYROLL SYSTEM: CURRENT EMPLOYEES\u001B[0m");

        List<Employee> allEmployees = repositoryDb.getAll();

        for (Employee e : allEmployees) {
            System.out.println("Employee Number: " + e.getEmployeeNumber() + " | Name: " + e.getName() + " | Type: " + e.getEmploymentType());
        }

        System.out.println("Total Employees Managed: " + allEmployees.size());

//        repositoryDb.getAll();
//        repositoryDb.delete("EMP101");
//        repositoryDb.update(emp1);

    }

}