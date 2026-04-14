package za.ac.cput.factory.employeedetails;

import za.ac.cput.entity.employeedetails.Position;
import za.ac.cput.entity.employeedetails.Status;
import za.ac.cput.util.Helper;

public class PositionFactory {
    public static Position createPosition(String positionCode, Status status){

        if(Helper.isNullOrEmpty(positionCode)){
            return null;
        }

        return new Position.Builder()
                .setPositionCode(positionCode)
                .setStatus(status)
                .build();
    }
}
