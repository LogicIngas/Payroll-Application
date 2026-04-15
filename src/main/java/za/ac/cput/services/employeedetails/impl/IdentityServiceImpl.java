package za.ac.cput.services.employeedetails.impl;

import za.ac.cput.entity.employment.Employee;
import za.ac.cput.entity.employment.Identity;
import za.ac.cput.repository.employeeDetails.IdentityRepository;
import za.ac.cput.repository.employeeDetails.Impl.IdentityRepositoryImpl;
import za.ac.cput.services.employeedetails.IdentityService;

import java.util.List;

public class IdentityServiceImpl implements IdentityService {

    private static IdentityServiceImpl identityService = null;

    public static IdentityServiceImpl getIdentityService() {
        if(identityService == null){
            return identityService = new IdentityServiceImpl();
        }
        return identityService;
    }

    private static IdentityRepository identityRepository;
    private IdentityServiceImpl() {
        identityRepository = new IdentityRepositoryImpl();
    }


    @Override
    public Identity create(Identity identity) {
        return this.identityRepository.create(identity);
    }

    @Override
    public Identity read(String s) {
        return this.identityRepository.read(s);
    }

    @Override
    public Identity update(Identity identity) {
        return this.identityRepository.update(identity);
    }

    @Override
    public boolean delete(String s) {
        return this.identityRepository.delete(s);
    }

    @Override
    public List<Identity> getAllEmployees() {
        return this.identityRepository.getAllEmployees();
    }

    @Override
    public List<Identity> getAllEmployeesByIdentity(String identity) {
        return this.identityRepository.getAllEmployeesByIdentity(identity);
    }
}
