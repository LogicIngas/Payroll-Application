package za.ac.cput.repository;

import za.ac.cput.domain.Identity;

import java.util.List;

public interface IIdentityRepository extends IRepository<Identity, String> {
    List<Identity> getAll();
}
