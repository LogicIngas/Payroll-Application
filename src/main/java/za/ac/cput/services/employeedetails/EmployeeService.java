package za.ac.cput.services.employeedetails;

import za.ac.cput.entity.employment.Employee;
import za.ac.cput.services.IService;

import java.util.List;

public interface EmployeeService extends IService<Employee, String> {
    List<Employee> getAllEmployees();
    List<Employee> getEmployeeByNationality(String nationality);
}
