package za.ac.cput.services.employeedetails;

import za.ac.cput.entity.employment.Employee;
import za.ac.cput.entity.employment.Identity;
import za.ac.cput.services.IService;

import java.util.List;

public interface IdentityService extends IService<Identity, String> {
    List<Identity> getAllEmployees();
    List<Identity> getAllEmployeesByIdentity(String identity);
}
