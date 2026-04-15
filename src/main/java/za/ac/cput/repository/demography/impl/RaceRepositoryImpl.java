package za.ac.cput.repository.demography.impl;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.repository.demography.GenderRepository;
import za.ac.cput.repository.demography.RaceRepository;

import java.util.ArrayList;
import java.util.List;

public class RaceRepositoryImpl implements RaceRepository {
    List<Race> raceList;

    public RaceRepositoryImpl() {
       raceList = new ArrayList<>();
    }

    //Singleton
    private static RaceRepository repository;

    private static RaceRepository getRepository() {
        return repository;
    }

    @Override
    public Race create(Race race) {
        boolean success = raceList.add(race);
        if(success){
            return race;
        }
        return null;
    }

    @Override
    public Race read(String s) {
        for(Race races: raceList){
            if(races.getRaceId().equalsIgnoreCase(s)){
                return races;
            }
        }
        return null;
    }

    @Override
    public Race update(Race race) {
        Race oldRace = read(race.getRaceId());
        if(oldRace == null){
            return null;
        }
        raceList.remove(oldRace);
        raceList.add(race);
        return race;
    }

    @Override
    public boolean delete(String s) {
        Race race = read(s);
            if(race == null){
                return false;
            }
        return raceList.remove(s);
    }

    @Override
    public List<Race> getAll() {
        return raceList;
    }
}
