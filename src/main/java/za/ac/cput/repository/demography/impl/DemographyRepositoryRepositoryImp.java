package za.ac.cput.repository.demography.impl;

import za.ac.cput.entity.demography.Demography;
import za.ac.cput.repository.demography.DemographyRepository;

import java.util.ArrayList;
import java.util.List;

public class DemographyRepositoryRepositoryImp implements DemographyRepository {
    List<Demography> demographyList;

    public DemographyRepositoryRepositoryImp() {
        demographyList = new ArrayList<>();
    }

    //Singleton
    private static DemographyRepositoryRepositoryImp repository = null;

    public static DemographyRepositoryRepositoryImp getRepository() {
        if(repository == null){
            return repository = new DemographyRepositoryRepositoryImp();
        }
        return repository;
    }

    @Override
    public Demography create(Demography demography) {
        boolean success = demographyList.add(demography);
        if(success){
            return demography;
        }
        return null;
    }

    @Override
    public Demography read(String s) {
        for(Demography demography: demographyList){
            if(demography.getEmployeeNumber().equalsIgnoreCase(s)){
                return demography;
            }
        }
        return null;
    }

    @Override
    public Demography update(Demography demography) {
        Demography oldDemography = read(demography.getEmployeeNumber());
        if(oldDemography == null){
            return null;
        }
        demographyList.remove(oldDemography);
        demographyList.add(demography);
        return demography;
    }

    @Override
    public boolean delete(String s) {
        Demography demography = read(s);
        if(demography == null) {
            return false;
        }
        return demographyList.remove(s);
    }

    @Override
    public List<Demography> getAll() {
        return demographyList;
    }

    @Override
    public List<Demography> getAllDemographyByEmpNumber(String employeeNumber) {
        return List.of();
    }

    @Override
    public List<Demography> getAllDemographyByRaceId(String raceId) {
        return List.of();
    }
}
