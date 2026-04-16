package za.ac.cput.controller.demography;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import za.ac.cput.entity.demography.Gender;
import za.ac.cput.services.demography.GenderService;

import java.util.List;

@Controller
public class GenderController {
    public GenderService genderService;

    @Autowired
    public GenderController(GenderService genderService) {
        this.genderService = genderService;
    }

    //CRUD

    @PutMapping("/create")
    public Gender createGender(Gender gender){
        return genderService.create(gender);
    }

    @GetMapping("/read/{generatedId}")
    public List<Gender> readGender(){
        return genderService.getAll();
    }

    @PostMapping("/update")
    public Gender updateGender(Gender gender){
        return genderService.update(gender);
    }

    @DeleteMapping("/delete")
    public boolean deleteGender(String genderId){
        return genderService.delete(genderId);
    }

}
