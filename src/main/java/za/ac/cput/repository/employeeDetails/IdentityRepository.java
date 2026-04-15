package za.ac.cput.repository.employeeDetails;

import za.ac.cput.entity.employment.Identity;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IdentityRepository extends IRepository <Identity, String>{
    List<Identity> getAllEmployees();
    List<Identity> getAllEmployeesByIdentity(String identity);
}
