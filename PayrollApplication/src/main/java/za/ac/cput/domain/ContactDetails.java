package za.ac.cput.domain;

import java.util.Objects;

public class ContactDetails {
    private String cellPhone;
    private String email;
    private String homeNumber;

    public ContactDetails() {
    }

    private ContactDetails(Builder builder) {
        this.cellPhone = builder.cellPhone;
        this.email = builder.email;
        this.homeNumber = builder.homeNumber;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getEmail() {
        return email;
    }
    public String getHomeNumber() {
        return homeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContactDetails that = (ContactDetails) o;
        return Objects.equals(getCellPhone(), that.getCellPhone())
                &&Objects.equals(getEmail(), that.getEmail())
                && Objects.equals(getHomeNumber(), that.getHomeNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCellPhone(),
                getEmail(), getHomeNumber());
    }

    @Override
    public String toString() {
        return "ContactDetails{" + "email='" + email + '\'' + '}';
    }

    public static class Builder {
        private String cellPhone;
        private String email;
        private String homeNumber;

        public Builder setCellPhone(String cellPhone) {
            this.cellPhone = cellPhone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setHomeNumber(String homeNumber) {
            this.homeNumber = homeNumber;
            return this;
        }

        public Builder copy(ContactDetails contactDetails) {
            this.cellPhone = contactDetails.cellPhone;
            this.email = contactDetails.email;
            this.homeNumber = contactDetails.homeNumber;
            return this;
        }

        public ContactDetails build() {
            return new ContactDetails(this);
        }
    }
}