package za.ac.cput.repository.contact.impl;

import za.ac.cput.entity.contact.Address;
import za.ac.cput.repository.contact.AddressRepository;

import java.util.ArrayList;
import java.util.List;

public class AddressRepositoryImpl implements AddressRepository {

    List<Address> addressList;
    public AddressRepositoryImpl() {
        addressList = new ArrayList<>();
    }

    //singleton
    private static AddressRepositoryImpl addressRepository = null;

    private static AddressRepositoryImpl getAddressRepository() {
        if(addressRepository == null){
            addressRepository = new AddressRepositoryImpl();
        }
        return addressRepository;
    }

    @Override
    public Address create(Address address) {
        boolean success = addressList.add(address);
        if(success){
            return address; //not return success
        }
        return null;
    }

    @Override
    public Address read(String s) {
        for(Address address: addressList){
            if (address.getEmail().equalsIgnoreCase(s)){
                return address;
            }
        }
        return null;
    }

    @Override
    public Address update(Address address) {
        Address oldAddress = read(address.getEmail());
        if(oldAddress == null){
            return null;
        }
        addressList.remove(oldAddress);
        addressList.add(address);
        return address;
    }

    @Override
    public boolean delete(String s) {
        Address address = read(s);
        if(address == null){
            return false;
        }
        return addressList.remove(address);
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressList;
    }

    @Override
    public List<Address> getAllAddressByEmail(String email) {
        return List.of();
    }
}
