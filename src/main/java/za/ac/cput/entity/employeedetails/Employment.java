package za.ac.cput.entity.employeedetails;

public class Employment {
    private String employmentId;
    private EmploymentType employmentType;

    private Employment() {
    }

    public Employment(Builder builder) {
        this.employmentId = builder.employmentId;
        this.employmentType = builder.employmentType;
    }

    public String getEmploymentId() {
        return employmentId;
    }

    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    @Override
    public String toString() {
        return "Employment{" +
                "employmentId='" + employmentId + '\'' +
                ", employmentType=" + employmentType +
                '}';
    }

    public static class Builder{
        private String employmentId;
        private EmploymentType employmentType;

        public Builder setEmploymentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }

        public Builder setEmploymentType(EmploymentType employmentType) {
            this.employmentType = employmentType;
            return this;
        }

        public Builder copy(Employment employment){
            this.employmentId = employment.employmentId;
            this.employmentType = employment.employmentType;
            return this;
        }

        public Employment build(){
            return new Employment(this);
        }
    }
}
