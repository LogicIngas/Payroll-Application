package za.ac.cput.repository.employeeDetails.Impl;

import za.ac.cput.entity.employment.Employee;
import za.ac.cput.entity.employment.Identity;
import za.ac.cput.repository.employeeDetails.IdentityRepository;

import java.util.ArrayList;
import java.util.List;

public class IdentityRepositoryImpl implements IdentityRepository {
    private List<Identity> identityList;
    private static IdentityRepositoryImpl repository = null;

    public IdentityRepositoryImpl() {
        this.identityList = new ArrayList<>();
    }

    public static IdentityRepositoryImpl getRepository() {
        if (repository == null) {
            repository = new IdentityRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Identity create(Identity identity) {
        if (identity == null) {
            return null;
        }
        boolean success = identityList.add(identity);
        if (success) {
            return identity;  // Return the identity, not true
        }
        return null;
    }

    @Override
    public Identity read(String s) {
        if (s == null || identityList == null) {
            return null;
        }
        for (Identity identity : identityList) {
            if (identity.getIdentityType().equalsIgnoreCase(s)) {
                return identity;
            }
        }
        return null;
    }

    @Override
    public Identity update(Identity identity) {
//        if (identity == null) return null;

        Identity oldIdentity = read(identity.getIdentityType());

        if (oldIdentity == null) {
            return null;
        }
        identityList.remove(oldIdentity);
        identityList.add(identity);
        return identity;
    }

    @Override
    public boolean delete(String s) {
        Identity toDelete = read(s);
        if (toDelete == null) {
            return false;
        }
        return identityList.remove(toDelete);
    }

    @Override
    public List<Identity> getAllEmployees() {
        return new ArrayList<>(identityList);
    }

    @Override
    public List<Identity> getAllEmployeesByIdentity(String identity) {
        List<Identity> result = new ArrayList<>();
        for (Identity id : identityList) {
            if (id.getIdentityType().equalsIgnoreCase(identity)) {
                result.add(id);
            }
        }
        return result;
    }
}