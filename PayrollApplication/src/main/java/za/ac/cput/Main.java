package za.ac.cput;

import za.ac.cput.domain.AddressDetails;
import za.ac.cput.domain.ContactDetails;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.AddressDetailsFactory;
import za.ac.cput.factory.ContactDetailsFactory;
import za.ac.cput.factory.EmployeeFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        System.out.println("Hello Backend!");
        //Order of construction
//    1contactDetails

        ContactDetails c1 = ContactDetailsFactory.createContactDetails("123456789", "123456712@mycput.ac.za", "12");
//        System.out.println("Contact details: " + c1);
//    2.AddressDetails
        AddressDetails a1 = AddressDetailsFactory.createAddressDetails("Witsand", "Adderly");
//    3.Employee
        Employee e1 = EmployeeFactory.createEmployee("EMP123454252","Inga","Permanent","African",c1,a1);
//        System.out.println(e1);

           System.out.println("================ EMPLOYEE DETAILS ================");
            System.out.println("ID:          " + e1.getEmployeeNumber());
            System.out.println("Name:        " + e1.getName());
            System.out.println("Type:        " + e1.getEmploymentType());
            System.out.println("Nationality: " + e1.getNationality());

            System.out.println("\n--- Contact Info ---");
            System.out.println("Email:       " + e1.getContact().getEmail());
            System.out.println("Cell:        " + e1.getContact().getCellPhone());

            System.out.println("\n--- Address ---");
            System.out.println("Street:      " + e1.getAddress().getStreetAddress());
            System.out.println("Postal:      " + e1.getAddress().getPostalAddress());

    }
}
