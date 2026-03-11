package za.ac.cput.repository;

import za.ac.cput.domain.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IRepository<Employee, String> {
    private static EmployeeRepository repository = null;
    private List<Employee> employeeList = null;

    private EmployeeRepository() {
        employeeList = new ArrayList<>();
    }

    public static EmployeeRepository getRepository() {
        if (repository == null) {
            repository = new EmployeeRepository();
        }
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        boolean success = this.employeeList.add(employee);
        if (success) return employee;
        return null;
    }

    @Override
    public Employee read(String empNum) { //lambda function.
        return employeeList.stream()
                .filter(e -> e.getEmployeeNumber().equals(empNum))
                .findAny()
                .orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmployee = read(employee.getEmployeeNumber());
        if (oldEmployee != null) {
            this.employeeList.remove(oldEmployee);
            this.employeeList.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String empNum) {
        Employee employeeToDelete = read(empNum);
        if (employeeToDelete == null) {
            return false;
        }
        return this.employeeList.remove(employeeToDelete);
    }

    public List<Employee> getAll() {
        return employeeList;
    }
}