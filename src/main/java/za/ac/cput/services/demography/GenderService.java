package za.ac.cput.services.demography;

import za.ac.cput.entity.demography.Gender;
import za.ac.cput.services.IService;

import java.util.List;

public interface GenderService extends IService<Gender, String> {
    List<Gender> getAll();
}
