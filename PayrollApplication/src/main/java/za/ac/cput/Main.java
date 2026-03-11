package za.ac.cput;

import za.ac.cput.domain.AddressDetails;
import za.ac.cput.domain.ContactDetails;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.AddressDetailsFactory;
import za.ac.cput.factory.ContactDetailsFactory;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.repository.EmployeeRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository db = EmployeeRepository.getRepository();

        // 2. Create some "Parts" for our Employee
        ContactDetails contact = ContactDetailsFactory.createContactDetails(
                "0712345678", "inga@startup.com", "0215550000");
        AddressDetails address = AddressDetailsFactory.createAddressDetails(
                "123 Adderley St", "8001");


        Employee emp1 = EmployeeFactory.createEmployee(
                "EMP101", "Inga", "Permanent", "South African", contact, address);

        db.create(emp1);

        Employee emp2 = EmployeeFactory.createEmployee(
                "EMP102", "Lubanzi", "Contract", "Zimbabwe", contact, address);
//        db.create(emp2);

        System.out.println("\u001B[1mSTARTUP PAYROLL SYSTEM: CURRENT EMPLOYEES\u001B[0m");

        List<Employee> allEmployees = db.getAll();

        for (Employee e : allEmployees) {
            System.out.println("Employee Number: " + e.getEmployeeNumber() + " | Name: " + e.getName() + " | Type: " + e.getEmploymentType());
        }

         System.out.println("Total Employees Managed: " + allEmployees.size());
    }
}