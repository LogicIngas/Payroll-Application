package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayrollApplication.class,args);
    }

//    @GetMapping("/")
//    public static String hello(){
//        return "Hello Backend";
//    }
//
//        @GetMapping("/users")
//    public static String helloUsers(){
//        return "Hello users";
//    }
}