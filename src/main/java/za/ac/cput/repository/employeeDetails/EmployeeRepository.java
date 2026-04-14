package za.ac.cput.repository.employeeDetails;

import za.ac.cput.entity.employment.Employee;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface EmployeeRepository extends IRepository<Employee, String> {
    List<Employee> getAllEmployees();
    List<Employee> getEmployeeByNationality(String nationality);
}
