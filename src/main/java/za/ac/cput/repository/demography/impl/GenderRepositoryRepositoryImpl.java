package za.ac.cput.repository.demography.impl;

import za.ac.cput.entity.demography.Gender;
import za.ac.cput.repository.demography.GenderRepository;

import java.util.ArrayList;
import java.util.List;

public class GenderRepositoryRepositoryImpl implements GenderRepository {
   List<Gender> genderList;

    public GenderRepositoryRepositoryImpl() {
        genderList =new ArrayList<>();
    }

    //Singleton
    private static GenderRepository repository = null;

    public static GenderRepository getRepository() {
        if(repository == null){
            return repository = new GenderRepositoryRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Gender create(Gender gender) {
        boolean success = genderList.add(gender);
        if(success){
            return gender;
        }
        return success;
    }

    @Override
    public Gender read(String s) {
        for (Gender gender: genderList){
            if(gender.getGeneratedId().equalsIgnoreCase(s)){
                return gender;
            }
        }
        return null;
    }

    @Override
    public Gender update(Gender gender) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<Gender> getAll() {
        return List.of();
    }
}
