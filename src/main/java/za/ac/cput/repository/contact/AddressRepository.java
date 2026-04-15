package za.ac.cput.repository.contact;

import za.ac.cput.entity.contact.Address;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface AddressRepository extends IRepository<Address,String> {
    List<Address> getAllAddresses();
    List<Address> getAllAddressByEmail(String email);
}
