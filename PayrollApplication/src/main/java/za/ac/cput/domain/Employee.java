package za.ac.cput.domain;

import java.util.Objects;

public class Employee {
    private String employeeNumber;
    private String name;
    private String employmentType; // Permanent or Contract
    private String nationality;
    private ContactDetails contact;
    private AddressDetails address;

    public Employee() {
    }

    private Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.name = builder.name;
        this.employmentType = builder.employmentType;
        this.nationality = builder.nationality;
        this.contact = builder.contact;
        this.address = builder.address;
    }

    // Getters
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }


    public String getEmploymentType() {
        return employmentType;
    }

    public String getNationality() {
        return nationality;
    }

    public ContactDetails getContact() {
        return contact;
    }

    public AddressDetails getAddress() {
        return address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeNumber, employee.employeeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber);
    }

    @Override
    public String toString() {
        return "Employee{" + "id='" + employeeNumber + '\'' + ", name='" + name + '\'' + '}';
    }

    public static class Builder {
        private String employeeNumber, name, employmentType, nationality;
        private ContactDetails contact;
        private AddressDetails address;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmploymentType(String employmentType) {
            this.employmentType = employmentType;
            return this;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder setContact(ContactDetails contact) {
            this.contact = contact;
            return this;
        }

        public Builder setAddress(AddressDetails address) {
            this.address = address;
            return this;
        }

        public Builder copy(Employee employee) {
            this.employeeNumber = employee.employeeNumber;
            this.name = employee.name;
            this.employmentType = employee.employmentType;
            this.nationality = employee.nationality;
            this.contact = employee.contact;
            this.address = employee.address;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}