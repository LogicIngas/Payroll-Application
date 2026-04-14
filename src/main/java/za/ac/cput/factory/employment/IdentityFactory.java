package za.ac.cput.factory.employment;

import za.ac.cput.entity.employment.Identity;
import za.ac.cput.util.Helper;

public class IdentityFactory {
    public static Identity createIdentity(String identityType, String description){
            if(Helper.isNullOrEmpty(identityType) || Helper.isNullOrEmpty(description)){
                return null;
            }

            return new Identity.Builder()
                    .setIdentityType(identityType)
                    .setDescription(description)
                    .build();
    }
}
