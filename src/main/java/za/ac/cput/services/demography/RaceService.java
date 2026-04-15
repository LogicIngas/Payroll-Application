package za.ac.cput.services.demography;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.services.IService;

import java.util.List;

public interface RaceService extends IService<Race, String> {
    List<Race> getAll();
}
