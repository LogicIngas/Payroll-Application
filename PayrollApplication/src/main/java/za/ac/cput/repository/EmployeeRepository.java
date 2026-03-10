package za.ac.cput.repository;

import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Employee;
import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository implements IRepository<Employee, String> {
    private static EmployeeRepository repository = null;
    private Set<Employee> employeeDB = null;

    private EmployeeRepository() {
        employeeDB = new HashSet<>();
    }

    public static EmployeeRepository getRepository() {
        if (repository == null) repository = new EmployeeRepository();
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        this.employeeDB.add(employee);
        return employee;
    }

    @Override
    public Employee read(String empNum) {  // So I am guessing these are the lambda function
        return employeeDB.stream()
                .filter(e -> e.getEmployeeNumber().equals(empNum))
                .findAny()
                .orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmployee = read(employee.getEmployeeNumber());
        if (oldEmployee != null) {
            employeeDB.remove(oldEmployee);
            employeeDB.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String empNum) {
        Employee employeeToDelete = read(empNum);
        if (employeeToDelete == null) return false;
        employeeDB.remove(employeeToDelete);
        return true;
    }
}