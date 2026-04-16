package za.ac.cput.services.employment.impl;

import za.ac.cput.entity.employment.Employee;
import za.ac.cput.repository.employment.EmployeeRepository;
import za.ac.cput.repository.employment.Impl.EmployeeRepositoryImpl;
import za.ac.cput.services.employment.EmployeeService;

import java.util.List;


public class EmployeeServiceImpl implements EmployeeService {


    private static EmployeeRepository employeeRepository = null;
    public EmployeeServiceImpl(){
        employeeRepository = new EmployeeRepositoryImpl();
    }

    //Singleton
    private static EmployeeServiceImpl employeeService;

    public static EmployeeServiceImpl getEmployeeService() {
        if(employeeService == null){
            return employeeService = new EmployeeServiceImpl();
        }
        return employeeService;
    }



    @Override
    public Employee create(Employee employee) {
        return this.employeeRepository.create(employee);
    }

    @Override
    public Employee read(String s) {
        return this.employeeRepository.read(s);
    }

    @Override
    public Employee update(Employee employee) {
        return this.employeeRepository.update(employee);
    }

    @Override
    public boolean delete(String s) {
        return this.employeeRepository.delete(s);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.getAllEmployees();
    }

    @Override
    public List<Employee> getEmployeeByNationality(String nationality) {
        return this.employeeRepository.getEmployeeByNationality(nationality);
    }
}
