package za.ac.cput.repository.demography;

import za.ac.cput.entity.demography.Demography;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface DemographyRepository extends IRepository<Demography, String> {
    List<Demography> getAll();
    List<Demography> getAllDemographyByEmpNumber(String employeeNumber);
    List<Demography> getAllDemographyByRaceId(String raceId);
}
