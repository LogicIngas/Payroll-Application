package za.ac.cput.controller.demography;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import za.ac.cput.entity.demography.Demography;
import za.ac.cput.services.demography.DemographyService;

import java.util.List;

@Controller
public class DemographyController {
    public DemographyService demographyService;

    @Autowired
    public DemographyController(DemographyService demographyService) {
        this.demographyService = demographyService;
    }
    //CRUD

    @PutMapping("/create")
    public Demography createDemography(Demography demography){
        return demographyService.create(demography);
    }

    @GetMapping("/read/{employeeNumber}")
    public List<Demography> getDemography(){
        return demographyService.getAll();
    }

    @GetMapping("/read/{employeeNumber}")
    public List<Demography> getDemographyByEmployeeNumber(String empNumber){
        return demographyService.getAllDemographyByEmpNumber(empNumber);
    }

    @GetMapping("/read/{employeeNumber}")
    public List<Demography> getDemographyByEmail(String email){
        return demographyService.getAllDemographyByEmpNumber(email);
    }

    @PostMapping("/update")
    public Demography updateDemography(Demography demography){
        return demographyService.update(demography);
    }

    @DeleteMapping("/delete/{employeeNumber}")
    public boolean deleteDemography(String employeeNumber){
        return demographyService.delete(employeeNumber);
    }

}
