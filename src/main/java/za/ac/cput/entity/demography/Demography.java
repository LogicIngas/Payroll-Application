package za.ac.cput.entity.demography;

import java.util.Objects;

public class Demography {
    private String employeeNumber;
    private String generatedId;
    private String raceId;

    private Demography() {
    }

    public Demography(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.generatedId = builder.deneratedId;
        this.raceId = builder.raceId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getGeneratedId() {
        return generatedId;
    }

    public String getRaceId() {
        return raceId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Demography that = (Demography) o;
        return Objects.equals(employeeNumber, that.employeeNumber) &&
                Objects.equals(generatedId, that.generatedId) &&
                Objects.equals(raceId, that.raceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, generatedId, raceId);
    }

    @Override
    public String toString() {
        return "Demography{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", deneratedId='" + generatedId + '\'' +
                ", raceId='" + raceId + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeNumber;
        private String deneratedId;
        private String raceId;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setDeneratedId(String deneratedId) {
            this.deneratedId = deneratedId;
            return this;
        }

        public Builder setRaceId(String raceId) {
            this.raceId = raceId;
            return this;
        }

        public Builder copy(Demography demography){
            this.employeeNumber = demography.employeeNumber;
            this.deneratedId = demography.generatedId;
            this.raceId = demography.raceId;
            return this;
        }

        public Demography build(){
            return new Demography(this);
        }
    }
}
