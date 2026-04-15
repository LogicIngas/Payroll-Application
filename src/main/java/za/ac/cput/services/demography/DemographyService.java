package za.ac.cput.services.demography;

import za.ac.cput.entity.demography.Demography;
import za.ac.cput.services.IService;

import java.util.List;

public interface DemographyService extends IService<Demography, String> {
    List<Demography> getAll();
    List<Demography> getAllDemographyByEmpNumber(String employeeNumber);
    List<Demography> getAllDemographyByRaceId(String raceId);
}
