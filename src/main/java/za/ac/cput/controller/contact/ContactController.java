package za.ac.cput.controller.contact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/contacts")
public class ContactController {

    @GetMapping("/contact/id")
    public String hello(){
        return "Hello to all contacts in this class section";
    }


}
