package za.ac.cput.services.contact;

import za.ac.cput.entity.contact.Address;
import za.ac.cput.services.IService;

import java.util.List;

public interface AddressService extends IService<Address,String> {
    List<Address> getAllAddresses();
    List<Address> getAllAddressByEmail(String email);
}
