package za.ac.cput.controller.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import za.ac.cput.entity.contact.Address;
import za.ac.cput.services.contact.AddressService;

import java.util.List;

@Controller
public class AddressController {

    public AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    //CRUD

    @PutMapping("/create")
    public Address createAddress(Address address){
        return addressService.create(address);
    }

    @GetMapping("/read")
    public List<Address> readAddresses(){
        return addressService.getAllAddresses();
    }

    @GetMapping("/read/{email}")
    public List<Address> readAddressesByEmail(String email){
        return addressService.getAllAddressByEmail(email);
    }

    @PostMapping("/update/{email}") //not sure if we update the addess using the email or using the userId
    public Address updateAddress(Address address){
        return addressService.update(address);
    }

    @DeleteMapping("/delete/{email}")
    public boolean deleteEmail(String idDelete){
        return addressService.delete(idDelete);
    }
}
