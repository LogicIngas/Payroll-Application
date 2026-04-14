package za.ac.cput.repository.employeeDetails.Impl;

import za.ac.cput.entity.employment.Employee;
import za.ac.cput.repository.employeeDetails.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
   //ArrayList
    List<Employee> employeeList;

    public EmployeeRepositoryImpl() {
        this.employeeList = new ArrayList<>();
    }

    //Singleton
    public static EmployeeRepositoryImpl repository = null;

    public static EmployeeRepositoryImpl getRepository() {
        if (repository == null) {
            repository = new EmployeeRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        boolean success = employeeList.add(employee);
        if(success){
            return employee;
        }
        return null;
    }

    @Override
    public Employee read(String s) {

        for(Employee employee: employeeList){
            if(employee.getNationality().equalsIgnoreCase(s)){
                return employee;
            }
        }
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmployee = read(employee.getEmployeeNumber());
        if(oldEmployee == null){
            return null;
        }

        employeeList.remove(oldEmployee);
        employeeList.add(employee);

        return employee;
    }

    @Override
    public boolean delete(String s) {
        Employee employee = read(s);
        if(employee == null){
            return false;
        }
        return employeeList.remove(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeeByNationality(String nationality) {
        List<Employee> result = new ArrayList<>();
        for(Employee employee: employeeList){
            if(employee.getNationality().equalsIgnoreCase(nationality)){
                result.add(employee);
            }
        }
        return result;
    }
}
