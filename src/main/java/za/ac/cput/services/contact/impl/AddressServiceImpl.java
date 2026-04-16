package za.ac.cput.services.contact.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.contact.Address;
import za.ac.cput.repository.contact.AddressRepository;
import za.ac.cput.repository.contact.impl.AddressRepositoryImpl;
import za.ac.cput.services.contact.AddressService;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private static AddressRepository addressRepository = null;
    private static AddressServiceImpl addressService;


    public AddressServiceImpl() {
        addressRepository = new AddressRepositoryImpl();
    }

    public static AddressServiceImpl getAddressService() {
        if(addressService == null){
            return addressService = new AddressServiceImpl();
        }
        return addressService;
    }

    @Override
    public Address create(Address address) {
        return this.addressRepository.create(address);
    }

    @Override
    public Address read(String s) {
        return this.addressRepository.read(s);
    }

    @Override
    public Address update(Address address) {
        return this.addressRepository.update(address);
    }

    @Override
    public boolean delete(String s) {
        return this.addressRepository.delete(s);
    }

    @Override
    public List<Address> getAllAddresses() {
        return this.addressRepository.getAllAddresses();
    }

    @Override
    public List<Address> getAllAddressByEmail(String email) {
        return this.addressRepository.getAllAddressByEmail(email);
    }
}
