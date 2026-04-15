package za.ac.cput.repository.demography;

import za.ac.cput.entity.demography.Gender;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface GenderRepository extends IRepository<Gender, String> {
    List<Gender> getAll();
}
