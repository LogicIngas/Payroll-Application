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
        return null;
    }

    @Override
    public Gender read(String s) {
        for(Gender gender: genderList){
            if (gender.getGeneratedId().equalsIgnoreCase(s)){
                return gender;
            }
        }
        return null;
    }

    @Override
    public Gender update(Gender gender) {
        Gender oldGender = read(gender.getGeneratedId());
        if(oldGender == null){
            return null;
        }
        genderList.remove(oldGender);
        genderList.add(gender);
        return gender;
    }

    @Override
    public boolean delete(String s) {
        Gender gender = read(s);
        if(gender == null){
            return false;
        }
        return genderList.remove(s);
    }

    @Override
    public List<Gender> getAll() {
        return genderList;
    }
}
