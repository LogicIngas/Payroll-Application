package za.ac.cput.services.demography.impl;

import za.ac.cput.entity.demography.Demography;
import za.ac.cput.repository.demography.DemographyRepository;
import za.ac.cput.repository.demography.impl.DemographyRepositoryRepositoryImp;
import za.ac.cput.services.demography.DemographyService;

import java.util.List;

public class DemographyServiceImpl implements DemographyService {

    private static DemographyServiceImpl demographyService = null;
    private static DemographyRepository demographyRepository;

    public static DemographyServiceImpl getDemographyService() {
        if(demographyService == null){
            return new DemographyServiceImpl();
        }
        return demographyService;
    }

    public DemographyServiceImpl() {
        demographyRepository = new DemographyRepositoryRepositoryImp();
    }

    @Override
    public Demography create(Demography demography) {
        return this.demographyRepository.create(demography);
    }

    @Override
    public Demography read(String s) {
        return this.demographyRepository.read(s);
    }

    @Override
    public Demography update(Demography demography) {
        return this.demographyRepository.update(demography);
    }

    @Override
    public boolean delete(String s) {
        return this.demographyRepository.delete(s);
    }

    @Override
    public List<Demography> getAll() {
        return this.demographyRepository.getAll();
    }

    @Override
    public List<Demography> getAllDemographyByEmpNumber(String employeeNumber) {
        return this.demographyRepository.getAllDemographyByEmpNumber(employeeNumber);
    }

    @Override
    public List<Demography> getAllDemographyByRaceId(String raceId) {
        return this.demographyRepository.getAllDemographyByRaceId(raceId);
    }
}
