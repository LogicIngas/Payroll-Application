package za.ac.cput.domain;

import java.util.List;
import java.util.Objects;

public class Employee {
    private String employeeNumber;
    private String name;
    private String employmentType; // Permanent or Contract
    private String nationality;
    private ContactDetails contact;
    private AddressDetails address;
    private Position position;       // an employee can only fill one position at a time
    private List<Identity> identities; // an employee can have multiple identity types

    public Employee() {
    }

    private Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.name = builder.name;
        this.employmentType = builder.employmentType;
        this.nationality = builder.nationality;
        this.contact = builder.contact;
        this.address = builder.address;
        this.position = builder.position;
        this.identities = builder.identities;
    }

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

    public Position getPosition() {
        return position;
    }

    public List<Identity> getIdentities() {
        return identities;
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
        private Position position;
        private List<Identity> identities;

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

        public Builder setPosition(Position position) {
            this.position = position;
            return this;
        }

        public Builder setIdentities(List<Identity> identities) {
            this.identities = identities;
            return this;
        }

        public Builder copy(Employee employee) {
            this.employeeNumber = employee.employeeNumber;
            this.name = employee.name;
            this.employmentType = employee.employmentType;
            this.nationality = employee.nationality;
            this.contact = employee.contact;
            this.address = employee.address;
            this.position = employee.position;
            this.identities = employee.identities;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}