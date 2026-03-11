package za.ac.cput.repository;

import za.ac.cput.domain.Identity;
import java.util.ArrayList;
import java.util.List;

public class IdentityRepository implements IIdentityRepository {
    private static IdentityRepository repository = null;
    private List<Identity> identityDB;

    private IdentityRepository() {
        identityDB = new ArrayList<>();
    }

    public static IdentityRepository getRepository() {
        if (repository == null) {
            repository = new IdentityRepository();
        }
        return repository;
    }

    @Override
    public Identity create(Identity identity) {
        boolean success = this.identityDB.add(identity);
        if (success) return identity;
        return null;
    }

    @Override
    public Identity read(String identityValue) {
        return identityDB.stream()
                .filter(i -> i.getIdentityValue().equalsIgnoreCase(identityValue))
                .findAny()
                .orElse(null);
    }

    @Override
    public Identity update(Identity identity) {
        Identity oldIdentity = read(identity.getIdentityValue());
        if (oldIdentity != null) {
            this.identityDB.remove(oldIdentity);
            this.identityDB.add(identity);
            return identity;
        }
        return null;
    }

    @Override
    public boolean delete(String identityValue) {
        Identity identityToDelete = read(identityValue);
        if (identityToDelete == null) {
            return false;
        }
        return this.identityDB.remove(identityToDelete);
    }

    @Override
    public List<Identity> getAll() {
        return identityDB;
    }
}