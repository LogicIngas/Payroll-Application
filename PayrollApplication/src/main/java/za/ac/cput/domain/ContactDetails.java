package za.ac.cput.domain;

import java.util.Objects;

public class ContactDetails {
    private String cellPhone;
    private String email;
    private String homeNumber;

    public ContactDetails() {}

    private ContactDetails(Builder builder) {
        this.cellPhone = builder.cellPhone;
        this.email = builder.email;
        this.homeNumber = builder.homeNumber;
    }

    public String getCellPhone() { return cellPhone; }
    public void setCellPhone(String cellPhone) { this.cellPhone = cellPhone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getHomeNumber() { return homeNumber; }
    public void setHomeNumber(String homeNumber) { this.homeNumber = homeNumber; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactDetails)) return false;
        ContactDetails that = (ContactDetails) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
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
            this.cellPhone = cellPhone; return this;
        }
        public Builder setEmail(String email) {
            this.email = email; return this;
        }
        public Builder setHomeNumber(String homeNumber) {
            this.homeNumber = homeNumber; return this;
        }
        public ContactDetails build() {
            return new ContactDetails(this);
        }
    }
}