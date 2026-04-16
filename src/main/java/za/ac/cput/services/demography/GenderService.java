package za.ac.cput.services.demography;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.demography.Gender;
import za.ac.cput.services.IService;

import java.util.List;

@Service
public interface GenderService extends IService<Gender, String> {
    List<Gender> getAll();
}
